package com.edu;

public class ArraySort {
	public static void sorting(int[] Ary) {
		
		int loopCnt = Ary.length - 1; // 마지막 값이 제일 처음 위치로 이동하려면 배열크기 -1;
		for (int cnt = 0; cnt < loopCnt; cnt++) { // 이 것과 16번 라인을 주석처리 해제 할 시에 12, 25, 34, 48 순으로 배열된다.
			int temp = Ary[0];
			
			for (int i = 0; i < loopCnt; i++) {
				temp = Ary[i];
				
				if (Ary[i] > Ary[i + 1]) {
					Ary[i] = Ary[i + 1];
					Ary[1 + i ] = temp; //25 34 48 12 
					
				}
			}
		}
	}

	public static void main(String[] args) {
		int[] intAry = { 34, 25, 48, 12 }; // 제일 마지막값이 최소값이라고 가정한다. [배열 숫자 오름차순으로 바꾸기]
		int[] intAry2 = { 22, 56, 99, 12 }; // 제일 마지막값이 최소값이라고 가정한다. [배열 숫자 오름차순으로 바꾸기]
		int[] intAry3 = { 22, 56, 99, 12 }; // 제일 마지막값이 최소값이라고 가정한다. [배열 숫자 오름차순으로 바꾸기]
		
		
		// 25, 34, 12, 48
		sorting(intAry);
		// 변경된 결과 출력.
		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry[i] + " ");
		}
		System.out.println();

		sorting(intAry2);
		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry2[i] + " ");
		}
		System.out.println();
		
		sorting(intAry3);
		for (int i = 0; i < intAry.length; i++) {
			System.out.println(intAry3[i] + " ");
		}
		System.out.println();
		System.out.println("\nend of prog");
	}
}
