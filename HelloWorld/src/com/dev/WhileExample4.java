package com.dev;

import java.util.Scanner;

public class WhileExample4 {
	public static void main(String[] args) {
		// 은행 계좌를 만들어서 1: 입금, 2: 출금 3: 종료
		// 입금일 경우: 입금액을 입력하세요... account 값을 누적.
		// 출금일 경우: 출금액을 입력하세요... account 값을 차감.
		// 종료일 경우: 프로그램 종료.
		// account 값은 0으로 초기화.
		// Scanner, account
		Scanner scn = new Scanner(System.in);
		int account = 0;

		while (true) {
			
			System.out.println("1:입금, 2:출금, 3:;종료");
			int menu = scn.nextInt();
			if (menu == 1) {
				System.out.println("입금액을 입력하세요...");
				account += scn.nextInt();
				System.out.println("현재 잔액은 " + account + "입니다.");
			} else if (menu == 2) {
				System.out.println("출금액을 입력하세요...");
				account -= scn.nextInt();
				System.out.println("현재 잔액은" + account + "원입니다.");}
			 else if (menu == 3) {
				break;
			}
		}
		System.out.println("end of program");

	}
}
