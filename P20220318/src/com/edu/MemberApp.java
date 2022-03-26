package com.edu;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MemberApp {

	List<Member> members = new ArrayList<Member>();
	Scanner scn = new Scanner(System.in);
	// MemberService를 구현하는 구현클래스를 선언.
	class MemberServiceImple implements MemberService {

		@Override
		public void addMember(Member member) {
			members.add(member);
		}

		@Override
		public void modifyMember(Member member) {

			for (int i = 0; i < members.size(); i++) {
				if (members.get(i).getMemberId() == member.getMemberId()) {
					System.out.println("수정할 연락처를 입력하세요 : ");
					String phone = scn.next();
					members.get(i).setPhone(phone);
				} else {
					System.out.println("수정할 학생 번호가 없는 번호입니다.");
				}
			}

		}

		@Override
		public List<Member> memberList() {
			return members;
		}

	}

	public void execute() {

		MemberService Ms = new MemberServiceImple();
		int menu = 0, ban = 0, id = 0, i = 0;
		
		while (true) {
			try {
				System.out.println("메뉴: 1.등록 2.수정 3.전체리스트 9.종료");
				menu = scn.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("숫자를 입력하세요.");
				scn.nextLine();
			}
			if (menu == 1) {
				while (true) {
					try {
						System.out.println("회원이 신청하고자하는 반을 선택해주세요.");
						System.out.println("1.도서반 2.축구반 3.수영반");
						ban = scn.nextInt();
						break;
					} catch (InputMismatchException e) {
						System.out.println("숫자를 입력하세요.");
						scn.nextLine();
					}
				}
				while (true) {
					try {
						System.out.print("회원 번호를 입력해주세요 : ");
						id = scn.nextInt();
						break;
					} catch (InputMismatchException e) {
						System.out.println("숫자를 입력하세요.");
						scn.nextLine();
					}
				}

				while (true) {
					if (members.isEmpty())
						break;
					else {
						if (members.get(i).getMemberId() == id) {
							i++;
							System.out.println("학생번호는 고유한 번호입니다.");
							System.out.println("이미 있는 번호이므로 다른번호를 입력해주세요.");
							id = scn.nextInt();
						} else
							break;

						if (i <= members.size())
							i = 0;
					}
				}

				System.out.print("회원 이름을 입력해주세요 : ");
				String name = scn.next();
				System.out.print("회원 연락처를 입력해주세요 : ");
				String phone = scn.next();

				if (ban == 1) {
					System.out.print("도서반장 이름을 입력해주세요 : ");
					String bkbanjang = scn.next();
					System.out.print("강의실 이름을 입력해주세요 : ");
					String bkname = scn.next();
					Member memberBook = new BookMember(id, name, phone, bkbanjang, bkname);
					Ms.addMember(memberBook);
				} else if (ban == 2) {
					System.out.print("코치 이름을 입력해주세요 : ");
					String coche = scn.next();
					System.out.print("락커룸 이름을 입력해주세요 : ");
					String swName = scn.next();
					Member memberSoccer = new SoccerMember(id, name, phone, coche, swName);
					Ms.addMember(memberSoccer);
				} else if (ban == 3) {
					System.out.print("강사 이름을 입력해주세요 : ");
					String swName = scn.next();

					System.out.print("수영등급을 입력해주세요 : ");

					String grade = scn.next();

					while (true) {
						if (grade.length() > 1) {
							System.out.println("한문자만 입력하세요. 등급은 (A, B, C, D) \n다시 입력해주세요 :");
							grade = scn.next();
						} else
							break;
					}

					Member memberSwim = new SwimMember(id, name, phone, swName, grade);
					Ms.addMember(memberSwim);
				} else {
					System.out.println("잘못된 번호입니다.");
				}
			} else if (menu == 2) {
				int no = 0;
				while (true) {
					try {
						System.out.println("연락처를 수정할 학생 번호를 입력해주세요");
						no = scn.nextInt();
						break;
					} catch (InputMismatchException e) {
						System.out.println("숫자를 입력하세요.");
						scn.nextLine();
					}
				}
				Member mb = new Member(no, null, null);
				Ms.modifyMember(mb);
			} else if (menu == 3) {
				for (Member s : members) {
					System.out.println(s.toString());
					System.out.println();
				}
			} else if (menu == 9) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("잘못된 번호입니다. 다시입력해주세요.");
			}
		}
	}
}
