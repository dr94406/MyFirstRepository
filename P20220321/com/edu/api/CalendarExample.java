package com.edu.api;

import java.util.Calendar;

public class CalendarExample {
	public static void main(String[] args) {

		int year = 2022;
		int month = 2; // +1월을 해야한다.
		int day = 1; // 오늘이 1일이라는 의미이다.
		creatCalendar(year, month, day);

	}

	public static void creatCalendar(int year, int month, int day) {
		Calendar today = Calendar.getInstance();
		today.set(year, month, day);

		System.out.println("올해는 : " + today.get(Calendar.YEAR));
		System.out.println("이번달은: " + (today.get(Calendar.MONTH) + 1)); // 1월달이 0부터 출력되어서 당연하게도 3월달인 현재가 2로 출력된다.
		System.out.println("오늘은: " + today.get(Calendar.DATE));
		System.out.println("요일정보: " + today.get(Calendar.DAY_OF_WEEK)); // 일:1, 월:2, 화:3 일요일이 시작점이다.
		System.out.println("마지막날의 정보: " + today.getActualMaximum(Calendar.DATE));

		int gapDay = today.get(Calendar.DAY_OF_WEEK);
		int lastDate = today.getActualMaximum(Calendar.DATE);

		// 요일정보출력.
		String[] days = { "Sun", "Mon", "Tue", "Wed", "Thr", "Fir", "Sat" };
		for (int i = 0; i < days.length; i++) {
			System.out.printf("%4s", days[i]);
		}
		System.out.println();
		// 1일의 위치지정.
		for (int i = 1; i < today.get(Calendar.DAY_OF_WEEK); i++) {
			System.out.printf("%4s", "");
		}
		// 날짜를 출력.
		for (int i = 1; i <= lastDate; i++) {
			System.out.printf("%4d", i);
			if ((i + gapDay - 1) % 7 == 0) {
				System.out.println();
			}
		}
		// 프로그램 끝 부분.
		System.out.println("\nend of prog");
	}
}
