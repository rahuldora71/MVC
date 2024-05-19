<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>About</title>
</head>
<body>
<h1>Welcome, ${user.userName} To Dora Technology</h1>
<h1>Your email address is ${user.email}</h1>
<h1>Your password is ${user.password}</h1>
<hr>
<h2>${dora}</h2>
<h2>${des}</h2>
</body>
</html>
