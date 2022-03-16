package com.prod;



public class ReferenceExample {
	public static void main(String[] args) {
		// 참조타입 vs 기본타입
		int num1 = 10; // 리터럴
		int num2 = 10; //
		// int, double, (byte, short, long, float, char, boolean)

		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num1 == num2);
		String str1 = new String("Hello");
		String str2 = new String("Hello");

		System.out.println(str1); // 123afbc35	(16진수로 표현되어지는 임의의 값)
		System.out.println(str2); // ab3af3ch5	(16진수로 표현되어지는 임의의 값)
		System.out.println(str1 == str2);
		System.out.println(str1.equals(str2));

	}
}
