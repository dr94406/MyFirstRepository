package com.test;

public class CollegeStudent extends Student{

	private String profName; // 담당교수.
	private String major; // 전공정보.

	public CollegeStudent(int studNo, String studName, String phone, String profName, String major) {
		super(studNo, studName, phone);
		this.profName = profName;
		this.major = major;
	}

	public String getProfName() {
		return profName;
	}

	public void setProfName(String profName) {
		this.profName = profName;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	@Override
	public String toString() {
		return "[학생 번호: " + super.getStudNo() + " 학생 이름 : " + super.getStudName() + " 학생 연락처: " + super.getPhone()
				+ "\n담당교수 이름: " + profName + " 전공 정보 : " + major + "]";

	}

}