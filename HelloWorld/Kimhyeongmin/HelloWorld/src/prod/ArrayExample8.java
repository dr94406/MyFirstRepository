package com.prod;

import java.util.Scanner;

public class ArrayExample8 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] numbers = new int[2];
// 첫번째와 두번째 값이 바뀌어서 입력되도록 출력한다.
		System.out.println("첫번째 값을 입력하세요..");
		numbers[0] = scn.nextInt();
		System.out.println("두번째 값을 입력하세요..");
		numbers[1] = scn.nextInt();
		
		if (numbers[0] > numbers[1]) {
			int temp = numbers[0];
			numbers[0] = numbers[1];
			numbers[1] = temp;
		}
		
		
		
		System.out.println("첫번째값: " + numbers[0]);
		System.out.println("두번째값: " + numbers[1]);
	}
}

//		int temp = numbers[0];
//		temp = numbers[0];
//		numbers[0] = numbers[1];
//		numbers[1] = temp;
