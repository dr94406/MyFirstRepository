package practice;

import java.security.Provider.Service;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MemberApp {

	List<Member> members = new ArrayList<Member>();
	Scanner scn = new Scanner(System.in);

	public MemberApp() {

	}

	// MemberService 를 구현하는 구현클래스를 선언.
	class MemberServiceImple implements MemberService {

		@Override
		public void addMember(Member member) {
			members.add(member);
		}

		@Override
		public void modifyMember(Member member) {
			for (int i = 0; i < members.size(); i++) {
				if (members.get(i).getMemberId() == member.getMemberId()) {
					members.get(i).setPhone(member.getPhone());
				}
			}
		}

		@Override
		public List<Member> memberList() {
			return members;
		}

	}

	public void execute() {
		MemberService sevice = new MemberServiceImple();
		// 메뉴: 1.등록 2.수정(연락처) 3.전체리스트 9.종료
		// 도서반 : 기본정보+도서반장,강의실이름 > list에 추가
		// 축구반 : 기본정보+코치이름,락커룸정보
		// 수영반 : 기본정보+강서이름,수영등급
		while (true) {
			int s = 0;
			try {
				System.out.println("1등록 2.수정 3.전체리스트 9종료");
				s = scn.nextInt();

			} catch (InputMismatchException e) {

				System.out.println("숫자입력");
				scn.next();
			}

			if (s == 1) {
				System.out.println("선택> 축구반, 도서반, 수영반");
				String s1 = scn.next();
				if (s1.equals("축구반")) {
					System.out.println("ID입력");
					int s2 = scn.nextInt();
					System.out.println("이름입력");
					String s3 = scn.next();
					System.out.println("전화번호");
					String s4 = scn.next();
					System.out.println("코치이름");
					String s5 = scn.next();
					System.out.println("락커룸");
					String s6 = scn.next();
					SoccerMember Sm = new SoccerMember(s2, s3, s4, s5, s6);
					sevice.addMember(Sm);

				} else if (s1.equals("도서반")) {
					System.out.println("ID입력");
					int s2 = scn.nextInt();
					System.out.println("이름입력");
					String s3 = scn.next();
					System.out.println("전화번호");
					String s4 = scn.next();
					System.out.println("반장이름");
					String s5 = scn.next();
					System.out.println("강의실정보");
					String s6 = scn.next();
					BookMember Bm = new BookMember(s2, s3, s4, s5, s6);
					sevice.addMember(Bm);
				} else if (s1.equals("수영반")) {
					System.out.println("ID입력");
					int s2 = scn.nextInt();
					System.out.println("이름입력");
					String s3 = scn.next();
					System.out.println("전화번호");
					String s4 = scn.next();
					System.out.println("강사이름");
					String s5 = scn.next();
					System.out.println("수영등급");
					String s6 = scn.next();
					SwimMember Sum = new SwimMember(s2, s3, s4, s5, s6);
					sevice.addMember(Sum);
				}
			} else if (s == 2) {
				System.out.print("수정할 회원번호를 입력>>");
				int s1 = scn.nextInt();
				System.out.print("수정할 전화번호 입력>>");
				String s2 = scn.next();
				Member s3 = new Member(s1, null, s2);
				sevice.modifyMember(s3);

			} else if (s == 3) {
				List<Member> list = sevice.memberList();
				;
				for (Member a : list) {
					System.out.println(a.toString());
				}
			} else if (s == 9) {
				System.out.println("end");
				break;
			}

		}

	}
}
