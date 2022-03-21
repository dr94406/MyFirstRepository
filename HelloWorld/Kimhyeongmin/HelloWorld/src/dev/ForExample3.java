package com.dev;

import java.util.Scanner;

public class ForExample3 {
	public static void main(String[] args) {
		// 입력받는 두수를 num1, num2
		Scanner scn = new Scanner(System.in);
		int num1,num2;
		System.out.println("첫번째 값 입력:");
		num1= scn.nextInt();
		System.out.println("두번째 값 입력:");
		num2 = scn.nextInt();
		int sum = 0;
		for (int i = num1; i <= num2; i++) {
			sum += i; // 4		
			System.out.println(i);
		}
		System.out.println(num1 + "부터 " + num2 + "까지의 합: " +sum );
		{
			
			int num3 = 0;
			System.out.println(num3);
		}
		{
			int num3 = 10;
		}
	}
}
