<%@ page import="bg.swift.projects.todolist.utils.StringUtils" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update Task Result</title>
</head>
<body>
<% if (StringUtils.isNullOrEmpty(request.getParameter("error"))) { %>
    <h1>Update Task Successful</h1>
<% } else { %>
    <h1>Update Task Failed</h1>
<% } %>
    <a href="index.jsp">Go to Index</a>
</body>
</html>
