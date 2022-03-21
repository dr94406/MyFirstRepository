package com.edu;

public class Person  extends Object {
	// field. 필드, Person이라는 클래스에 값을 넣는 기능.
	private String name;
	private int age; 
	private double height;
	private double weight;
	

	
	// constructor. 생성자
	// overloading.(중복선언)

	public Person() {
		
	}
	public Person(String name) {
		this.name = name;
	}
	public Person(String name, int age, double height, double weight) {
		this.name = name;
	      this.age = age;
	      this.height = height;
	      this.weight = weight;

	}
	// method. 메소드, 사용하는 이유는 필드에 넣은 값을 지정하거나 가져올 때 사용.
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return this.age;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return this.height;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public double getWeight() {
		return this.weight;
	}
}
