package com.edu;
import java.util.Scanner;
	// 이름을 입력받도록...(String) -> scn.nextLine();
// 연락처 입력...(String) -> scn.nextLine();
// 나이 입력...(int) -> scn.netxInt();
// 키 입력...(double) -> scn.nextDouble();
public class TodayExample {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);		
// 이름은 : 김형민
// 연락처 :010-9176-4428
// 나이: 23
// 키 :172
// 적정몸무게 : (키 - 100) * 0.9 => 60.3 +- 5키로...55.3< < 65.3


		String name,tel;
		int age;
		double tall;
		double bmi;
		
		name = scn.nextLine();
		tel = scn.nextLine();
		age = scn.nextInt();
		tall = scn.nextDouble();
		bmi = (tall - 100) * 0.9;
		System.out.println("이름 " + name + "입니다.");
		System.out.println("전화번호 " + tel + "입니다.");
		System.out.println("나이 " + age + "살입니다.");
		System.out.println("키 " + tall + "cm입니다.");
		System.out.println("적정몸무게 " + bmi + "kg입니다.");


	



	}
}
