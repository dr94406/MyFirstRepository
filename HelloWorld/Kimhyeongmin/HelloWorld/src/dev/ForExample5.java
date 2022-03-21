package com.dev;

public class ForExample5 {
public static void main(String[] args) {
	//
	int num = 48; // 약수의 모든숫자를 구하는 프로그램.
	for (int i = 1; i <= num; i++)
		if (num % i == 0) {
			System.out.println("약수는" + i);
		}
	// 1,2,3,4,6,8,12....
	
}
}
