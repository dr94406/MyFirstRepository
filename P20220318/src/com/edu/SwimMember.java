package com.edu;

public class SwimMember extends Member{
	// 강습반의 강사이름.
	// 수영등급(A,B,C,D)
	
	// 정보출력시 => 강사이름: 홍길동, 등급: A 
	
	private String swimName;
	private String swimClass;
	
	public SwimMember(int memberId, String memberName, String phone, String swimName, String swimClass) {
		super(memberId, memberName, phone);
		this.swimName = swimName;
		this.swimClass =swimClass;
	}
	public String getSwimName() {
		return swimName;
	}
	public void setSwimName(String swimName) {
		this.swimName = swimName;
	}
	public String getSwimClass() {
		return swimClass;
	}
	public void setSwimClass(String swimClass) {
		this.swimClass = swimClass;
	}
	
		// 수영반 => 기본정보+ 강사이름, 수영등급
	@Override
	public String toString() {
		return "[학생 번호 : " + super.getMemberId() + "	학생 이름 : " + super.getMemberName() + "	학생 연락처 : " + super.getPhone()
		+ "\n수영강사 이름 : " + swimName + "	수영 등급 : " + swimClass+ "]";
	}
	
	
	
	
	
}
