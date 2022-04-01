package com.edu;

public class CollegeStudent extends Student {
	public CollegeStudent(int studentId, String studentName, String phone) {
		super(studentId, studentName, phone);
		// TODO Auto-generated constructor stub
	}
	// 축구반의 코치이름.
	// 락커룸의 이름.(A, B, C, D) 중 1개가 출력되게
	private String GyosuName;
	private String JeongongName;
	public String getGyosuName() {
		return GyosuName;
	}
	public void setGyosuName(String gyosuName) {
		GyosuName = gyosuName;
	}
	public String getJeongongName() {
		return JeongongName;
	}
	public void setJeongongName(String jeongongName) {
		JeongongName = jeongongName;
	}
	@Override
	public String toString() {
		return "College [GyosuName=" + GyosuName + ", JeongongName=" + JeongongName + ", getStudentId()="
				+ getStudentId() + ", getStudentName()=" + getStudentName() + ", getPhone()=" + getPhone() + "]";
	}
}