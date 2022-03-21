package com.test;

//문제4) 1 ~ 6까지 임의의 정수를 생성하는 Math.random()을 사용하여 작성하세요.
//생성된 값을 정수배열(크기 5)를 선언 후 값을 저장 후 가장 큰 값을 구하는 코드를 작성.
public class Exam04 {
	public static void main(String[] args) {
		int array[] = new int[6];
		int i;
		int min = 1; // 최소값을 저장하는 변수,최대값지정
		int max = 0; // 최대값을 저장하는 변수

		for (i = 0; i < 5; i++) {
			array[i] = (int) Math.round(Math.random() * 6); // 배열에 랜덤정수 입력
			System.out.println((i + 1) + "번째 값:" + array[i]);
			if (array[i] > max)
				max = array[i]; // 최대값보다 크면 최대값에 저장
			if (array[i] < min)
				min = array[i]; // 최소값보다 작으면 최소값에 저장

		}

		System.out.println("가장 큰 값:" + max);
	}
}
