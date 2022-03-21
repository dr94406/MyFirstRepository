package com.prod;

public class ArrayExample5 {
public static void main(String[] args) {
	int[] numbers = { 35, 22, 17, 40, 28, 33, 36 };
	int sum = 0;
	int cnt = 0;
	for (int i = 0; i < numbers.length; i++) {
		if (i % 2 == 0) { // 홀수일 경우
			sum += numbers[i];
			cnt++;
		}	
	}
	System.out.println("홀수값의 합: " + sum);
	System.out.println("홀수값의 평균: " +(sum / (double) cnt));
}
}