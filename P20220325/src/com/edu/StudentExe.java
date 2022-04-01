package com.edu;

// 앱이 시작시 맨처음 실행되는 클래스. 실행하면 app가 되게
public class StudentExe {
	public static void main(String[] args) {
		StudentApp app = new StudentApp(); // 인스턴스 
		app.execute();
		// 메뉴: 1.등록 2.수정 3.리스트 9/종료
		// 1) 고등학생 => 담임교사,학년 
		// 2) 대학생 => 담당교수, 전공과목 
	}
}
