package com.test;

//문제4) 1 ~ 6까지 임의의 정수를 생성하는 Math.random()을 사용하여 작성하세요.
//생성된 값을 정수배열(크기 5)를 선언 후 값을 저장 후 가장 큰 값을 구하는 
// 코드를 작성.
public class Exam04 {
	public static void main(String[] args) {
		int [] intAry = new int[5]; 
		
		//형변환 문구 앞에 붙히기			
		for(int i=0; i<intAry.length; i++) {
		intAry[i] = (int)(Math.random() * 6) + 1;  // 0 <= x < 6 // 0포함해서 6보다는 작은 수가 만들어지게 하겠습니다. 라는 뜻.
		}

		// 큰값을 구하기
		int maxValue = intAry[0];
		for(int i=0; i<intAry.length; i++) {
			if (intAry[i] > maxValue) {
				maxValue = intAry[i];
			}
		}
		System.out.println("최대값: " + maxValue);
	}
}