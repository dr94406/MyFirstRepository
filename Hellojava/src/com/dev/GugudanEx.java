package com.dev;

public class GugudanEx {

	public static void main(String[] args) {
		int result = sum(sum(10, 20), sum(5, 7));
		int[] newAry = {10,20,30};
		result = sum(newAry);
		System.out.println("결과는 " + result);
//		System.out.println("결과는 " + divide(10, 4));
	}

	public static int sum(int[] ary) {
		// 배열매개변수의 각 요소의 합을 구하는 메소드.
		int sum =0;
		for(int i=0;i<ary.length;i++) {
			sum += ary[i];
		}
		return sum;
	}

	// 나누기 메소드( int , int )
	public static double divide(int n1, int n2) {
		if (n2 == 0) {
			return 0;
		}
		return n1 / (double) n2;

	}

	public static int sum(int n1, int n2) {
		return n1 + n2;
	}

	public static void gugudan(int dan) {
		System.out.println("     [" + dan + "단] ");
		for (int i = 1; i <= 9; i++) {
			System.out.printf("%2d * %2d = %2d\n", dan, i, (i * dan));
		}
		System.out.println();
	}

	public static void printStar(int runCnt, String shape) {
		for (int i = 0; i < runCnt; i++) {
			System.out.print(shape);
		}

	}

	public static void printGugudan() {

		// 메소드 실행하려면 new 클래스이름(); ex) Student s1 = new Student();
//		Student.callStatic();
		for (int j = 1; j <= 9; j++) { // 중첩for문
			int cnt = j;
//			System.out.println("[" + cnt + "단] ");
			for (int i = 2; i <= 9; i++) {
				System.out.printf("%2d * %2d = %2d ", i, cnt, (i * cnt));
			}
			System.out.println();
		}
	} // end of printGugudan();

//	public static void main(String[] args) {
//
//		printStar();
//	}

} // end of GugudanEx.
