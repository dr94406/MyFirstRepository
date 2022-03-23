package com.edu.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {

	List<Student> list = new ArrayList<Student>();
	Scanner scn = new Scanner(System.in);

	// 멤버클래스. // 밑처럼 하는 이유는 해당 클래스에서만 사용하고 싶기 때문이다.
	class StudentServiceImpl implements StudentService {
		@Override
		public void insertStudent(Student student) {
			list.add(student); // 추가.
		}

		@Override
		public Student getStudents(int sno) { // 학생번호로 한건 조회.
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getStudentNumber() == sno) {
					return list.get(i);
				}
			}
			return null; // 리스트를 리턴하겠습니다.
		}

		@Override
		public List<Student> studentList() { // 전체 리스트.
			return null;
		}

		@Override
		public void modifyStudent(Student student) { // 수정.
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getStudentNumber() == student.getStudentNumber()) {
					list.get(i).setEngScore(student.getEngScore()); // 영어점수수정.
					list.get(i).setKorScore(student.getKorScore()); // 국어점수수정.
				}
			}
		}
	} // end of StudentServiceImpl

	public void execute() {
		// 메뉴: 1.추가 2.리스트 3.한건조회 4.수정 9.종료
		while (true) {
			System.out.println("1.추가 2.리스트 3.한건조회 4.수정 9.종료");
			System.out.println("선택>> ");

			int menu = scn.nextInt();
			if (menu == 1) {

			} else if (menu == 2) {

			} else if (menu == 3) {

			} else if (menu == 4) {

			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		} // end of while()
		System.out.println("end of program");
	}
}
