package ch05;

import java.util.Scanner;

public class MainTest2 {

	public static void main(String[] args) {
		// if - else if - else + 관계 연산자 + Scanner 
		// 논리 + 관계연산 
		
		System.out.println("성적 입력 : ");
		int number; // 변수 선언
		Scanner scanner; // (참조) 변수 선언 
		scanner = new Scanner(System.in); // 값을 초기화 (주소값을 넣음)
		int point = scanner.nextInt(); // 정수값을 받아줌 	
//		System.out.println("point : "+ point);
		
		// 문제) if 문 사용
		// 100~90 : A     90~80 : B      80~70 : C   (70 이면 C )
		// 60~0 : F         
		// 논리곱을 사용해서 식을 완성
		
		if((point>=0)&&(point<=100)){
			if((point<100)&&(point>=90)){
				System.out.println("A");
			}
			if((point<90)&&(point>=80)){
				System.out.println("B");
			}
			if((point<80)&&(point>=70)){
				System.out.println("C");
			}
			if((point<60)&&(point>=0)){
				System.out.println("F");
			}
		}
		
		
		
		
	} // end of main

} // end of class
