package com.test;

// 책(책 제목, 저자, 출판사, 가격)

// Book클래스를 선언(필드:책제목, 저자, 출판사, 금액) 
public class Book {

	// 책 이름, 필드
	private String Name;
	private String Writer;
	private String Pub;
	private int Price;

	public Book(String Name, String Writer, String Pub, int Price) {
		super();
		this.Name = Name;
		this.Writer = Writer;
		this.Pub = Pub;
		this.Price = Price;

	}

	// 생성자: 필드의 값을 초기화.. // 이름,저자,출판사,가격

	// 메소드

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		this.Name = name;
	}

	public String getWriter() {
		return Writer;
	}

	public void setWriter(String Writer) {
		this.Writer = Writer;
	}

	public String getPub() {
		return Pub;
	}

	public void setPub(String pub) {
		this.Pub = pub;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		this.Price = price;
	}

	public void printInfo() {

		String str = "------------------\n" //
				+ " 제목\t" + this.Name + "\n" //
				+ " 저자\t" + this.Writer + "\n" //
				+ " 출판사\t" + this.Pub + "\n" //
				+ " 금액\t" + this.Price + "\n" //
				+ "------------------";
		System.out.println(str);
	}
}
