package com.test;

public class Student {
	private int studNo; // 학생번호.
	private String studName; // 학생이름.
	private String phone; // 휴대폰 
	
	
	
	
	public Student(int studNo, String studName, String phone) {
		this.studNo = studNo;
		this.studName = studName;
		this.phone = phone;
	}

	public int getStudNo() {
		return studNo;
	}

	public void setStudNo(int studNo) {
		this.studNo = studNo;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Student [studNo=" + studNo + ", studName=" + studName + ", phone=" + phone + "]";
	}

}
