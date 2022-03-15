package com.dev;

import java.util.Scanner;

public class Work2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int num1, num2, num3;
		System.out.println("첫번째 숫자를 입력해주세요");
		num1 = scn.nextInt();

		System.out.println("두번째 숫자를 입력해주세요");
		num2 = scn.nextInt();

		System.out.println("세번째 숫자를 입력해주세요");
		num3 = scn.nextInt();

		if (num1 > num2) {

			num1 = num1 ^ num2;
			num2 = num2 ^ num1;
			num1 = num1 ^ num2;
		}
		if (num2 > num3) {

			num2 = num2 ^ num3;
			num3 = num3 ^ num2;
			num2 = num2 ^ num3;
		}
		if (num1 > num2) {

			num1 = num1 ^ num2;
			num2 = num2 ^ num1;
			num1 = num1 ^ num2;
		}
		System.out.printf("해당 숫자들의 정렬 결과는" + num1 + ", " + num2 + ", " + num3 + "입니다.");

	}
}