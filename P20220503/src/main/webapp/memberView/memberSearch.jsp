<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberView/memberSearch.jsp</title>
</head>
<body>
	${error  }
	<h3>회원정보검색</h3>
	<form action="${pageContext.servletContext.contextPath }/memberSearch.do" method="get">
		<!--상위경로로 이동하기 위해  -->
		조회 아이디: <input type="text" name="id"><br> 
		<input type="hidden" name="job" value="search">
		<!-- 히든 속성으로 job을 search값으로 넘김 -->
		<input type="submit" value="Search">
	</form>
	<jsp:include page="home.jsp"></jsp:include>
</body>
</html>