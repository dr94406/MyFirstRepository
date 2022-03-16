package com.prod;

public class ArrayExample7 {
	public static void main(String[] args) { // 숫자 위치바꾸기  
 		int num1 = 33;
		int num2 = 44;

		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("num1: " + num1);
		System.out.println("num2: " + num2);

	
		int[] numbers = new int[2];
		numbers[0] = numbers[1];
		numbers[1] = numbers[0];
		
		temp = numbers[0];
		numbers[0] = numbers[1]; 		// temp에 우선 0을 담고 0 = 1 0에 1을 담고  1 = temp 1에 temp를 담는
		numbers[1] = temp;

		System.out.println("바뀐 첫번째 : "+numbers[0]);
		System.out.println("바뀐 두번째 : "+numbers[1]);
	}
}
