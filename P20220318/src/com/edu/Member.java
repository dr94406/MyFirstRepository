package com.edu;

public class Member {
	private int memberId;
	private String memberName;
	private String phone;
	

	public Member(int memberId, String memberName, String phone) {
		this.memberId = memberId;
		this.memberName = memberName;
		this.phone = phone;
	}

	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getMemberName() {
		return memberName;
	}

	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Member [memberId=" + memberId + ", memberName=" + memberName + ", phone=" + phone +  "]";
	}

}
