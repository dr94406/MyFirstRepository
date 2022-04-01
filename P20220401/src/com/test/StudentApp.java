package com.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {

	Scanner scn = new Scanner(System.in);
	List<Student> allStudents = new ArrayList<Student>(); // 컬렉션을 이용해서 정보를 저장.

	class StudentServiceImpl implements StudentService {

		@Override
		public void addStudent(Student student) {

		}

		@Override
		public void modStudent(Student student) {

		}

		@Override
		public List<Student> studentList() {
			return null;
		}

	}

	public void execute() {

		StudentService service = new StudentServiceImpl();

		// 1.입력, 2.수정, 3.리스트 보기 기능을 구성하세요.
		while (true) {
			System.out.println("1.입력, 2.수정, 3.리스트 보기, 4.종료");
			System.out.println("선택>> ");
			int menu = scn.nextInt();

			if (menu == 1) {
				// 입력일 경우 고등학생정보와 대학생정보를 구분해서 처리.

			} else if (menu == 2) {

			} else if (menu == 3) {

			} else if (menu == 4) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		}
		System.out.println("end of program.");
	}
}
