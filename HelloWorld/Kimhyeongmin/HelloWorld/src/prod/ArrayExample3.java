package com.prod;

public class ArrayExample3 {
	public static void main(String[] args) {
		String[] names = new String[5];
		names[0] = "홍길동";
		names[1] = "234";
		names[2] = "김형민";
		names[3] = "김향민";

		names[1] = "이향숙";
		names[4] = "김쿠키";
		names[0] = null; // 0번째 초기화

		String searchName = "홍길동";
		
		for (int i = 0; i < 5; i++) {
			if (names[i] != null) {
				System.out.println("이름: " + names[i]);

			}
			if(names[i] != null && names[i].equals(searchName)) {
				System.out.println(i+1 + "번째 위치에 있습니다."); //위치상의 순서
		}
	}
	}
}
