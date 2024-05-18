<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="javax.swing.Spring"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home</title>
</head>
<body>
	<h1>This is Home page</h1>
	<h1>Called by home controller</h1>
	<h1>url /home</h1>
	
	<% 
	String name=(String)request.getAttribute("name");
	int id=(int)request.getAttribute("id");
	List<String> arr=(List<String>) request.getAttribute("list");
	for (String string : arr) {
		out.println("<h2>"+string+"</h2>");
	}
	%>
	<h1>Name is <%=name%></h1>
	<h1>Id is <%=id%></h1>
	
</body>
</html>