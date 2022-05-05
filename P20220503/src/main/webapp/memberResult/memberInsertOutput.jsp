<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberResult/memberInsertOutput.jsp</title>
</head>
<body>
	<!--<h3><%=(String) request.getAttribute("name")%>님 가입이 완료되었습니다.</h3>-->
	<h3>${name }님 가입이 완료되었습니다.</h3> <!--  이런식으로 예약어를 써야 더 간편하고 좋다. 밑의 방법을 포함한 두 가지 방법이 있다. -->
	<jsp:include page="home.jsp"></jsp:include>
	<!--<%@include file="home.jsp" %> --> <!-- 이 방법도 사용가능.. -->
	<!--  스트링으로 형변환 -->
</body>
</html>