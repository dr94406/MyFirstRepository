package com.edu;

import java.util.Scanner;

public class ScannerExample {  // com.edu.ScannerExample <풀네임
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		
//		System.out.println("첫번째 숫자를 입력하세요..");
//		int val = scn.nextInt(); //입력했던 값을 불러오는 기능
//		System.out.println("두번째 숫자를 입력하세요..");
//		int val2 = scn.nextInt(); //입력했던 값을 불러오는 기능
//		// val, val2의 값을 합한 결과를 담을 변수 선언하고 결과를 저장.
//		int result = val + val2;
//		System.out.println("두수의 합은 " + result + "입니다. ");
		System.out.println("두수의 합은 " + (60 + 20) + "입니다. "); // 먼저 실행해야 되는 명령어는 () 치기
		scn.close();
		
//		if(val % 2 == 0) {
//			System.out.println("짝수입니다.");
//		}
//		if (val % 2 == 1) {
//			System.out.println("홀수입니다.");
//			
//		}
//		scn.close();
	}

}