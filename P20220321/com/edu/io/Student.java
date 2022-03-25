package com.edu.io;

import java.io.Serializable;

public class Student implements Serializable {
	// 학생번호(1,2,3), 이름(홍길동), 영어(80), 국어(70).
	
	// 생성자 : 기본생성자, 매개값이 4개 생성자.
	
	// Getter, Setter 생성
	int StudentNumber= 300;
	String StudentName = "김형민";
	int EngScore = 80;
	int KorScore = 70;
	public int getStudentNumber() {
		return StudentNumber;
	}
	public void setStudentNumber(int studentNumber) {
		StudentNumber = studentNumber;
	}
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public int getEngScore() {
		return EngScore;
	}
	public void setEngScore(int engScore) {
		EngScore = engScore;
	}
	public int getKorScore() {
		return KorScore;
	}
	public void setKorScore(int korScore) {
		KorScore = korScore;
	}
	public Student(int studentNumber, String studentName, int engScore, int korScore) {
		super();
		StudentNumber = studentNumber;
		StudentName = studentName;
		EngScore = engScore;
		KorScore = korScore;
	}
	public Student() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [번호:" + StudentNumber + ", 이름:" + StudentName + ", 영어:" + EngScore
				+ ", 국어:" + KorScore + "]";
	}
}
