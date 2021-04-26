package bg.swift.projects.todolist.servlets;

import bg.swift.projects.todolist.dao.TasksDAO;
import bg.swift.projects.todolist.entities.Task;
import bg.swift.projects.todolist.entities.User;
import bg.swift.projects.todolist.utils.DateUtils;
import bg.swift.projects.todolist.utils.StringUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Anatoli.
 */
@WebServlet("/AddNewTaskServlet")
public class AddNewTaskServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String task = request.getParameter("task");
        String dueDate = request.getParameter("due_date");
        User loggedUser = (User) request.getSession().getAttribute("user");

        if (StringUtils.isNotNullOrEmpty(task)
                && DateUtils.isDateValidFormat(dueDate)
                && loggedUser != null) {

            TasksDAO tasksDAO = new TasksDAO();
            Task newTask = new Task(null, task, DateUtils.parseDate(dueDate), "NEW", loggedUser, null, null);
            int newTaskId = tasksDAO.insertNew(newTask);

            if (newTaskId > 0) {
                response.sendRedirect("addTaskResult.jsp?success=1");
            } else {
                response.sendRedirect("addTaskResult.jsp?error=1");
            }
        } else {
            response.sendRedirect("addTaskResult.jsp?error=1");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Do not use GET to send data to server.");
    }
}
