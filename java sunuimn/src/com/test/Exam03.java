package com.test;

import java.util.Scanner;

//문제3) 정수형배열 선언하고 사용자로 세개의 정수값을 입력받아서 배열에 저장. 제일 큰값을 구하는 코드를 작성.
public class Exam03 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		int[] min = new int[3];

		for (int i = 0; i < 3; i++) {
			System.out.println("수를 입력하세요.");
			min[i] = scn.nextInt();
		}

		if (min[0] > min[1] && min[1] > min[2]) {
			System.out.println("가장 큰 수는 " + min[0]);
		}
		if (min[0] > min[2] && min[2] > min[1]) {
			System.out.println("가장 큰 수는 " + min[0]);
		}
		if (min[1] > min[0] && min[0] > min[2]) {
			System.out.println("가장 큰 수는 " + min[1]);
		}
		if (min[1] > min[2] && min[2] > min[0]) {
			System.out.println("가장 큰 수는 " + min[1]);
		}
		if (min[2] > min[0] && min[0] > min[1]) {
			System.out.println("가장 큰 수는 " + min[2]);
		}
		if (min[2] > min[1] && min[1] > min[0]) {
			System.out.println("가장 큰 수는 " + min[2]);
		}
		scn.close();
	}
}
