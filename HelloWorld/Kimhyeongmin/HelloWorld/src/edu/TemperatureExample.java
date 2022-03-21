package com.edu;

import java.util.Scanner;

public class TemperatureExample {
	public static void main(String[] args) {
		// C = 5/9*(F-32) 화씨온도를 섭씨온도로 변경규칙.
		Scanner scn = new Scanner(System.in);
		double fDeg, cDeg;
		System.out.println("화씨 온도를 입력하세요");
		fDeg = scn.nextDouble ();
		cDeg = (double) 5 / 9 * (fDeg -32);
		System.out.println(cDeg);
		
		// 30.0보다 크면 "오늘은 더운 날씨네요" 그외는 "살만하네요"
		if (cDeg >= 30) {
			System.out.println("오늘은 더운 날씨네요");
		
		} else { System.out.println("살만하네요");
			System.out.println("살만하네요");
		}
		scn.close();
	}	
}
