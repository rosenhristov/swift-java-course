<%@ page import="bg.swift.projects.todolist.entities.User" %>
<%@ page import="bg.swift.projects.todolist.entities.LoginStatus" %>
<%@ page import="bg.swift.projects.todolist.entities.Task" %>
<%@ page import="bg.swift.projects.todolist.utils.DateUtils" %>
<%@ page import="bg.swift.projects.todolist.utils.ValidateUtils" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>TODO List Example</title>
</head>
<body>

<h1>TODO List Example</h1>

<%
    User user = (User) session.getAttribute("user");

    if (ValidateUtils.userIsNull(user)) {
%>
    <a href="loginForm.jsp">Login first</a>
<% } else {
    user.updateTasks();
%>
<h2>Welcome, <%= user.getUsername() %>!</h2>

    <% if (user.getTasks().isEmpty()) { %>
        <h3>No current tasks! Please <a href="addTaskForm.jsp">add</a> some.</h3>
    <% } else { %>
        <h3>Here is a list of your tasks: </h3>
        <% for (Task currentTask : user.getTasks()) { %>
            Task: <%= currentTask.getTask() %> due to <%= DateUtils.printDate(currentTask.getDueDate()) %> <a href="viewTaskDetails.jsp?id=<%= currentTask.getId() %>">View</a>
            <br/>
        <% } %>
    <% } %>

    <br /> <br />
    <a href="addTaskForm.jsp">Add Tasks</a>
    <br /> <br />
    <a href="LogoutServlet">Logout</a>
<% } %>

</body>
</html>