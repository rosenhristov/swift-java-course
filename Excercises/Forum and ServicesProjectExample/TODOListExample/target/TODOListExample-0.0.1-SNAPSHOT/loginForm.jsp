<%@ page import="bg.swift.projects.todolist.utils.StringUtils" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login Form</title>
</head>
<body>

<h1>Login</h1>

<form action="LoginServlet" method="POST">
    Username: <input type="text" name="username" value="<%= StringUtils.setNotNull(request.getParameter("username")) %>"/>
    Password: <input type="password" name="password"/>
    <input type="submit" name="Login" value="Login" />
</form>


</body>
</html>
