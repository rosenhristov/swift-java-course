<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Register User</title>
</head>
<body>
<h1>Register New User</h1>

<form action="RegisterServlet" method="POST">
    Username: <input type="text" name="username"/>
    Password: <input type="password" name="password"/>
    Confirm Password: <input type="password" name="cpassword"/>
    <input type="submit" name="Register" value="Register" />
</form>


</body>
</html>