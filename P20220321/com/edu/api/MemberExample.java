package com.edu.api;

import java.util.ArrayList;
import java.util.HashSet;

public class MemberExample {
	public static void main(String[] args) {
		Member m1 = new Member("user1", "홍길동");
		Member m2 = new Member("user1", "홍길동");

		if (m1 == m2) {
			System.out.println("논리적으로 같습니다.");
		} else {
			System.out.println("논리적으로 다릅니다.");
		}

		// 배열 -> 컬렉션(ArrayList, HashSet, HashMap) : 여러개의 값을 저장.
		Member[] memberAry = new Member[5]; // Member의 인스턴스 최대 5개 저장.
											// 크기 초과하면 새로운 배열 선언. 복사.
		ArrayList<Member> memList = new ArrayList<Member>();
		memList.add(new Member("user1", "홍길동"));
		memList.add(new Member("user1", "홍길동"));

		for (int i = 0; i < memList.size(); i++) {
			System.out.println(memList.get(i));
		}

		HashSet<Member> memSet = new HashSet<Member>(); // hashCode(), equals()
		memSet.add(new Member("user1", "홍길동"));
		memSet.add(new Member("user1", "홍길동"));

		System.out.println(memSet.size());

	}
}