	package com.dev;

	public class Account {
		// 계좌정보, 예금주, 예금액
		// field.
		
		private String accNo;
		private String accName;
		private int money;
		
		// constructor:생성자. 목적은 필드의 초기값을 지정.
		// Constructor: overloading..
		public Account() {
			System.out.println("기본생성자 호출...");
		}
		public Account(int money) {
			System.out.println("기본생성자 호출..");
		}
		public Account(String accNo, String accName, int money) { // 계좌정보, 예금주, 예금액
			super();
			this.accNo = accNo;
			this.accName = accName;
			this.money = money;
		}
		
		
		
		public Account(String accNo, String accName) {
			super();
			this.accNo = accNo;
			this.accName = accName;
		}
		public static String bankName;
		static {
			bankName = "한일은행";
		}
		public static void showBankName() {
			System.out.println("한일은행입니다.");
		}

		// method.
		public String getAccNo() {
			return accNo;
		}
		public void setAccNo(String accNo) {
			this.accNo = accNo;
		}
		public String getAccName() {
			return accName;
		}
		public void setAccName(String accName) {
			this.accName = accName;
		}
		public int getMoney() {
			return money;
		}
		@Override
		public String toString() {
			return "Account [accNo=" + accNo + ", accName=" + accName + ", money=" + money + "]";
		}
		public void setMoney(int money) {
			this.money = money;
		}
}
