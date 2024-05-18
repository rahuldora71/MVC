<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page isELIgnored="false"%>

 <!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Help</title>
</head>
<body>
	<%
	String string = (String) request.getAttribute("name");
	%>
	<h1>This is help page</h1>
	<h1>
		Hello My name is
		<%=string%>
	</h1>
	<hr>
	<!-- get value using expression language -->
	<h1>Hello My name is ${name} </h1>
	<h1> Name List is ${list1} </h1>
	
</body>
</html>