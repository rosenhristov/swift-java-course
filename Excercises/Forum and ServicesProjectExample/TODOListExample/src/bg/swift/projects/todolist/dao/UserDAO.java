package bg.swift.projects.todolist.dao;

import bg.swift.projects.todolist.dal.DBManager;
import bg.swift.projects.todolist.dal.TableRow;
import bg.swift.projects.todolist.entities.User;

import java.sql.SQLException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;


public class UserDAO implements CrudDAO<User> {

    @Override
    public User getById(Integer id) {

        User returnUser = null;

        try (DBManager dbm = new DBManager(true)) {

            TableRow row = dbm.selectOne("SELECT * from users where id=" + id);

            returnUser = new User((Integer) row.getValue("id"),
                    row.getValue("username").toString(),
                    row.getValue("password").toString(),
                    new LinkedList<>(),
                    (Date) row.getValue("created_at"),
                    (Date) row.getValue("updated_at")
            );

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return returnUser;
    }
    public User findUserByUsernameAndPassword(String username, String password) {

        User returnUser = null;

        try (DBManager dbm = new DBManager(true)) {

            String selectQry = String.format("SELECT * from users where username='%s' AND password='%s'",
                    username, password);

            TableRow row = dbm.selectOne(selectQry);

            returnUser = new User((Integer) row.getValue("id"),
                    row.getValue("username").toString(),
                    row.getValue("password").toString(),
                    new LinkedList<>(),
                    (Date) row.getValue("created_at"),
                    (Date) row.getValue("updated_at")
            );

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return returnUser;
    }

    @Override
    public int insertNew(User u) {
        try (DBManager dbm = new DBManager(true)) {

            String query = buildInsertQuery(u);

            dbm.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return -1;
    }

    @Override
    public int update(User user) {
        // TODO Implement this
        return 0;
    }

    @Override
    public boolean delete(User user) {
        // TODO Implement this
        return false;
    }

    public String buildInsertQuery(User u) {
        List<String> fields = new LinkedList<>();
        List<String> values = new LinkedList<>();

        if (u.getId() != null) {
            fields.add("id");
            values.add(u.getId().toString());
        }
        if (u.getUsername() != null) {
            fields.add("username");
            values.add(String.format("'%s'", u.getUsername()));
        }
        if (u.getPassword() != null) {
            fields.add("password");
            values.add(String.format("'%s'", u.getPassword()));
        }

        fields.add("created_at");
        values.add("NOW()");

        return String.format("INSERT INTO users (%s) VALUES (%s)",
                String.join(", ", fields),
                String.join(", ", values));
    }
    public String buildUpdateQuery(User u) {
        List<String> setQuery = new LinkedList<>();

        if (u.getUsername() != null) {
            setQuery.add("username='" + u.getUsername() + "'");
        }
        if (u.getPassword() != null) {
            setQuery.add("password='" + u.getPassword() + "'");
        }
        setQuery.add("updated_at=NOW()");

        return String.format("UPDATE users SET %s WHERE id=%d",
                String.join(", ", setQuery),
                u.getId());
    }
}
