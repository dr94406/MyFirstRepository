package com.practice;

import java.util.Scanner;

// 문제 1 정수값을 입력받기위한 변수를 선언하고 Scanner 객체를 활용하여 두 정수를 입력받고 큰 수에서 작은 수를 나눈 결과를 소수점 2째자리까지 출력하는 기능을 구현하세요.
public class Exam1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1, num2;
		double result;
		System.out.println("첫번째 값을 입력>> ");
		num1 = scn.nextInt();
		System.out.println("두번째 값을 입력>> ");
		num2 = scn.nextInt();

		if (num1 > num2) {
			result = num1 / (double) num2; // 정수연산 결과값 정수; 4바이트(정수) 8바이트(실수)
		} else {
			result = num2 / (double) num1;
		}
		System.out.printf("결과: %.2f", result);
	}
}
