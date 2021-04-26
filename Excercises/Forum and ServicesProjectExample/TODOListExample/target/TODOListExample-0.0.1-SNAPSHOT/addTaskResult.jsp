<%@ page import="bg.swift.projects.todolist.utils.StringUtils" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Add Task Result</title>
</head>
<body>
<% if (StringUtils.isNullOrEmpty(request.getParameter("error"))) { %>
    <h1>Add Task Successful</h1>
<% } else { %>
    <h1>Add Task Failed</h1>
<% }%>

Go to <a href="index.jsp">index</a> page
</body>
</html>
