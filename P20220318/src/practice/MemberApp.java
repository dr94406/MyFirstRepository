package practice;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MemberApp {

    List<Member> members = new ArrayList<Member>();

    Scanner scn = new Scanner(System.in);

    class MemberServiceImpl implements MemberService {

        @Override
        public void addMember(Member member) {
            // TODO Auto-generated method stub
            members.add(member);
        }

        @Override
        public void modifyMember(Member member) {
            // TODO Auto-generated method stub
        	System.out.println("수정할 전화번호를 입력해주세요.");
        	String newNumber = "";
        	
        	scn.nextLine();
        	
        	newNumber = scn.nextLine();
        	
        	member.setPhone(newNumber);
        }

        @Override
        public List<Member> memberList() {
            // TODO Auto-generated method stub
            return members;
        }
    }

    public void execute() {
        int menu = 0;

        int id = 0;
        String memberName = "";
        String phoneNumber = "";

        //인터페이스				  //구현객체
        MemberService service = new MemberServiceImpl();


        Loop1:
        for(;true;){
        	
            System.out.println("메뉴를 입력하세요.");
            System.out.println("1. 등록 / 2.수정 / 3. 전체리스트 / 9. 종료");

            menu = scn.nextInt();
            
            Loop2:
            for(;true;) {
                if(menu==1) {
                    System.out.println("들어가고 싶은 반을 선택하세요.");
                    System.out.println("[ 1. 도서반 / 2. 축구반 / 3. 수영반 ]");

                    menu = scn.nextInt();
                    System.out.println("ID를 입력해주세요.");
                    id = scn.nextInt();

                    
                    scn.nextLine();
                    
                    System.out.println("이름을 입력해주세요.");
                    memberName = scn.nextLine();

                    System.out.println("전화번호를 입력해주세요.");
                    phoneNumber = scn.nextLine();


                    if (menu == 1) {

                        System.out.println("도서반장 이름을 입력해주세요.");
                        String leaderName = scn.nextLine();

                        System.out.println("도서실 이름을 입력해주세요.");
                        String className = scn.nextLine();

                        BookMember bookMember = new BookMember(id, memberName, phoneNumber, leaderName, className);

                        service.addMember(bookMember);

                        System.out.println("입력을 완료했습니다.");
                        System.out.println();
                        break Loop2;

                    } else if (menu==2) {
                        System.out.println("축구반 코치 이름을 입력해주세요.");
                        String coachName = scn.nextLine();

                        System.out.println("라커룸 이름을 입력해주세요.");
                        String lockerRoomName = scn.nextLine();

                        SoccerMember soccerMember = new SoccerMember(id, memberName, phoneNumber, coachName, lockerRoomName);


                        service.addMember(soccerMember);

                        System.out.println("입력을 완료했습니다.");
                        System.out.println();

                        break Loop2;

                    } else if (menu==3) {

                        System.out.println("수영반 코치 이름을 입력해주세요.");
                        String coachName = scn.nextLine();

                        System.out.println("수영등급을 입력해주세요.");
                        String swimmingRank = scn.nextLine();

                        SwimMember swimMember = new SwimMember(id, memberName, phoneNumber, coachName, swimmingRank);

                        service.addMember(swimMember);

                        System.out.println("입력을 완료했습니다.");
                        System.out.println();

                        break Loop2;
                    }
                } else if (menu==2){
                	System.out.println("개인정보를 수정하겠습니다.");
                	for(Member m : service.memberList()) {
                		service.modifyMember(m);
                	}
                	
                    break Loop2;
                } else if (menu==3){
                	System.out.println("정보를 출력하겠습니다.");
                    List<Member> list = service.memberList();
                    System.out.println(list.size());
                    
                    for(Member m : list) {
                    	System.out.println(m.toString());
                    }
                    
                    break Loop2;
                } else if (menu==9){
                	System.exit(0);
                }
            }
        }

    }
}
