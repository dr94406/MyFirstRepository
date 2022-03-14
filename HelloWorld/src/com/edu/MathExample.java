package com.edu;

import java.util.Scanner; // Scanner 클래스 호출 

public class MathExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in); // Scanner 객체 생성
		int num1, num2, sum, 합은, 차는, 곱은, 몫은, 나머지는;

		System.out.println("첫번째 숫자는?");
		num1 = scn.nextInt();
		System.out.println("두번째 숫자는?");
		num2 = scn.nextInt();
		int 합 = num1 + num2;
		int 차 = num1 - num2;
		int 곱 = num1 * num2;
		int 몫 = num1 / num2;
		int 나머지 = num1 % num2;

		System.out.println("두수의 합: " + 합);
		System.out.println("두수의 차: " + 차);
		System.out.println("두수의 곱: " + 곱);
		System.out.println("두수의 몫: " + 몫);
		System.out.println("두수의 나머지: " + 나머지);
		scn.close();

	}

}
