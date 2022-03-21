package com.prod;

public class UserExample {
	public static void main(String[] args) {
		// 사용자아이디, 사용자등급(A,B,C), 사용자연락처, 사용자포인트
		User user1 = new User();
		user1.setuserId("김형민");
		user1.setuserGrade("A");
		user1.setuserPhone("010-9176-4428");
		user1.setuserPoint(1000);

		User user2 = new User();
		user2.setuserId("김주환");
		user2.setuserGrade("B");
		user2.setuserPhone("010-1098-7654");
		user2.setuserPoint(1300);

		User user3 = new User();
		user3.setuserId("이유빈");
		user3.setuserGrade("C");
		user3.setuserPhone("010-4567-8910");
		user3.setuserPoint(1400);

		User user4 = new User();
		user4.setuserId("김영민");
		user4.setuserGrade("B");
		user4.setuserPhone("010-4679-4428");
		user4.setuserPoint(1800);

		User user5 = new User();
		user5.setuserId("전민욱");
		user5.setuserGrade("B");
		user5.setuserPhone("010-3456-7890");
		user5.setuserPoint(2000);

		System.out.println(user1.getuserInfo());

		User[] user = { user1, user2, user3, user4, user5 };

		for (int i = 0; i < user.length; i++) {
			if (user[i].getuserGrade() == "A" && user[i].getuserPoint() >= 1000) {
//				System.out.println(user[i].getuserInfo());
			}

		}
	}
}