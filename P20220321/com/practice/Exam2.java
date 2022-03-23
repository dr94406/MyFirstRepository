package com.practice;

import java.util.Scanner;

// 실수값을 입력받도록 Scanner객체를 활용하여 3개의 실수값을 배열에 저장.
public class Exam2 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		double[] intAry = new double[3];
		for (int i = 0; i < intAry.length; i++) {
			System.out.println("실수를 입력하세요>>");
			intAry[i] = scn.nextDouble();

		}
	}

}
