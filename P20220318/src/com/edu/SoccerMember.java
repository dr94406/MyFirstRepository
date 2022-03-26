package com.edu;

public class SoccerMember extends Member{
	// 축구반의 코치이름.
	// 락커룸의 이름.(A, B, C, D)
	
	// 정보출력시 => 코치이름: 홍길동, 락커룸: A 
	
	private String sccName;
	private String sccClass;
	
	public SoccerMember(int memberId, String memberName, String phone, String sccName
	,String sccClass) {
		super(memberId, memberName, phone);
		this.sccName = sccName;
		this.sccClass = sccClass;
		// TODO Auto-generated constructor stub
	}
	public String getSccName() {
		return sccName;
	}
	public void setSccName(String sccName) {
		this.sccName = sccName;
	}
	public String getSccClass() {
		return sccClass;
	}
	public void setSccClass(String sccClass) {
		this.sccClass = sccClass;
	}
	// 축구반 => 기본정보+ 코치이름, 락커룸이름
	@Override
	public String toString() {
		return "[학생 번호 : " + super.getMemberId() + "	학생 이름 : " + super.getMemberName() + "	학생 연락처 : " + super.getPhone()
		+ "\n코치 이름 : " + sccName + "	락커룸 이름 : " + sccClass+ "]";
	}
	
	
	
}
