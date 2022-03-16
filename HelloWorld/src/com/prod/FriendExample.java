package com.prod;

public class FriendExample {
	public static void main(String[] args) {
		// 친구의 정보(이름, 전화번호, 이메일, 키, 몸무게)
		Friend f1 = new Friend();
		f1.friendName = "김형민";
		f1.friendPhone = "010-9176-4428";
		f1.email = "khm@email.com";
		f1.height = 152.3;
		f1.weight = 76.9;

		Friend f2 = new Friend();
		f2.friendName = "김동생민";
		f2.friendPhone = "010-4576-4428";
		f2.email = "kdm@email.com";
		f2.height = 172.3;
		f2.weight = 76.9;

		Friend f3 = new Friend();
		f3.friendName = "김향민";
		f3.friendPhone = "010-9795-4428";
		f3.email = "hm@email.com";
		f3.height = 162.3;
		f3.weight = 51.5;
		System.out.println(f1);

		Friend[] friends = { f1, f2, f3 };

		for (int i = 0; i < friends.length; i++) {
			if (friends[i].height < 170) {
				System.out.println("이름: " + friends[i].friendName);
				System.out.println("전화번호: " + friends[i].friendPhone);
				System.out.println("키: " + friends[i].height);
				System.out.println("============================");
			}
		}
	}
}