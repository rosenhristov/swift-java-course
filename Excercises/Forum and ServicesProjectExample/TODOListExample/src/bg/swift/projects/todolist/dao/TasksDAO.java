package bg.swift.projects.todolist.dao;

import bg.swift.projects.todolist.dal.DBManager;
import bg.swift.projects.todolist.dal.TableRow;
import bg.swift.projects.todolist.entities.Task;
import bg.swift.projects.todolist.entities.User;
import bg.swift.projects.todolist.utils.DateUtils;


import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Anatoli.
 */
public class TasksDAO implements CrudDAO<Task> {

    @Override
    public int insertNew(Task task) {
        try (DBManager dbm = new DBManager(true)) {

            String query = buildInsertQuery(task);

            return dbm.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public Task getById(Integer id) {
        Task task = null;
        try (DBManager dbm = new DBManager(true)) {
            String selectQry = String.format("SELECT * FROM tasks WHERE id='%s'", id);

            TableRow row = dbm.selectOne(selectQry);
            // TODO try to find the user of the task and set it as User object
            task = new Task(
                    (Integer) row.getValue("id"),
                    row.getValue("task").toString(),
                    (Date) row.getValue("due_date"),
                    null,
                    null,
                    (Date) row.getValue("created_at"),
                    (Date) row.getValue("update_at"));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return task;
    }

    public List<Task> findTasksByUser(User user, boolean setOwner) {
        List<Task> ret = new LinkedList<>();
        try (DBManager dbm = new DBManager(true)) {
            String selectQry = String.format("SELECT * FROM tasks WHERE user_id='%s' ORDER BY due_date",
                    user.getId());

            List<TableRow> rows = dbm.selectMany(selectQry);
            for (TableRow row : rows) {
                Task task = new Task(
                        (Integer) row.getValue("id"),
                        row.getValue("task").toString(),
                        (Date) row.getValue("due_date"),
                        null,
                        setOwner ? user : null,
                        (Date) row.getValue("created_at"),
                        (Date) row.getValue("update_at")
                );

                ret.add(task);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return ret;
    }

    public List<Task> findTasksByUser(User user) {
        return findTasksByUser(user, true);
    }

    public Task findTaskByIdAndUser(String taskId, User loggedUser) {

        Task task = null;
        try (DBManager dbm = new DBManager(true)) {
            String selectQry = String.format("SELECT * FROM tasks WHERE id='%s' AND user_id='%s'",
                    taskId,
                    loggedUser.getId());

            TableRow row = dbm.selectOne(selectQry);
            task = new Task(
                    (Integer) row.getValue("id"),
                    row.getValue("task").toString(),
                    (Date) row.getValue("due_date"),
                    null,
                    loggedUser,
                    (Date) row.getValue("created_at"),
                    (Date) row.getValue("update_at"));
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return task;
    }

    public int update(Task task) {
        try (DBManager dbm = new DBManager(true)) {

            String query = buildUpdateQuery(task);

            return dbm.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public boolean delete(Task task) {
        return false;
    }

    public String buildInsertQuery(Task task) {
        List<String> fields = new LinkedList<>();
        List<String> values = new LinkedList<>();

        if (task.getId() != null) {
            fields.add("id");
            values.add(task.getId().toString());
        }
        if (task.getOwner() != null) {
            fields.add("user_id");
            values.add(String.format("%s", task.getOwner().getId()));
        }
        if (task.getTask() != null) {
            fields.add("task");
            values.add(String.format("'%s'", task.getTask()));
        }
        if (task.getDueDate() != null) {
            fields.add("due_date");
            values.add(String.format("'%s'", DateUtils.toMySQLDate(task.getDueDate())));
        }

        fields.add("created_at");
        values.add("NOW()");

        return String.format("INSERT INTO tasks (%s) VALUES (%s)",
                String.join(", ", fields),
                String.join(", ", values));
    }

    public String buildUpdateQuery(Task task) {
        List<String> setQuery = new LinkedList<>();

        if (task.getTask() != null) {
            setQuery.add("task='" + task.getTask() + "'");
        }
        if (task.getOwner() != null) {
            setQuery.add("user_id=" + task.getOwner().getId());
        }
        if (task.getDueDate() != null) {
            setQuery.add("due_date='" + DateUtils.toMySQLDate(task.getDueDate()) + "'");
        }
        setQuery.add("updated_at=NOW()");

        return String.format("UPDATE tasks SET %s WHERE id=%d",
                String.join(", ", setQuery),
                task.getId());
    }

}
