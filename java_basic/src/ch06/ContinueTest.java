package ch06;

import java.util.Scanner;

public class ContinueTest {

	public static void main(String[] args) {

		// 예약어 continue
		// 무시하고 진행하는 continue

		Scanner sc = new Scanner(System.in);
		// 콘솔창에서 정수값을 받는 명령어
		System.out.print(" MAX 값 입력 : ");
		final int MAX = sc.nextInt();
		System.out.print("배수값 입력 : ");
		final int MULTIPLE = sc.nextInt();

		int num;
		int count = 0;

		for (num = 1; num <= MAX; num++) {
			// 3의 배수이면 출력하지 않음
			if (num % MULTIPLE == 0) {
//				count = count +1; 
				count++;
				continue;
			}
//			System.out.println("출력값 : " + num);
		}
		System.out.println("1 에서 " + MAX + " 까지 " + MULTIPLE + " 의 배수의 갯수는 ?  " + count);

	} // end of main

} // end of class
