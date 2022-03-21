package com.edu;

public class Taxi extends Vehicle {
	
	public Taxi() {
		super.setMaxSpeed(120);
	}
	
	@Override
	public void run() {
		System.out.println("Taxi가 달립니다.");
	}

	@Override
	public void stop() {
		System.out.println("Taxi가 멈춥니다.");
	}

	@Override
	public String toString() {
		return  "택시의 최고속도는 " + getMaxSpeed() + "입니다.";
	}

}
