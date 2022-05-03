<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>main.jsp</title>
</head>
<body>
	<% 
		String id = (String) session.getAttribute("id");

		if(id == null) { // id 가 null값이면 
			// out.print("<button onclick='location.href=\"session.jsp\"'>로그인</button>");																				
	%> 
		<h3>로그인 페이지로 이동</h3>
		<button onclick='location.href="session.jsp"'>로그인</button>
	<%
	} else {
			//out.print("<h3>로그인한 아이디는 " + id + "</h3><button onclick='location.href=\"logout.do\"'>로그아웃</button>");
	%>
		<h3>로그인한 아이디는 <%=id %>입니다.</h3>
		<button onclick='location.href="logout.do"'>로그아웃</button> <!-- href로 이동하면 "min" 이렇게 쌍따옴표 묶어주기. -->
	<% 
	}
	%>
	
</body>   	
</html>