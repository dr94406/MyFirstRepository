package com.test;

public class Student {
	private String studNo; // 학생번호.
	private String studName; // 학생이름.

	public Student(String studNo, String studName) {
		super();
		this.studNo = studNo;
		this.studName = studName;
	}

	public String getStudNo() {
		return studNo;
	}

	public void setStudNo(String studNo) {
		this.studNo = studNo;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	@Override
	public String toString() {
		return "Student [studNo=" + studNo + ", studName=" + studName + "]";
	}

}
