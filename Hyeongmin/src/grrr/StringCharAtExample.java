package grrr;

public class StringCharAtExample {
	public static void main(String[] args) {
		String ssnString = "010624-1230123";
		char sex = ssnString.charAt(7);
		switch (sex) {
		case '1':
		case '3':
			System.out.println("남자 입니다.");
			break;

		}
	}
}
