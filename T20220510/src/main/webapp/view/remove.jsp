<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>

<body>

	<h3>${error }</h3>

    <h3>도서삭제조회</h3>
    <form action="../searchBook.do" method="get">
        <input type="text" name="bookCode" id=""><br>
        <input type="hidden" name="job" value="remove">
        <input type="submit" value="Search">
        
    </form>

    <!-- 도서삭제를 위한 화면 작성코드를 입력하세요. -->
<c:choose>
	<c:when test="${!empty result }"><h3>${result }</h3></c:when>
	<c:otherwise>
	<h3>삭제할 도서 정보</h3>
	<form action="${pageContext.servletContext.contextPath }/removeBook.do" method="post">
	도서코드: <input type = "text" name="bookCode"  value="${Book.bookCode }"><br> <!--  수정하지 못 하도록 readonly 적용. -->
	
	<input type="submit" value="delete">
	</form>
	</c:otherwise>
	</c:choose>
    <a href="${pageContext.servletContext.contextPath }/index.jsp">첫페이지</a>

</body>
</html>