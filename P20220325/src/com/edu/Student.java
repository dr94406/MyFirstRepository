package com.edu;

public class Student { //공통된 정보 
		//필드.
	private int studentId;
	private String studentName;
	private String phone;
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Student(int studentId, String studentName, String phone) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.phone = phone;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", phone=" + phone + "]";
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
}