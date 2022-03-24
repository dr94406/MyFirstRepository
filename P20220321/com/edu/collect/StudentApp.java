package com.edu.collect;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {

	List<Student> list = new ArrayList<Student>();
	Scanner scn = new Scanner(System.in);

	// 생성자
	public StudentApp() {

		list.add(new Student(101, "권가희", 50, 60));
		list.add(new Student(102, "유해정", 70, 80));
		list.add(new Student(103, "이유빈", 90, 70));
		list.add(new Student(203, "이유빈", 90, 70));
	}

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
			return list;
		}

		public void modifyStudent(Student student) { // 수정.
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getStudentNumber() == student.getStudentNumber()) {
					list.get(i).setEngScore(student.getEngScore()); // 영어점수수정.
					list.get(i).setKorScore(student.getKorScore()); // 국어점수수정.
				}
			}
		}

		@Override
		public void removeStudent(int del) { // 한건삭제
			for (int i = 0; i < list.size(); i++) {
				if (list.get(i).getStudentNumber() == del) {
					list.remove(i);
					System.out.println("삭제했습니다.");
					break;
				} else {
					System.out.println("없습니다.");
				}
			}
		}

		@Override
		public List<Student> searchStudent(String name) { // 이름조회
			List<Student> searchList = new ArrayList<Student>();
			// 찾았다고 종료 X
			for (int i = 0; i < list.size(); i++) {
				// 같은 이름이 있는지 찾아보고 있으면 searchList.add()
				if (list.get(i).getStudentName().equals(name)) { // 만약 학생들의 이름과 같은 이름이 담긴것이 있다면 (equals -> 대상의 내용 자체를
																	// 비교)
					searchList.add(list.get(i)); // 목록에 추가를 하겠습니다.
				}
			}
			return searchList;
		}

	} // end of StudentServiceImpl

	public void execute() {
		StudentService service = new StudentServiceImpl(); // StudentService는 인터페이스 StudentServiceImpl는 구현객체이다.
		// 메뉴: 1.추가 2.리스트 3.한건조회 4.수정 5.한건삭제 6.이름조회(이름) 9.종료
		while (true) {
			System.out.println("1.추가 2.리스트 3.한건조회 4.수정 5.한건삭제 6.이름조회 9.종료");
			System.out.println("선택>> ");

			int menu = scn.nextInt();
			if (menu == 1) {
				// 학생정보 추가입력. : 학생번호, 이름, 영어, 국어점수.
				System.out.println("학생번호 입력>>");
				int stuNo = scn.nextInt();
				System.out.println("학생이름 입력>>");
				String name = scn.next();
				System.out.println("영어 입력>>");
				int engScore = scn.nextInt();
				System.out.println("국어 입력>>");
				int korScore = scn.nextInt();

				Student s1 = new Student(stuNo, name, engScore, korScore);
				service.insertStudent(s1);

			} else if (menu == 2) {
				List<Student> list = service.studentList();
				for (Student s : list) {
					System.out.println(s.toString());
				}

			} else if (menu == 3) { // 한건 조회.
				System.out.println("조회할 학생번호 입력>>");
				int studNo = scn.nextInt();
				Student student = service.getStudents(studNo);
				if (student == null) {
					System.out.println("조회된 결과가 없습니다.");
				} else {
					System.out.println(student.toString());
				}

			} else if (menu == 4) {
				System.out.println("수정할 학생번호입력>>");
				int stuNo = scn.nextInt();
				System.out.println("영어 입력>>");
				int engScore = scn.nextInt();
				System.out.println("국어 입력>>");
				int korScore = scn.nextInt();

				Student s1 = new Student(stuNo, null, engScore, korScore);
				service.modifyStudent(s1);
				System.out.println("처리가 완료되었습니다.");

			} else if (menu == 5) { // 삭제.
				System.out.println("삭제할 학생의 번호를 입력하세요.");
				int studNo = scn.nextInt();
				service.removeStudent(studNo);

			} else if (menu == 6) { // 이름으로 여러건 조회.
				System.out.println("조회할 학생이름 입력>>");
				String searchName = scn.next();
				List<Student> list = service.searchStudent(searchName);
				for (Student s : list) {
					System.out.println(s.toString());
				}

			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}

		} // end of while()
		System.out.println("end of program");
	}
}
