package com.edu.collect;

import java.io.Serializable;

public class Student implements Serializable {
	// 학생번호(1,2,3), 이름(홍길동), 영어(80), 국어(70).
	private int StudentNo;
	private String StduentName;
	private int EngScore;
	private int KorScore;

	// 생성자 : 기본생성자, 매개값이 4개 생성자.
	public Student() {

	}

	public Student(int studentNo, String name, int engScore, int korScore) {
		super();
		this.StudentNo = studentNo;
		this.StduentName = name;
		this.EngScore = engScore;
		this.KorScore = korScore;
	}

	public int getStudentNo() {
		return StudentNo;
	}

	public void setStudentNo(int studentNo) {
		StudentNo = studentNo;
	}

	public String getStduentName() {
		return StduentName;
	}

	public void setStduentName(String stduentName) {
		StduentName = stduentName;
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

	@Override
	public String toString() {
		return "학생정보 [학생번호=" + StudentNo + ", 이름=" + StduentName + ", 영어=" + EngScore + ", 국어=" + KorScore + "]";
	}
}
