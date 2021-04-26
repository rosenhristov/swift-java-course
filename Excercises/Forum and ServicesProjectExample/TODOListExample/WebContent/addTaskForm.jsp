<%@ page import="bg.swift.projects.todolist.utils.StringUtils" %>
<%@ page import="bg.swift.projects.todolist.entities.User" %>
<%@ page import="bg.swift.projects.todolist.utils.ValidateUtils" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Task Form</title>
</head>
<body>
<%
    User user = (User) session.getAttribute("user");

    if (ValidateUtils.userIsNull(user)) {
%>
    <a href="loginForm.jsp">Login first</a>
<% } else { %>

    <h1>Add New Task</h1>

    <form action="AddNewTaskServlet" method="POST">

        Task: <textarea name="task" placeholder="Your task"></textarea>
        <br />
        Due Date: <input name="due_date" placeholder="dd/mm/yyyy hh:mm" />

        <input type="submit" name="Add New Task" value="Add New Task" />
    </form>

<% } %>

</body>
</html>
