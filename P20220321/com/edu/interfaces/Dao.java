package com.edu.interfaces;

public interface Dao extends RemoteControl, Run {
	// 추상메소드 추상클래스와 비슷하지만, 메소드에 대한 부분만 선언합니다.
	public abstract void select();

	public void insert();

	public void update();

	public void delete();
}
