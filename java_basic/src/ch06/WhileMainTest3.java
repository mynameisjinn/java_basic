package ch06;

import java.util.Scanner;

public class WhileMainTest3 {

	// 코드의 시작점
	public static void main(String[] args) {

//		int userInput = 1;
//		System.out.println((userInput != 0));

		Scanner sc = new Scanner(System.in);

		int input = 1;
		while (input != 0) {
			System.out.println("0. 종료  1.진행 ");
			input = sc.nextInt();
			if (input == 1) {
				System.out.println(" 게임을 진행하셨네요! ");
			} 
			if (input == 0) {
				System.out.println(" 게임을 종료합니다! ");
				break;
			} else {
				System.out.println("잘못입력하셨습니다. 다시 입력해주세요");
			}
		}

	} // end of main

} // end of class
