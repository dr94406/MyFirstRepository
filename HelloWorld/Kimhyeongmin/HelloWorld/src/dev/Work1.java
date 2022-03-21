package com.dev;

import java.util.Scanner;

public class Work1 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int num1, num2;
		System.out.println("첫번째 수를 입력하시오");
		num1 = scn.nextInt();
		System.out.println("두번째 수를 입력하시오");
		num2 = scn.nextInt();

		if (num1 < num2) {
			System.out.println("두수의 차는" + (num2 - num1) + "입니다.");

		} else if (num2 < num1) {
			System.out.println("두수의 차는" + (num1 - num2) + "입니다.");
		}
	}
}
