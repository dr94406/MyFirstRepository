package com.edu.api;

public class IDCheck {
	
	public String getGender2(String ssn) {
		String newSsn = ssn.replace("-", "");
		newSsn = newSsn.replace(" ", "");
		String result = null;
		if (ssn.length() == 13) { // 8번째
			char no = ssn.charAt(6); // 1 => ??
			if (no == '1' || no == '3') {
				result = "남자입니다.";
			} else if (no == '2' || no == '4') {
				result = "여자입니다.";
			} else {
				result = "잘못된 번호입니다.";
			}
		}else {
			result = "잘못된 번호입니다.";
		}
		return result;
		
					
		}
	// 주민번호 입력 -> 950304-1234567, 000205-4567890
	// 950304-1234567, 950304 1234567, 9503041234567

	// String getGender() -> 남자, 여
	public String getGender(String ssn) {
		String result = null; // 초기화.
		if (ssn.length() == 14) { // 8번째
			char no = ssn.charAt(7); // 1 => ??
			if (no == '1' || no == '3') {
				result = "남자입니다.";
			} else if (no == '2' || no == '4') {
				result = "여자입니다.";
			} else {
				result = "잘못된 번호입니다.";
			}

		} else if (ssn.length() == 13) { // 7번째
			char no = ssn.charAt(6); // 1 => ??
			if (no == '1' || no == '3') {
				result = "남자입니다.";
			} else if (no == '2' || no == '4') {
				result = "여자입니다.";
			} else {
				result = "잘못된 번호입니다.";
			}

		}
		return result;
	}
}