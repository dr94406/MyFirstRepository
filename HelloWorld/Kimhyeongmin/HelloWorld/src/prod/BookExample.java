package com.prod;

public class BookExample {
	public static void main(String[] args) {
		// 책(책 제목, 저자, 출판사, 가격)

		// book1 => 초기화: 혼공자, 신용권, 한빛미디어, 24000
		// book2 => 초기화: powerJava, 천인국, 인피니티, 35000
		// book3 => 초기화: 재밌는 Java, 이호준, 인피니티, 20000
		Book b1 = new Book();
		b1.bookName = "혼공자";
		b1.writer = "신용권";
		b1.publishing = "인피니티";
		b1.price = 24000;

		Book b2 = new Book();
		b2.bookName = "powerJava";
		b2.writer = "천인국";
		b2.publishing = "인피니티";
		b2.price = 35000;

		Book b3 = new Book();
		b3.bookName = "재밌는 Java";
		b3.writer = "이호준";
		b3.publishing = "인피니티";
		b3.price = 20000;

		Book[] books = { b1, b2, b3 };
		for (int i = 0; i < books.length; i++) {
			if (books[i].price < 25000) {
				System.out.println("책 이름: " + books[i].bookName);
				System.out.println("저자 이름: " + books[i].writer);
				System.out.println("출판사 이름:" + books[i].publishing);
				System.out.println("가격:" + books[i].price);
				System.out.println("============================");
			}
		}
	}
}