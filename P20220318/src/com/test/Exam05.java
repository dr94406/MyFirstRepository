package com.test;

// 문제5) Book클래스를 선언(필드:책제목, 저자, 출판사, 금액) 

//      생성자(책제목, 저자, 출판사, 금액)를 선언 후 Scanner클래스를 사용하여 사용자의 입력을 통하여 인스턴스를 생성하고 
//      입력한 내용을 책제목, 저자, 출판사, 금액 정보를 화면에 출력하는 기능 구현.

import java.util.Scanner;

public class Exam05 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		String inName, inWriter, inPub;
		int inPrice;

		System.out.print("책 제목을 입력 > ");
		inName = scn.next();
		System.out.print("저자를 입력 > ");
		inWriter = scn.next();
		System.out.print("출판사를 입력 > ");
		inPub = scn.next();
		System.out.print("금액을 입력 > ");
		inPrice = scn.nextInt();

		Book b1 = new Book(inName, inWriter, inPub, inPrice);
		System.out.println("입력 완료, 입력한 내용들을 출력합니다. 아래에서 확인하세요.");
		b1.printInfo();
		scn.close();
	}
}
