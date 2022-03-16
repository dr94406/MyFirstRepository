package com.prod;

public class Car { // 가속 = 10km씩 가속하는 기능 감속 = 10km씩 감속하는 기능
	// 모델, 현재속도, 최고속도, 가속(), 감속(), 현재속도()
	private String model;
	private int speed;
	private int maxSpeed;

	public void setModel(String model) {
		this.model = model;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public void addSpeed() {
		if (this.speed + 10 >= this.maxSpeed) {
		System.out.println("최고속도를 초과할 수 없습니다.");
		return;
		}
		System.out.println("10km 가속합니다.");
		this.speed += 10; // 현재속도 10을 가속하는 메소드.
	}

	public void breakSpeed() {
		System.out.println("10km 감속합니다.");
		this.speed -= 10;
	}

	public int getSpeed() {
		return this.speed;
	}
}
