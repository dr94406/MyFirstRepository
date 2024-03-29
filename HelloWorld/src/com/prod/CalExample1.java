package com.prod;

public class CalExample1 {
	public static void main(String[] args) {
		Calculater cal = new Calculater();
		System.out.println(cal.PI);

		int number1 = 10;
		int number2 = 20;
		// 호출하는 부분. =>매개값, 매개값
		int result = cal.add(number1, number2); // cal 으로 Calculater의 add를 호출한다.
		System.out.println(number1 + "과" + number2 + "의 합계: " + result);

		result = cal.minus(number1, number2);
		System.out.println(number1 + "과" + number2 + "의 차이: " + result);
		// 10 => 10.0
		double area = cal.getRectArea(number1, number2);
		System.out.println(number1 + "과 " + number2 + "의 곱: " + area);
		
		double r = 4.5;
		area =cal.getCircleArea(r);
		System.out.println("반지름 " + r + "의 넓이" + area);
	}
}
