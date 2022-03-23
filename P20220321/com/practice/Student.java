package com.practice;

public class Student {

	private int studNom;
	private String studName;
	private int korScore = -1;
	private int mathScore = -1;
	private int engScore = -1;

	public Student(int studNo, String studName, int korScore, int mathScore, int engScore) {
		super();
		this.studNom = studNo;
		this.studName = studName;
		this.korScore = korScore;
		this.mathScore = mathScore;
		this.engScore = engScore;
	}

	public Student(int studNo, String studName) {
		this.studNom = studNo;
		this.studName = studName;
	}

	public void setStudNo(int studNo) {
		this.studNom = studNo;
	}

	public int getStudNo() {
		return this.studNom;
	}

	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	public int getMashScore() {
		return mathScore;
	}

	public void setMashScore(int mashScore) {
		this.mathScore = mashScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}
}
