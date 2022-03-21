package com.dev;

public class SwitchExample2 {
	public static void main(String[] args) {
		// 90점 이상 A, 80점 이상 B, 70점 C, 60점 D, 그외 F	
	int score = 100; // => 하나의 값으로..
	switch (score / 10) {
	case 10:
		System.out.println("A등급입니다.");
	case 9:
		System.out.println("A등급입니다.");
		break;
	case 8:
		System.out.println("B등급입니다.");
		break;
	case 7:
		System.out.println("C등급입니다.");
		break;
	case 6:
		System.out.println("D등급입니다.");
		break;
	case 5:
		System.out.println("F등급입니다.");
		break;
	case 4:
		System.out.println("F등급입니다.");
		break;
	case 3:
		System.out.println("F등급입니다.");
		break;
	case 2:
		System.out.println("F등급입니다.");
		break;
	case 1:
		System.out.println("F등급입니다.");
		break;
	default:
		System.out.println("F등급입니다.");
		break;

	}
	}
}