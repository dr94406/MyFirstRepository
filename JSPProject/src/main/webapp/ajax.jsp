<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ajax.jsp</title>
</head>
<body>
	<script>
	 // Asynchronous Javascript And Xml. AJAX의 의미, 처리 방식을 비동기로한다는 뜻.
	 let url = 'StudentGetServlet';
	fetch(url) // url을 호출하여 fecth라는 url을 비동기방식으로 호출함.
	 	.then(result => {
	 		console.log(result);
	 		return result.json(); // {"id":23, "name":"hong"} // object타입의 json 형식의 data를 배열의 형태로 가져옴.
	 	})
	 	.then(result => {
	 		console.log(result); // 위의 object로 페이지를 만들어줌.
	 	})
	 	.catch(error => {
	 		console.log(error);
	 	})
		// console.log("ajax 콘솔창 확인용");
	</script>
</body>
</html>