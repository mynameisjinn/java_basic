package ch05;

import java.util.Scanner;

public class MainTest3 {

	public static void main(String[] args) {
		// 변수의 종류는 크게 2가지
		// 1. 기본 데이터 타입
		// 2. 참조 타입 : 주소값
		
		int number;
		// 입출력 IO
		Scanner sc = new Scanner(System.in);
		

//		int point = 30;
		System.out.println("정수값 입력");
		int point = sc.nextInt();  

		if (point >= 90) {
			System.out.println("A");
		} else if (point >= 80) {
			System.out.println("B");
		} else if (point >= 70) {
			System.out.println("C");
		} else if (point >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		} // end of if-if else 문
		
	} // end of main

} // end of class
