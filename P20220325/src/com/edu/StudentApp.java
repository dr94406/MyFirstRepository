package com.edu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentApp {
	public static void main(String[] args) {

	}

	List<Student> members = new ArrayList<Student>();
	Scanner scn = new Scanner(System.in);

	// MemberService를 구현하는 구현클래스를 선언.
	// inner클래스
	class StudentServiceImpl implements StudentService {

		@Override
		public void addStudent(Student student) { // 추가
			
		}

		@Override
		public void modifyMember(Student member) { // 수정
			for (Student mbr : members) {
				if (mbr.getStudentId() == member.getStudentId()) {
					mbr.setPhone(member.getPhone());
				}
			}
		}

		@Override
		public List<Student> MemberList() { // 전체리스트
			return members;
		}

	}

	public void execute() {
		// 메뉴: 1.등록 2.수정 3.전체리스트 9.종료 (수정은 시간 남으면)
		// 도서반=> 기본정보+도서반장이름, 강의실이름을 members에 추가 5개
		// 축구반=> 기본정보+코치이름,락커룸이름5개
		// 수영반=> 기본정보+강사이름,수영등급4개
		StudentService service = new StudentServiceImpl();
		while (true) { // 반복적으로 처리하겠습니다.
			int menu = 0; //초기화를 통해 밑의 코드를 예외설정 하게 만들어준다.
			System.out.println("1.등록 2.수정 3.전체리스트 9.종료");
			System.out.println("선택>> ");
			try {
				menu = scn.nextInt();
			} catch (Exception e) {

			}
			if (menu == 1) {
				System.out.println("1.고등학생 2. 대학생");
				int menu2 = scn.nextInt();

				// 공통질문
				System.out.println("학생아이디 입력>>> ");
				int memberId = scn.nextInt();
				System.out.println("학생이름 입력>>>");
				String membName = scn.next();
				System.out.println("연락처 입력>>>");
				String phone = scn.next();

				if (menu2 == 1) {

					System.out.println("담임교사를 입력>>>");
					String banName = scn.next();
					System.out.println("학년정보를 입력>>>");
					String roomName = scn.next();
					HighSchoolMember mem = new HighSchoolMember(memberId, membName, phone, banName, roomName); // 부모>자식
					service.addMember(mem); // 부모>자식

				} else if (menu2 == 2) {

					System.out.println("담당교수를 입력>>>");
					String gyosuName = scn.next();
					System.out.println("전공과목을 입력 >>>");
					String jeongongName = scn.next();
					CollegeStudent mem = //
							new CollegeStudent(studentId, studentName, phone, gyosuName, jeongongName); // 부모>자식
					service.addMember(mem);
			

				} else {

				}

			} else if (menu == 2) {

			} else if (menu == 3) {
				List<Student> list = service.MemberList();
				for (Student mem : list) {
					System.out.println(list.toString());
				}

			} else if (menu == 9) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else {
				System.out.println("잘못된 메뉴를 선택했습니다.");
			}
		}
		System.out.println("end of program");
	} // end of execute()

} // end of class
