package com.edu.interfaces;

public class Refrigerator implements RemoteControl {
	public void on() {
		System.out.println("냉장고를 켭니다.");
	}

	public void off() {
		System.out.println("냉장고를 끕니다.");
	}
	// 실제 구성은 밑의 오버라이드를 참조한다.
	@Override
	public void powerOn() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void powerOff() {
		// TODO Auto-generated method stub
		
	}
}
