package com.edu.interfaces;

public class Radio implements RemoteControl {

	public void turnOn() {
		System.out.println("Radio를 켭니다.");
	}

	public void turnOff() {
		System.out.println("Radio를 끕니다.");
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