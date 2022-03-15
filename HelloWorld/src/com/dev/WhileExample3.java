package com.dev;

import java.util.Scanner;

public class WhileExample3 {
	public static void main(String[] args) {
		// 입력을 계속 입력할 수 ....
		// -1 값을 입력하면 입력멈춤.
		// sum 값에 입력...
		// 스캐너 선언. sum(0으로 초기화) 선언.
		// While 조건 true
		// 숫자를 입력하세요.
		// inputVal 이라고 변수 담아주세요.
		// 입력값이 -1이면 반복문을 종료.

		// 합계는 sum입니다..
		Scanner scn = new Scanner(System.in);
		int sum = 0;
		int inputVal;
		
		while (true) {
			System.out.println("숫자를 입력하세요.");
			inputVal = scn.nextInt();

			if (inputVal == -1) {
				System.out.println("종료합니다.");
				break;
				
			} else {
				sum = inputVal + sum;
				System.out.println(sum);
			}
		}

	}
}
