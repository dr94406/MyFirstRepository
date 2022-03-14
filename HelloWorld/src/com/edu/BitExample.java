package com.edu;

public class BitExample {
    public static void main(String[] args) {
		int num = 10;
		int result = num << 3; // ">>" 값을 오른쪽으로 2칸 이동
		System.out.println(result);
		System.out.println(result);
		int val = 100; //오른쪽에 있는 값을 왼쪽 val에게 담겠습니다. 대입연산자
		val = val + 10;
		System.out.println(val);
		val += 20; // 10번째 줄이랑 동일
		System.out.println(val);
		val = val - 5; //빼기
		System.out.println(val);
		val -= 10;
		System.out.println(val);
		val = val * 2; //230
	    System.out.println(val);
	    val *= 2; //460
	    System.out.println(val);
	    
	    String message = "반갑습니다,";
	    System.out.println(message);
	    
	    message = message + " 이창호입니다.";
	    System.out.println(message);
	    
	    message += " 좋은 하루 되세요~";
	    System.out.println(message);
	    
	    
	   int cnt = 0;
	   cnt = cnt + 1;
	   cnt += 1;
	   cnt++; //++ = 증강연산자
	   cnt--;
	   System.out.println(cnt);
	   
		
	}
}