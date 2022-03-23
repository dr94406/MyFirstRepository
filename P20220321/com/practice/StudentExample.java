package com.practice;

import java.util.Scanner;

public class StudentExample {
	public static void main(String[] args) {
		// 스캐너 배열 3개 선언
		Scanner scn = new Scanner(System.in);
		Student[] students = new Student[5];

		while (true) {
			System.out.println("1.입력 2.학생리스트 3.종료");
			int menu = scn.nextInt();
		}
	}
}