package com.test;

public class HighStudent extends Student{
	private String teacherName; // 담임선생님.
	private String groupName; // 반이름.
	
	
	public HighStudent(int studNo, String studName, String phone,String teacherName, String groupName) {
		super(studNo, studName, phone);
		this.teacherName = teacherName;
		this.groupName = groupName;
	}
	
	
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getGroupName() {
		return groupName;
	}
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}


	@Override
	public String toString() {
		return "[학생 번호: " + super.getStudNo() + " 학생 이름 : " + super.getStudName() + " 학생 연락처: " + super.getPhone()
		+ "\n담임선생님 이름: " + teacherName + " 반 이름 : " + groupName + "]";
	}

	
	
	
}
