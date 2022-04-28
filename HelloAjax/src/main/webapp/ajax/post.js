
document.addEventListener('DOMContentLoaded', init); // 함수를 다큐먼트가 로밍되면 실행.

// 리스트 .
function init() {
	let xhtp = new XMLHttpRequest();
	xhtp.open('get', '../studentList.json'); // 입력한 데이터를 받아옴.
	xhtp.send();
	xhtp.onload = function() {
		let data = JSON.parse(xhtp.responseText); // 넘겨받아온 json -> object 변경. 이곳에서 오류가 나면, 만들어둔 제이슨 데이터가 잘못된것이다.
		console.log(data); // 데이터라지만, 사실은 배열이다.
		let tbodyList = document.getElementById('list'); // list라는 tbody태그의 하위에 밑의 요소를 붙혀넣음.
		data.forEach(function(elem) { // 요소 1 
			//	console.log(data);
			let newTr = makeTr(elem); // 요소 2  
			tbodyList.appendChild(newTr); // 요소 3
		})
	}// end of onload

	let modBtn = document.querySelector('input[type=button]');
	modBtn.addEventListener('click', function() {

	})
} // end of init()

let modBtn = document.querySelector('input[type=button]');
modBtn.addEventListener('click', function() {
	let no = document.querySelector('input[name=sno]').value;
	let name = document.querySelector('input[name=sname]').value;
	let eScore = document.querySelector('input[name=eScore]').value;
	let kScore = document.querySelector('input[name=kScore]').value;

	let xhtp = new XMLHttpRequest();
	xhtp.open('get', `ModStudentServlet?a=${no}&b=${name}&c=${eScore}&d=${kScore}`);
	xhtp.send();
	xhtp.onload = function() {
		console.log(xhtp.responseText)
		let result = JSON.parse(xhtp.responseText);
		if (result.retCode == 'Success') {
		alert(result.studentNo + '번이 수정되었습니다.');
			// 결과값으로 받은 값을 => 새로운 tr.
			let obj = {
				studentNo: result.studentNo,
				studentName: result.studentName,
				engScore: result.engScore,
				korScore: result.korScore
			}
			let newTr = makeTr(obj);
			let oldTr = document.getElementById(result.studentNo);
			document.getElementById('list').replaceChild(newTr, oldTr); // 새로운 tr =>
		} else {
			alert('변경 중 오류.')
		}
	}
});
 // end of init()
// 변경처리.
function modStudent() {

}

// 한 건 추가하는 구문
function addStudent(e) { // e라는 변수를 받아서 Student 값 추가하는 기능.
	e.preventDefault(); // 기본기능을 submit(전송) 차단.
	console.log(e); // 콘솔로 값 찍히는지 확인.

	// 밑에 변수로 선언한 값들을 함께 넣어야, 파라메터가 값을 반환받아서 넘긴다.
	let no = document.querySelector('input[name="sno"]').value;
	let name = document.querySelector('input[name="sname"]').value;
	let eng = document.querySelector('input[name="eScore"]').value;
	let kor = document.querySelector('input[name="kScore"]').value;
	// 한 건 추가하는 구문 끝

	// 서버 연결 및 파일요청 로딩 구문 
	let xhtp = new XMLHttpRequest(); // 비동기방식으로 서버의 파일요청. (객체생성)
	xhtp.open('get', `addStudentServlet?sno=${no}&sname=${name}&eScore=${eng}&kScore=${kor}`); // 서버의 파일안에 넣을 값을 열음.
	xhtp.send(); // 서버에 요청 보내기
	xhtp.onload = function() {
		console.log(xhtp.responseText); // {"retCode":"Success"0} 성공하면 결과값을 들고오는 구문
		let result = JSON.parse(xhtp.responseText); // {retCode: "Success"}
		if (result.retCode == 'Success') {
			// 리스트 새로운 값 추가.
			successCallBack2(result); // {retCode:?, studNo:?, studName:?, escore:?, kscore:?} // result안에 든 값.
		} else if (result.retCode == 'Fail') {
			// 처리중 에러가 발생.
			failCallBack();
		}
	}	// end of function()
} // end of addStudent (e)
// 서버 연결 및 파일요청 로딩 구문 끝

//  테이블 생성 구문
function makeTr(student) {// 밑은 makeTr 실행구문.
	let tr = document.createElement('tr'); // tr태그 생성
	tr.setAttribute('id', student.studentNo); // 라인삭제를위해 id를 지정 => getElementById(id).remove(); 삭제.
	console.log(student);
	for (let field in student) { // student['studNo'] // 이 필드 안에 학생이 있다면
		let td = document.createElement('td'); // td태그 생성
		td.innerHTML = student[field]; // td를 html방식으로 표현 (스튜던트 안의 필드를 보여줌)
		tr.appendChild(td); // tr안에 td라는 자식요소를 넣어줌.
	} // 테이블 생성 구문 끝

	// 삭제버튼 구문
	let delBtn = document.createElement('button'); // <button></button>
	delBtn.innerHTML = '삭제';
	// 삭제버튼 구문 끝

	// 이벤트 실행 시 삭제되는 이벤트 등록 구문
	delBtn.addEventListener('click', function() {

		// 삭제(id파악 => ajax호출.) : this => 이벤트 대상엘리먼트.
		let id = this.parentElement.parentElement.firstChild.innerHTML;
		console.log(id);
		let xhtp = new XMLHttpRequest();
		xhtp.open('get', 'delStudentServlet?delId=' + id);
		xhtp.send();
		xhtp.onload = function() {
			let result = JSON.parse(xhtp.responseText);
			if (result.retCode == 'OK') {
				alert(result.retVal + '번이 삭제되었습니다.');
				document.getElementById(result.retVal).remove();
			} else {
				console.log(result.retVal);
			}
		}
	}); // 이벤트 실행 시 삭제되는 이벤트 등록 구문

	// 삭제버튼 테이블 td구현 구문 
	let td = document.createElement('td'); // <td></td>
	td.appendChild(delBtn); // <td><button>삭제</button></td>
	tr.appendChild(td);

	return tr;
	// 삭제버튼 테이블 td구현 구문

} // end of makeTr(student)

// 입력한 값을 CallBack2 안의 retObj에 넣어 호출하는 구문
function successCallBack2(retObj) {
	console.log(retObj);
	let obj = {
		studentNo: retObj.studentNo,
		studentName: retObj.studentName,
		engScore: retObj.engScore,
		korScore: retObj.korScore
	}
	document.getElementById('list').appendChild(makeTr(obj)); //tr을 바로 만들어서 삽입해도됨.
} // 입력한 값을 CallBack2 안의 retObj에 넣어 호출하는 구문 끝

// 입력한 값을 CallBack 안의 retObj에 넣어 호출하는 구문 끝
function successCallBack() { // 밑의 요소들은, addStudent 안에도 꼭 넣어야함.
	// 사용자 입력값을 id='list'에 밑의 let으로 선언한 요소들을 하위에 추가.
	let no = document.querySelector('input[name="sno"]').value;
	let name = document.querySelector('input[name="sname"]').value;
	let eng = document.querySelector('input[name="eScore"]').value;
	let kor = document.querySelector('input[name="kScore"]').value;
	// obj 변수안에 값을 담을 배열 선언.
	let obj = {
		studNo: no,
		studName: name,
		engScore: eng,
		korScore: kor
	};
	let row = makeTr(obj); // row라는 변수 안에 obj 요소를 담음. 테이블 안에 데이터 넣기.
	document.getElementById('list').appendChild(row); // id로 지정한 list안에 자식요소인 row를 넣어 화면으로 출력해준다.
}
// 입력한 값을 CallBack 안의 retObj에 넣어 호출하는 구문 끝

// 에러발생 시 실패 콜백함수 호출 구문
function failCallBack() {
	alert('처리중 에러발생.');
}