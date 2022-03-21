package com.prod;

public class Student { //클래스는 독특한 유형의 데이터 타입이다.
	// 22-123456
	// 필드.(field) // 밑의 String, int 옆에 있는 것들을 다양한 정보를 담는 필드라고 말한다.
	String studentNo;
	String studentName;
	int korScore;
	int engScore;

	// method: 기능..함수들이다.
	void study(String gwamok) { // 이것은 매개변수이다, 어떠한 유형이 들어간다. 
		System.out.println(gwamok + "를 공부합니다.");
	}

	void eat(String food) { 
		System.out.println(food + "을 먹습니다.");
	}

	int getKorScore() {
		return korScore;
	}
	int getEngScore() {
		return engScore;
	}
}