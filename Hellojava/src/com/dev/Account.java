	package com.dev;

	public class Account {
		// 계좌정보, 예금주, 예금액
		// field.
		
		private String accNo;
		private String accName;
		private int money;

		// constructor
		public Account(String accNo, String accName, int money) { // 계좌정보, 예금주, 예금액
			super();
			this.accNo = accNo;
			this.accName = accName;
			this.money = money;
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
