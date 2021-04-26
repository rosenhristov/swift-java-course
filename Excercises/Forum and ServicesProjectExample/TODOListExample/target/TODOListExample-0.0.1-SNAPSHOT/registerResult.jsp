<%@ page import="bg.swift.projects.todolist.utils.StringUtils" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register Result</title>
</head>
<body>
<% if (StringUtils.isNullOrEmpty(request.getParameter("error"))) { %>
   <h1>Registration Successful</h1>
<% } else { %>
   <h1>Registration Failed</h1>
<% }%>
</body>
</html>
