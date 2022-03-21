package com.dev;

public class ForExample {
	public static void main(String[] args) {
//		i= i + 1;
//		i += 1;
//		i++;
		// 1 ~ 10 까지 더하는 ??
		int sum = 0;
		for(int i = 1; i <= 5; i++) { // 반복문 
			System.out.println(i);
			sum = sum + i; // 0 , 1 => 1, 3, 6, 10, 15
		}
		System.out.println("합계: " + sum);
		
//		System.out.println("1");
//		System.out.println("2");
//		System.out.println("3");
//		System.out.println("4");
//		System.out.println("5");
//		System.out.println("6");
//		System.out.println("7");
//		System.out.println("8");
//		System.out.println("9");
//		System.out.println("10");
}
}
