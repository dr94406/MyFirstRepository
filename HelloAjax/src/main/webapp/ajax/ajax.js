/**
 * ajax.js
 */
 
 // 비동기. 일정시간 이상 딜레이를 설정하고 딜레이 뒤에 결과값이 나오게
 
 let val = 10;
 setTimeout(function(){
 	val += 5;
 	console.log('hello -> ' + val);  // 2초이후에 결과값을 받아옴.
 
 setTimeout(function(){
 	val += 3;
 	console.log('hello2 -> ' + val);
 	
 setTimeout(function(){
 	val += 4;
 	console.log('hello3 -> ' + val);  // 1초이후에 결과값을 받아옴.
	 }, 1000); 
 
  }, 1000);
  
}, 2000); 

let success = true;
let promise = new Promise(function(resolve, reject){
  if(success) {
	 resolve('success');
  }else{
	 reject('error');
	}
});

promise.then(function(result) { // 성공 시 호출
		  console.log(result);
	   })
	   .then(function (result) {
		  console.log(result);
	   })
	   .then(function (result) {
	 	  console.log(result);
	   })
	   .catch(function(err) {
	   	  console.log(err);
	   }); // 실패시 catch 받아옴 

