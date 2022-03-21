package com.edu.abstracts;

public class AnimalExample {
	public static void main(String[] args) {
//		Animal animal = new Animal(); // 인스턴스 생성불가
		Animal animal = null;
		animal = new Dog();
		animal.setName("코코");
		animal.eat();
		animal.speak();
		
		animal = new Cat();
		animal.setName("치즈");
		animal.eat();
		animal.speak();
	}
}
