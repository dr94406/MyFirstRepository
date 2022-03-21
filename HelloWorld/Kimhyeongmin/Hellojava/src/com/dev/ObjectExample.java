package com.dev;

import java.util.Scanner;

import com.edu.Student;

public class ObjectExample {
	public static void main(String[] args) {
		
		Student stud = null;
		stud.getAvgScore();
		
		Scanner scn = new Scanner(System.in);

		Student s1 = new Student(100, "이가영"); // studenNo = 100
		System.out.println(s1.getStudNo());
		System.out.println(s1.getStudName());
		s1.setKorScore(100);
		s1.setEngScore(60); // set 메소드 값을 지정.
		s1.setMashScore(80);

		Student s2 = new Student(101, "김형민", 80, 82, 85); // 생성자를 통해 만든다, 변수 배열이 맞아야한다.
//		ex) string int string int int 
		System.out.printf(s2.getStudName() + "의 평균: %.2f", s2.getAvgScore());
		System.out.println();
		Student s3 = new Student(102, "서현일", 70, 80, 90);
		Student s4 = new Student(102, "최규완", 77, 82, 83);

		Student[] students = { s1, s2, s3, s4 };
		/////////////////////////////
		while (true) {

			System.out.println("조회하려는 학생의 이름:(ex:김형민) ");
			String searchName = scn.next();
			if(searchName.equals("종료")) {
					break; 
			}
			for (int i = 0; i < students.length; i++) {
				if (students[i].getStudName().equals(searchName)) {

					System.out.println(students[i].getStudInfo());
				}

			}

		}
		System.out.println("end of program");
		///////////////////////////
	}

}