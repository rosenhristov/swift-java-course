<%@ page import="bg.swift.projects.todolist.entities.User" %>
<%@ page import="bg.swift.projects.todolist.dao.TasksDAO" %>
<%@ page import="bg.swift.projects.todolist.entities.Task" %>
<%@ page import="bg.swift.projects.todolist.utils.DateUtils" %>
<%@ page import="bg.swift.projects.todolist.utils.ValidateUtils" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Task</title>
</head>
<body>
<%
    User loggedUser = (User) session.getAttribute("user");

    if (ValidateUtils.userIsNull(loggedUser)) {
%>
    <a href="loginForm.jsp">Login first</a>
<% } else {
    TasksDAO tasksDAO = new TasksDAO();

    String taskId = request.getParameter("id");

    Task task = tasksDAO.findTaskByIdAndUser(taskId, loggedUser);
    if (task != null) {
%>
        <h1>Update Task</h1>

        <form action="UpdateTaskServlet" method="POST">
            <input type="hidden" name="task_id" value="<%= task.getId() %>"/>

            Task: <textarea name="task" placeholder="Your task"><%= task.getTask() %></textarea>
            <br />
            Due Date: <input name="due_date" placeholder="dd/mm/yyyy hh:mm" value="<%= DateUtils.printDate(task.getDueDate()) %>" />

            <input type="submit" name="Update Task" value="Update Task">
        </form>
    <% } else { %>
        <h1>No Such Task Found</h1>
    <% } %>
<% } %>

</body>
</html>
