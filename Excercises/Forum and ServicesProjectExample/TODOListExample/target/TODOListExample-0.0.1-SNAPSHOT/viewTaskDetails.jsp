<%@ page import="bg.swift.projects.todolist.entities.User" %>
<%@ page import="bg.swift.projects.todolist.entities.Task" %>
<%@ page import="bg.swift.projects.todolist.dao.TasksDAO" %>
<%@ page import="bg.swift.projects.todolist.utils.DateUtils" %>
<%@ page import="bg.swift.projects.todolist.utils.ValidateUtils" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Task Details</title>
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
        <h1>View Details</h1>

        Task: <%= task.getTask() %>
        <br/>
        Due Date: <%= DateUtils.printDate(task.getDueDate()) %>

        <br/>
        <a href="updateTaskForm.jsp?id=<%= task.getId()%>">Update Task</a>
    <% } else { %>
        <h1>No Such Task Found</h1>
    <% } %>
<% } %>
</body>
</html>
