package com.prod;

public class MemberExample {
	public static void main(String[] args) {
		// int num1 = 10;
		// String name = "홍길동";
		// ?? member = "홍길동" , 10; 둘 다 담고싶음

		Member mem1 = new Member(); // name, age 속성 X 
		mem1.name = "홍길동";
		mem1.age = 20;

		Member mem2 = new Member(); //
		mem2.name = "김민수";
		mem2.age = 25;

		System.out.println("mem1의 name속성: " + mem2.name);
		System.out.println("mem1의 age속성: " + mem2.age);
		
		Student st1 = new Student(); // 초기화..
		st1.studentNo = "22-1234987";
		st1.studentName = "김영희";
		st1.korScore = 90;
		st1.engScore = 80;
		
		Student st2 = new Student();
				
	}
}
