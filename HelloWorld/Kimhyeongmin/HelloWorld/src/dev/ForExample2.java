package com.dev;

public class ForExample2 {
	public static void main(String[] args) {

//	for반복문으로
		System.out.println(1);
		System.out.println(2);
		System.out.println(3);
		System.out.println();
		int sum = 0;
		int lastCnt = 20;
		int startCnt = 0;
		for (int i = startCnt; i <= lastCnt; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
				sum += i;

				System.out.println("짝수의 합: " + sum);
			}
		}
	}
}