package com.edu.lambda.consumer;

import java.util.function.*; // * 기능으로 모두 임포트 선언 

public class ConsumerExample {
	public static void main(String[] args) {

		// functional interface : 람다표현식 가능.
		Consumer<String> consumer = (t) -> {
			System.out.println(t + " 출력합니다.");
		};
		consumer.accept("메세지를 ");

		BiConsumer<Integer, Integer> biCon = (t, u) -> {
			System.out.println("result => " + (t + u));
		};
		biCon.accept(20, 40);
	}
}
