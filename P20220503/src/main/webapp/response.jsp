<%@page import="co.edu.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>response.jsp</title>
</head>
<body>
	<%
		String id = (String) request.getAttribute("id");// object타입 -> String 타입 형변환.
		String name = (String) request.getAttribute("name");
		Student student = (Student) request.getAttribute("result");
	%>
	
	<h3>id: <%=id %></h3>
	<h3>name: <%=name %></h3>
</body>
</html>