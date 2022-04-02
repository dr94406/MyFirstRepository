package com.test;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class StudentApp {

	List<Student> students = new ArrayList<Student>(); // 컬렉션을 이용해서 정보를 저장.
	Scanner scn = new Scanner(System.in);

	class StudentServiceImpl implements StudentService {

		@Override
		public void addStudent(Student student) {
			students.add(student);
		}

		@Override
		public void modifyStudent(Student student) {

			for (int i = 0; i < students.size(); i++) {
				if (students.get(i).getStudNo() == student.getStudNo()) {
					students.get(i).setPhone(student.getPhone());
				}
			}
		}

		@Override
		public List<Student> studentList() {
			return students;
		}

	}

	public void execute() {

		StudentService service = new StudentServiceImpl();
		// 1.입력, 2.수정, 3.리스트 보기 기능을 구성하세요.

		while (true) {
			int menu = 0;
			try {
				System.out.println("1.입력, 2.수정, 3.리스트보기, 4.종료");
				System.out.println("선택하세요>>>");
				menu = scn.nextInt();
				// 입력일 경우 고등학생정보와 대학생정보를 구분해서 처리.
				if (menu == 1) {
					int menu2 = 0;
					System.out.println("1.대학생 2. 고등학생");
					System.out.println("선택하세요>>>");
					menu2 = scn.nextInt();
					if (menu2 == 1) {
						System.out.println("아이디를 입력하세요");
						int studNo = scn.nextInt();
						System.out.println("이름을 입력하세요");
						String studName = scn.next();
						System.out.println("연락처를 입력하세요");
						String phone = scn.next();
						System.out.println("담당교수님 이름을 입력하세요.");
						String profName = scn.next();
						System.out.println("전공정보를  입력하세요");
						String major = scn.next();
						CollegeStudent s1 = new CollegeStudent(studNo, studName, phone, profName, major);
						service.addStudent(s1);

					} else if (menu2 == 2) {
						System.out.println("아이디를 입력하세요");
						int studNo = scn.nextInt();
						System.out.println("이름을 입력하세요");
						String studName = scn.next();
						System.out.println("연락처를 입력하세요");
						String phone = scn.next();
						System.out.println("담당교수님 이름을 입력하세요.");
						String teacherName = scn.next();
						System.out.println("전공정보를  입력하세요");
						String groupName = scn.next();
						HighStudent s2 = new HighStudent(studNo, studName, phone, teacherName, groupName);
						service.addStudent(s2);
					}
				} else if (menu == 2) {
					System.out.println("수정할 회원의 번호를 입력하세요 ");
					int studNo = scn.nextInt();
					System.out.println("전화번호를 입력하세요 ");
					String num = scn.next();
					Student student = new Student(studNo, null, num);
					service.modifyStudent(student);

				} else if (menu == 3) {
					List<Student> student = service.studentList();
					for (Student s : student) {
						System.out.println(s.toString());
					}
				} else if (menu == 4) {
					System.out.println("프로그램을 종료합니다. \n");
					break;
				}
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력하세요");
				scn.next();
			}
		} // end of while
		System.out.println("end of prog");
	}
}