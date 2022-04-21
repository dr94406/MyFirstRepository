// object.js
let member1 = { // 변수선언 밑의 정보들을 가지고있습니다 (자바로 치면 클래스)
  fullName: 'Hong', //필드 선언.
  age: 20,
  score: 80
};
let member2 = {
  fullName: 'Hwang',
  age: 22,
  score: 88
}
let member3 = {
  fullName: 'Park',
  age: 25,
  score: 92
}
member1.fullName = '홍'; // fullName에 있던 기존의 값을 바꾸기.
console.log(member1.fullName) // 값을 불러오고 싶을때는 찍으면된다.
console.log(member1.age + member2.age) // "
// {key: value}, {key: value} 이것이 맵타입이다. 

const members = [member1, member2, member3];
// 홍의 나이는 20이고 점수는 80입니다.
// Hwag의 나이는 22이고 점수는 88입니다.
// park의 나이는 25이고 점수는 92입니다.
document.write('<ul>')
for (let i = 0; i < members.length; i++) {
  // document.write(members[i].fullName +'의 나이는,'+members[i].age+'점수는,' +members[i].score + '입니다.')
  // document.write('<li>' + members[i].fullName + ' ,' + members[i].age + ' ,' + members[i].score + '</li>')
  // members 배열안에 담긴 member 1,2,3의 값을 불러오는 것이다.
  document.write(`<li>${members[i].fullName} ${members[i].age} ${members[i].score} </li>`)
}
document.write('</ul>');
let welcome = `안녕하세요.
                반갑습니다`;
console.log(welcome)