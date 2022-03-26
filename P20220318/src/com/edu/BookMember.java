package com.edu;

public class BookMember extends Member{
	
	private String stuName;
	private String stuClass;
	
	public BookMember(int memberId, String memberName, String phone, String stuName, String stuClass) {
		super(memberId, memberName, phone);
		this.stuName = stuName;
		this.stuClass = stuClass;
		
	}
	
	public String getStuName() {
		return stuName;
	}
	public void setStuName(String stuName) {
		this.stuName = stuName;
	}
	public String getStuClass() {
		return stuClass;
	}
	public void setStuClass(String stuClass) {
		this.stuClass = stuClass;
	}
	
	// 도서반 => 기본정보+ 도서반장, 강의실이름
	
	@Override
	public String toString() {
		return "[학생 번호 : " + super.getMemberId() + "	학생 이름 : " + super.getMemberName() + "	학생 연락처 : " + super.getPhone()
		+ "	\n도서반장 이름 : " + stuName + "	강의실 이름 : " + stuClass + "]";
	}
	
	
	
	
	
	
	// 도서반의 반장이름.
	// 도서반의 강의실정보.(지혜실, 지식실, 모험실)
	
	// 정보출력시 => 반장이름: 홍길동, 강의실: 모험실 
}
