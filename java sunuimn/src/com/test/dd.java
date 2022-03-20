package com.test;

import java.util.Scanner;

public class dd {
	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		int[] ary = new int[3];
//	int size = arys.length;

		for (int i = 0; i < 3; i++) {
			System.out.println("수를 입력해 주세요");
			ary[i] = scn.nextInt();
		}

		if (ary[0] > ary[1] && ary[1] > ary[2]) {
			System.out.println("세 수 중 가장 큰 수는 " + ary[0]);
		}
		if (ary[0] > ary[1] && ary[2] > ary[1]) {
			System.out.println("세 수 중 가장 큰 수는 " + ary[0]);
		}
		if (ary[1] > ary[0] && ary[0] > ary[2]) {
			System.out.println("세 수 중 가장 큰 수는 " + ary[1]);
		}
		if (ary[1] > ary[2] && ary[2] > ary[0]) {
			System.out.println("세 수 중 가장 큰 수는 " + ary[1]);
		}
		if (ary[2] > ary[1] && ary[1] > ary[0]) {
			System.out.println("세 수 중 가장 큰 수는 " + ary[2]);
		}
		if (ary[2] > ary[0] && ary[0] > ary[1]) {
			System.out.println("세 수 중 가장 큰 수는 " + ary[2]);
		}
		scn.close();
	}
}
