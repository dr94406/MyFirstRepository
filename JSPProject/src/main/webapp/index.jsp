<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jsp</title>
</head>
<body>
	<h3>반갑습니다. 이곳은 시작페이지입니다.</h3>
	<%
		// 자바코드(자바영역)
		String name = "형민이네 JSP";
	out.println("<h3>" + name+ "</h3>"); // out은 따로 선언하지 않지만, JSP안에 있는 내장 객체로 사용할 수 있다(이미 선언되어 있음).
	
		String id = request.getParameter("user_id"); // 이것도 내장객체이다,파라메터 안의 값을 읽어서 리턴해준다는 뜻. (name이 파라메터임) user_id를 받아옴.
		String name2 = request.getParameter("user_name"); // 위에서 이미 name을 선언했으니, name2. user_name을 받아온다.
		//out.println("<h4> 입력값: " + id + ", name: " + name2 + "</h4>"); // 이곳에서 입력한 값을 form.jsp를 run on 하여 index.jsp로 값을 전송한다.
	%>
	
	<a href="./form.jsp">메인 화면</a> <!--  한 단계 상위로 갈 때는 ..을 사용하여 상위폴더로 이동 현재폴더에서 위치는 .을 사용, 경로를 눈으로 잘 익히자. -->
</body>
</html>