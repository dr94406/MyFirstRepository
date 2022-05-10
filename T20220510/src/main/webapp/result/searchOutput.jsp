<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h3>조회결과페이지</h3>
	<c:if test="${!empty result }">
		<h4>${result }</h4>
	</c:if>
	<c:if test="${!empty Book }">
		<h4>도서 코드 ${Book.bookCode }/ 도서 제목 ${Book.bookTitle } / 도서 저자 ${Book.bookAuthor } /
			도서 출판사 ${Book.bookPress } /도서 가격 ${Book.bookPrice }</h4>
	</c:if>
	<a href="${pageContext.servletContext.contextPath }/index.jsp">첫페이지</a>
</body>
</html>