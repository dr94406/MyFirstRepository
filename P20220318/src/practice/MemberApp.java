package practice;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.edu.SoccerMember;

public class MemberApp {

	List<Member> members = new ArrayList<Member>();

	Scanner scn = new Scanner(System.in);

	// MemberService를 구현하는 구현클래스를 선언.
	class MemberServiceImpl implements MemberService {

		@Override
		public void addMember(Member member) {
			members.add(member); // 멤버를 추가하겠습니다.
		}

		@Override
		public void modifyMember(Member member) {

		}

		@Override
		public List<Member> memberList() {
			return members;
		}
	}

	public void execute() {
		int menu = 0; // 계속 사용하는 것이니 초기화를 통해 간결하게 만들어준다.
		int memberId = 0; // id는 숫자만 들어가야하는 정수이니 0으로 초기화
		String memberName = ""; // 스트링은 참조형이니 ""를 넣어 초기화.
		String phone = ""; // 스트링은 참조형이니 ""를 넣어 초기화.

		// 인터페이스 //구현객체
		MemberService service = new MemberServiceImpl();
		Loop1: for (; true;) {

			System.out.println("메뉴를 입력하세요.");
			System.out.println("1.등록  /2.수정  /3.전체리스트  / 9.종료");

			menu = scn.nextInt();

			Loop2: for (; true;) {
				if (menu == 1) {
					System.out.println("원하는 반을 선택하세요.");
					System.out.println("[ 1. 도서반 / 2.축구반 / 3. 수영반]");

					menu = scn.nextInt();
					System.out.println("ID를입력해주세요.");
					memberId = scn.nextInt();

					scn.nextLine();
					
					System.out.println("이름을 입력해주세요.");
					memberName = scn.nextLine();

					System.out.println("전화번호를 입력해주세요.");
					phone = scn.nextLine();

					if (menu == 1) {
						System.out.println("도서반장 이름을 입력하세요.");
						String BookName = scn.nextLine();

						System.out.println("도서실 이름을 입력해주세요.");
						String BookClass = scn.nextLine();
						
						BookMember bookMember = new BookMember(memberId, memberName, phone);
						
						service.addMember(bookMember);
						
						System.out.println("입력을 완료했습니다.");
						System.out.println();
						break Loop2;
						
					} else if (menu == 2) {
						System.out.println("축구반 코치 이름을 입력하세요.");
						String SoccerName = scn.nextLine();
						
						System.out.println("라커룸 이름을 입력해주세요.");
						String SoccerClass = scn.nextLine();
						
						SoccerMember soccerMember = new SoccerMember(memberId, memberName, phone, SoccerName,
								SoccerClass);
						
						service.addMember(soccerMember);
					}

				}
			}
		}
	}
}