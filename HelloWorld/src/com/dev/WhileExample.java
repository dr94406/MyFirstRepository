package com.dev;

import java.util.Scanner;

public class WhileExample {
	public static void main(String[] args) {
//		// for
//		for (int i = 1; i <= 5; i++) { // i는 1을 뜻한다. 1인 i를 5번 반복 될 때 까지 증가시키겠다.
//			System.out.println("i의 값=>" + i); // 그러니 sop를 출력하면 1에서 5까지 i의 값이 커진다.
//		}
//		System.out.println();
//		// while
//		int i = 1; // 초기화..
//		while (i <= 5) { // 조건식..
//			System.out.println("i의 값=> " + i);
//			i++; // 증감식..
//
//		}
//
//		// while
//		int num = 0;
//		while (true) {
//			System.out.println("num의 값=> " + num);
//			num++;
//			if (num > 5) {
//				break; // 반복문을 빠져나옴.
//			}
//		}
//
//		// while
//		while (true) {
//			int rand = (int) (Math.random() * 10) + 1; // 1~ 10 까지의 임의의 값 (난수)
//			System.out.println("임의의 생성된 값: " + rand);
//			if (rand == 8) {
//				break;
//			}
//		}
//
//		// 수를 맞출때 까지 계속 반복..
		Scanner scn = new Scanner(System.in);
		int randomVal, userVal;
		while (true) {
			randomVal = (int) (Math.random() * 5) + 1;
			System.out.println("임의의 값을 입력(1 ~ 5)");
			userVal = scn.nextInt();

			if (randomVal == userVal) {
				System.out.println("생성된 임의의 값과 같습니다.");
				break;
			}
		}
		
		
		System.out.println("end of prog");
	}
}
