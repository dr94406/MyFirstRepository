package com.test;

import java.util.Scanner;

//문제2) 정수형 변수 n1, n2를 선언하고 Scanner 클래스를 통하여
// 두정수를 입력받은 후 큰수에서 작은 수를 나눈 결과값을 소수점 첫번째까지 구하는 기능 작성.
public class Exam02 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n1, n2;
		double result; // 결과라는 의미이다.

		System.out.println("첫번째 값을 입력>> ");
		n1 = scn.nextInt();
		System.out.println("두번째 값을 입력>> ");
		n2 = scn.nextInt();

		if (n1 > n2) {
			result = n1 / (double) n2; // 정수연산 결과값 정수; 4바이트(정수) 8바이트(실수)
		} else {
			result = n2 / (double) n1;
		}
		System.out.printf("결과: %.1f", result);

	}
}