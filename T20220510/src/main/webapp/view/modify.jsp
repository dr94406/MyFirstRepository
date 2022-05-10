<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
</head>

<body>

	<h3>${error }</h3>

    <h3>도서수정조회</h3>
    <form action="../searchBook.do" method="get">
        <input type="text" name="bookCode"><br>
        <input type="hidden" name="job" value="modify">
        <input type="submit" value="Search">
    </form>
    
    <!-- 도서수정을 위한 화면 작성코드를 입력하세요. -->
	<c:choose>
	<c:when test="${!empty result }"><h3>${result }</h3></c:when>
	<c:otherwise>
	<h3>도서정보수정</h3>
	<form action="${pageContext.servletContext.contextPath }/modifyBook.do" method="post">
	도서코드: <input type = "text" name="bookCode" readonly value="${Book.bookCode }"><br> <!--  수정하지 못 하도록 readonly 적용. -->
	도서명: <input type = "text" name="bookTitle" value="${Book.bookTitle }"><br> <!--  수정하지 못 하도록 readonly 적용. -->
	도서저자: <input type = "text" name = "bookAuthor" value = "${Book.bookAuthor }"><br>
	도서출판사: <input type = "text" name="bookPress" value="${Book.bookPress }"><br>
	도서가격: <input type="text" name="bookPrice" value="${Book.bookPrice }"><br>
	<input type="submit" value="수정">
	</form>
	</c:otherwise>
	</c:choose>
    <a href="${pageContext.servletContext.contextPath }/index.jsp">첫페이지</a>

</body>

</html>