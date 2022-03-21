package com.edu;

public class FriendListApp {
	public static void main(String[] args) {
		Friend [] friends = new Friend[10];
		
		Friend f1 = new Friend();
		f1.setName("김영민");
		f1.setAge(23);
		f1.setHeight(172);
		f1.setWeight(78);
		f1.setPhone("010-1234-4428");
		
		UnivFriend f2 = new UnivFriend("전민욱", 29, 178.3, 69.2, "010-1111-2222");
		f2.setUniversity("대구대학교");
		f2.setMajor("컴퓨터공학과");
		
		ComFriend f3 = new ComFriend(" 김형민", 23, 179.3, 65.2, "010-9176-4428", "퓨전소프트", "백앤드개발자");
	
		friends[0] = f1;
		friends[1] = f2;
		friends[2] = f3;
//		friends[3] = f4;
//		friends[4] = f5;
//		friends[5] = f6;
		
		// 학교친구...출력. = 학교 친구만을 출력하라는 건가 ? 무슨 의미일까 ?
		for(int i=0; i< friends.length; i++) {
			if(friends[i] != null)// && friends[i] instanceof UnivFriend)
					// 동일한 기능이지만 ㅇ니스턴스종류에 다른 결과실행. => 다형성.
			System.out.println(friends[i].toString());
		}
		
		Friend friend = f2; // UnivFriend; getUniversity, getMajor // 자동 형변환 발생
		friend = f1; 
		UnivFriend uni = null; //(UnivFriend) friend; // 강제 형변환으로 값을 담기.
		if (friend instanceof UnivFriend) { // friend변수값이  UnivFriend의 인스턴스인지
			uni = (UnivFriend) friend; // Casting 해야함.
			uni.getUniversity(); // 부모클래스의 참조변수 => 자식클래스의 참조변수 할당.
		}
	}
}
