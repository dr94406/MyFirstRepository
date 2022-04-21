// variable.js 스크립트에서도 주석은 //두개임.

var myName ='김형민'; // string 타입
var yourName; // unedfined
myName = 100; // 스크립트 언어다 보니, 유연하게 써서 에러가 안 뜬다. number타입
myName = true; // bloolean타입
myName = null; // 클래스의 인스턴스 object타입
console.log(typeof yourName); // 값이 할당 되었을 때에 타입이 정해져서 보임.
// js는 따옴표 1개든 2개든 다 문자열로 인식.
 var yourName = "홍길동"; // 콘솔 밑에 할당되어서, 값을 못받아온다. 콘솔 위로 올리자.
 console.log(typeof yourName);

 // 전역변수(스크립트안에 선언된 변수), 지역변수(함수안에서 선언된 변수)

 function checkInfo() { // 이것이 함수선언이다.
  var myName = 'KimHyeongmin' // 함수가 시행하는 동안에는 있다가, 끝나는 시점에서 사라지는 지역변수
   console.log(myName); // 지역변수를 통해 KimHyeongmin을 실행.
 }
 checkInfo(); // 함수를 호출해서 실행해준다. 호출 후 다시 실행 (전역변수와 지역변수의 차이점을 보기위해서)
 console.log(myName); // 이것인 전역변수이므로,  타입 값인 기본 값인 null이 할당된다.

 // ES6 (ES2015) => let
 // let 블럭레벨 변수선언.
function info(){
  let Myname = 'Hong';
  console.log(myName); // let 은 중복불가임.
}
info()


{
  let myName = 'Hong';
  console.log(myName);
}

{
  let myName = 'Hwang';
  console.log(myName);
}


const otherName = 'Hong'; 
// otherName = 'Hwang';

// var, let => 변수선언.
// const => 상수선언.