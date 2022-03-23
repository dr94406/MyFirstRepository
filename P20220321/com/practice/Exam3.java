package com.practice;

// 문제 3 매스랜덤 메소드를 이용하여 1~10까지 임의의 정수가 반복적으로 생성이 되도록 구현, 임의의 값이 5가 되면 반복문 종료
public class Exam3 {
	public static void main(String[] args) {
		int num = 0;
		for (int i = 1; i <= 1; i++) {
			num = (int) (Math.random() * 10) + 1;
			System.out.println(num);
			if (num == 5) {
				System.out.println("종료합니다.");
			} else {
				System.out.println("원하는 값이 아닙니다. 다시 실행해주세요.");
			}
		}
	}
}
