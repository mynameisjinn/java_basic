package ch06;

public class ForMainTest2 {

	public static void main(String[] args) {

		// 문제 ) 화면에 구구단 3단 출력
		int i = 3;
		for (int j = 1; j < 10; j++) {
			System.out.println(i + " x " + j + " = " + i * j);
		}
		System.out.println("====================");
		// 5단, 6단 출력

		for (i = 5; i < 7; i++) {
			System.out.println(i + " x  1 = " + (i * 1));
			System.out.println(i + " x  2 = " + (i * 2));
			System.out.println(i + " x  3 = " + (i * 3));
			System.out.println(i + " x  4 = " + (i * 4));
			System.out.println(i + " x  5 = " + (i * 5));
			System.out.println(i + " x  6 = " + (i * 6));
			System.out.println(i + " x  7 = " + (i * 7));
			System.out.println(i + " x  8 = " + (i * 8));
			System.out.println(i + " x  9 = " + (i * 9));
			System.out.println("====================");
		}

	} // end of main
} // end of class
