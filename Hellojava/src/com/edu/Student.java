package com.edu;

public class Student {

	// 학생번호, 학생이름, 국어점수, 수학점수, 영어점수 <= 필드정의.
	private int studNo;
	private String studName;
	private int korScore = -1;
	private int mathScore = -1;
	private int engScore = -1;

	// 생성자: 필드의 값을 초기화..
	public Student() { // Student class의 생성자를 정의, public가 기본값이다.
		this.studNo = 1;
		this.studName = "Nobody";
		this.korScore = 0;
		this.engScore = 0;
	}

	public Student(int studNo) {
		this.studNo = studNo;
	}

	public Student(int studNo, String studName, int korScore, int mathScore, int engScore) {
		super();
		this.studNo = studNo;
		this.studName = studName;
		this.korScore = korScore;
		this.mathScore = mathScore;
		this.engScore = engScore;
	}

	public Student(int studNo, String studName) {
		this.studNo = studNo;
		this.studName = studName;
	}
	// 메소드...
	public static void callStatic() {
		System.out.println("정적메소드 실행...");
	}
	// 영어,국어,수학 ==> 값이 저장되면 평균...
	public double getAvgScore() {
		return this.getSumScore() / 3.0;
	}

	// 영어,국어,수학 ==> 합계점수...
	public int getSumScore() {
		if (this.korScore != -1 && this.engScore != -1 && this.mathScore != -1) {
			return this.korScore + this.engScore + this.mathScore;
		}
		return -1;
	}

	// 기능(method) => 규칙 반환값 메소드명 매개변수 { }
	public void setStudNo(int studNo) {
		this.studNo = studNo;
	}

	public int getStudNo() {
		return this.studNo;
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

	public String getStudInfo() {
		String str = "===================================";
		str += "\n 학생이름: " + this.getStudName() + " 이고";
		str += "\n 학번: " + this.getStudNo() + " 이고";
		str += "\n 평균: " + String.format("%.2f", this.getAvgScore()) + " 입니다.";
		str += "\n===================================\n";
		return str;
	}
}
