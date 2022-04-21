// reference.js 이것이 참조변수임

const names = ['김형민','김훈','박진호','김재욱']; // 이렇게 배열을 사용해야한다. 기호 꼭 넣어야함 for문임 

for (let i=0; i < names.length; i++) {
  console.log(( i + 1) + '번째 이름:' + names[i]);
}

// enhanced for. for(String name : names)
for (let name of names) {
  console.log(name); // 위에 선언되어 있는 names 값을 불러온다. 
}

const numbers = [23, 44, 38, 12, 56];
for(let num of numbers) {
  if(num > 40) { // if문과 동일, 배열안에 있는 수 중에 40보다 큰 값을 출력한다.
    console.log(num);
  }
}

const inputs = []; // 선언 
for (let i = 0; i < numbers.length; i++) {
  var inputVal = prompt('값을 입력하세요...'); // 값을 직접 입력하는 
  console.log(typeof inputVal, inputVal);
  inputs[i] = parseInt (inputVal); // parseInt는 문자열인 inputVal을 숫자로 바꾸는 형변환.
}
let sum = 0, avg; // 0으로 초기화하여 초기값을 주어야 한다.
for(let i =0; i<inputs.length; i++) {
  sum += inputs[i]; // 다 더한 합계를 보겠다는 뜻이다.
}
avg = sum / inputs.length; // 다 더한 합계 / 입력한 값의 수 만큼 나누기 = 평균 
// 합계를 구하는 , 평균:
console.log(sum, avg);


