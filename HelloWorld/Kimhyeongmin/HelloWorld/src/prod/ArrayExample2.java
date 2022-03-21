package com.prod;

public class ArrayExample2 {
	public static void main(String[] args) {
	// age 
	// int - age 20,23,27살
	// 20살 입니다.
	// 23살 입니다.
	// 27살 입니다.

	int sum = 0;
	double avg =sum / (double) 3;
	int[] Age = new int[3];
	Age[0] = 20;
	Age[1] = 23;
	Age[2] = 27;
	
	sum = 0;
	for (int i = 0; i < 3; i++) {
	System.out.println(Age[i]);
	sum += Age[i];
	
	double Avg =sum / (double) 3;
	System.out.println("평균은 " + Avg);
		


}
}
}
