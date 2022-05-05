<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>memberView/memberDelete.jsp</title>
</head>
<body>
	${error  }
	<h3>회원삭제검색</h3>
	<form action="${pageContext.servletContext.contextPath }/memberSearch.do" method="get">
		<!--상위경로로 이동하기 위해  -->
		조회 아이디: <input type="text" name="id"><br> 
		<input type="hidden" name="job" value="delete">
		<!-- 히든 속성으로 job을 search값으로 넘김 -->
		<input type="submit" value="Search">
	</form>
		
	<c:choose>
	<c:when test="${!empty result }"><h3>${result }</h3></c:when>
	<c:otherwise>
	<h3>회원정보삭제</h3>
	<form action="${pageContext.servletContext.contextPath }/memberDelete.do" method="post">
	아이디: <input type = "text" name="id"  value="${member.id }"><br> <!--  수정하지 못 하도록 readonly 적용. -->
	<input type="submit" value="delete">
	</form>
	</c:otherwise>
	</c:choose>
	<jsp:include page="home.jsp"></jsp:include>
</body>
</html>