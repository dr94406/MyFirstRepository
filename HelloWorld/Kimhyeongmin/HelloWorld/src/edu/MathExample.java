package com.edu;

import java.util.Scanner; // Scanner 클래스 호출 

public class MathExample {
	public static void main(String[] args) {
		
		// code here
		int num1, num2;
		Scanner scn = new Scanner(System.in); // Scanner 객체 생성
		
		System.out.println("첫번째 수를 입력하세요...");
		num1 = scn.nextInt();
		
		System.out.println("두번째 수를 입력하세요...");
		num2 = scn.nextInt();
		
		System.out.println("두수의 합: " + (num1 + num2));
		System.out.println("두수의 차: " + (num1 - num2));
		System.out.println("두수의 곱: " + (num1 * num2));
		System.out.println("두수의 몫: " + (num1 / num2));
		System.out.println("두수의 나머지: " + (num1 % num2) );
		
		
		scn.close();
	}

}
