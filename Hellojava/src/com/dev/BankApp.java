package com.dev;

import java.util.Scanner;

// BankApp(main method), Account(계좌번호,예금주,잔액) 
public class BankApp { // BankApp 클래스를 실행, 메인메소드를 우선순위로 실행. [line 17]
	static Account[] banks = new Account[100];
	static Scanner scn = new Scanner(System.in);

	// 메뉴: 1.계좌생성(번호,예금주,예금액)
	// 2.예금(번호,예금액) -> 최고예금액 100,000원.
	// 3.출금(번호,출금액) -> 잔액보다 큰 금액 출금 못하도록.
	// 4.잔액조회(번호)
	// 5.종료.
	// 오늘이 자바 4일째인데 ... 벅찬 프로그램입니다...

	public static void main(String[] args) {

		while (true) {
			printMenu();
			int menu = scn.nextInt();

			if (menu == 1) {
				createAccout();
			} else if (menu == 2) {
				deposit();
			} else if (menu == 3) {

				withdraw();
			} else if (menu == 4) {
				findAccountMoney();
			} else if (menu == 5) {
				System.out.println("프로그램을 종료합니다.");
				break;
			} else if (menu == 9) {
				showList();
			}

		}
		System.out.println("=== End of Prog ===");
	} // end of main()

	// 메뉴출력 기능.
	public static void printMenu() {
		String menu = "=========================================================\r\n" 
				+ "1.계좌생성(번호,예금주,예금액)\r\n" 
				+ "2.예금(번호,예금액) -> 최고예금액 100,000원.\r\n"
				+ "3.출금(번호,출금액) -> 잔액보다 큰 금액 출금 못하도록.\r\n" 
				+ "4.잔액조회(번호)\r\n"
				+ "5.종료.\r\n"
				+ "=========================================================\r\n" + "+선택>	";

		System.out.println(menu);
	}

	// 계좌생성 메소드.
	public static void createAccout() {
		System.out.println("계좌생성가능.");
		System.out.print("계좌번호입력>> ");
		String accNo = scn.next(); // 사용자의 코드를 문자열 형태로 반환해준다.
		System.out.print("예금주입력 >>");
		String accName = scn.next();
		System.out.print("예금액입력 >>");
		int accMoney = scn.nextInt();
		Account accnt = new Account(accNo, accName, accMoney); // 초기화하는데, 이러한 것들을 가지고 초기화 하겠습니다.

		for (int i = 0; i < banks.length; i++) {
			if (banks[i] == null) {
				banks[i] = accnt;
				break;

			}
		}

		System.out.println("계좌가 정상적으로 생성되었습니다.");
	}

	// 예금 메소드.
	public static void deposit() {
		System.out.println("예금기능.");
		System.out.println("계좌번호>>");
		String ano = scn.next();
		System.out.println("예금액 입력>>");
		int amt = scn.nextInt();
		int checkCnt = 0; // 조회가 됐는지 체크 여부 변수.
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null && banks[i].getAccNo().equals(ano)) { // 계좌번호 있을 경우..
				// 계좌번호 조회됐을 때..
				checkCnt = 1;
				int currAmt = banks[i].getMoney();
				
				// 예금액이 10만원을 초과하지  못하도록..
				if (currAmt + amt > 100000) {
					checkCnt = 2;
					break;
				}
				banks[i].setMoney(currAmt + amt); // 잔액 + 입금액
				break;
			}
		}
		if (checkCnt == 1) {

			System.out.println("정상적으로 처리되었습니다.");
		} else if (checkCnt == 2) {
			System.out.println("한도금액을 초과했습니다.");

		} else {
			System.out.println("계좌번호가 없습니다.");

		}
	}

	// 출금 메소드.
	public static void withdraw() {
		System.out.println("출금기능.");
	}

	// 잔액조회 메소드.
	public static void findAccountMoney() {
		System.out.println("조회기능.");
	}

	// 전체리스트 출력.
	public static void showList() {
		for (int i = 0; i < banks.length; i++) {
			if (banks[i] != null) {
				System.out.println(banks[i].toString());
			}
		}
	}
}