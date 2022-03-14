package com.edu;

import java.util.Scanner;

public class CalExample {
   public static void main(String[] args) {
	   // 초(ex: 100초) 입력 > 시/분/초 로 변경하기. 정확하게 하려면 int > double
	   Scanner scn = new Scanner(System.in);
	   int hour, minute, second, inputVal;
	   System.out.println("초 단위 입력(ex: 150)");
	   inputVal = scn.nextInt();
	   hour = inputVal / 3600; // 5000/3600 >  1.얼마
	   minute = (inputVal % 3600) / 60; // 1400 / 60 > 23분
	   second = (inputVal % 3600) % 60; // 1400 % 60 > 20초
	   // 10*2+3-5;
	   
	   System.out.println("초 > 시/분/초 변경 결과 " + hour +"시 " + minute + "분 " + second + "초");
	  
	   scn.close();
   }
}