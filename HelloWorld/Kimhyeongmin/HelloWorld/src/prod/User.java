package com.prod;

public class User {

	// 사용자아이디, 사용자등급(A,B,C), 사용자연락처, 사용자포인트
	private String userId;
	private String userGrade;
	private String userPhone;
	private int userPoint; // 숨기는 항목을 private로 입력

	// User Id
	public void setuserId(String userId) {
		this.userId = userId;
	}

	public String getuserId() {
		return this.userId;
	}

	public void setuserGrade(String userGrade) {
		this.userGrade = userGrade;

	}

	public String getuserGrade() {
		return this.userGrade;
	}

	public void setuserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getuserPhone() {
		return this.userPhone;
	}

	public void setuserPoint(int userPoint) {
		this.userPoint = userPoint;
	}

	public int getuserPoint() {
		return this.userPoint;
	}

	public String getuserInfo() {
		String result = this.userId + "의 등급은" + //
				this.userGrade + "입니다." + "김형민의 포인트는" + this.userPoint + " 입니다.";
		return result;

	}
}
