package com.edu;

import java.util.Scanner;

public class RectangleExample {
	public static void main(String[] args) {
		// 가로, 세로, 길이 입력 > 너비 계산
		Scanner scn = new Scanner(System.in);
		int xLength, yLength, area;
		
		System.out.println("가로 길이:");
		xLength = scn.nextInt();
		System.out.println("세로 길이:");
		yLength = scn.nextInt();
		System.out.println("계산 결과: ");
		area = xLength * yLength;
		System.out.println("계산 결과는" + area + "입니다.");
		scn.close();
	}

}