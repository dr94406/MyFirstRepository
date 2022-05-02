<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>form.jsp</title>
</head>
<body>
	<form name="frm" action="StudentGetServlet" method="get">
		<!--  get or post 방식 -->
		<input type="hidden" name="cmd" value="search">
		<!-- 히든타입은 안보이지만 파라메터에 넘어감 -->
		ID: <input type="number" name="user_id"><br> 
		Name: <input type="text" name="user_name"><br> 
		Eng: <input type="number" name="eng_score"><br>
		Kor: <input type="number" name="kor_score"><br> 
		<input type="submit" value="조회"> 
		<input id="addBtn" type="button" value="입력">
		<input id="modBtn" type="button" value="수정"> 
		<input id="delBtn" type="button" value="삭제"><br>
		<a href="/JSPProject/studentList.jsp">학생목록</a>
		<!--  다른기능 구현하고 싶을 시 파라메터 조정 -->
	</form>

	<script>
		// 한 건 수정기능.
		let modBtn = document.getElementById('modBtn');
		modBtn.addEventListener('click', function() {
			let frm = document.forms.frm;
			frm.method = "post"; // post방식
			frm.cmd.value = "mod"; // 값은 del
			frm.submit(); // submit버튼 클릭하는 기능.
		});
		
		// 한 건 삭제기능.
		let delBtn = document.getElementById('delBtn');
		delBtn.addEventListener('click', function() {
			let frm = document.forms.frm;
			frm.method = "post"; // post방식
			frm.cmd.value = "del"; // 값은 del
			frm.submit(); // submit버튼 클릭하는 기능.
		});
		
		// submit을 하면 넘기는 파라메터 값
		// 한 건 추가기능.
		let btn = document.querySelector('#addBtn'); // id값이 addBtn인 녀석의 요소 들고옴.
		btn.addEventListener('click', function() { // 클릭 시 이벤트 발생.
			let frm = document.forms.frm; // 폼 선택
			// 밑의 요소대로 변경.
			frm.action = "StudentGetServlet";
			frm.method = "post";
			frm.cmd.value = "add";

			frm.submit(); // form의 submit, 위의 refrm을 전송하겠다는 뜻.
		});
	
	</script>
</body>
</html>