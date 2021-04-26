package bg.swift.projects.todolist.rest;

import bg.swift.projects.todolist.dao.TasksDAO;
import bg.swift.projects.todolist.dao.UserDAO;
import bg.swift.projects.todolist.entities.Task;
import bg.swift.projects.todolist.entities.User;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by Anatoli.
 */
@Path("/users")
public class UsersResource {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Path("/{userId}/")
    public User getById(@PathParam("userId") Integer userId) {

        UserDAO userDAO = new UserDAO();

        User foundUser = userDAO.getById(userId);
        if (foundUser != null) {

            TasksDAO tasksDAO = new TasksDAO();
            List<Task> tasksList = tasksDAO.findTasksByUser(foundUser, false);
            foundUser.setTasks(tasksList);

            return foundUser;
        }

        return null;
    }

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Path("/{userId}")
    public User updatePassword(@PathParam("userId") Integer userId, User inUserData) {
        UserDAO userDAO = new UserDAO();

        User foundUser = userDAO.getById(userId);
        if (foundUser != null) {

            if (inUserData != null) {
                foundUser.setPassword(inUserData.getPassword());

                // TODO UPDATE IN DATABASE VIA DAO
                // something like userDAO.update(foundUser)
            }

            return foundUser;
        }

        return null;
    }
}
