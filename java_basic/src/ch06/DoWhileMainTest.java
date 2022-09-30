package ch06;

import java.util.Scanner;

public class DoWhileMainTest {

	// 코드의 시작점
	public static void main(String[] args) {
//		int num = 0;
//		do {
//			System.out.println("여기는 무조건 한번은 실행됨 "+num);
//			num++;
//		} while (num < 10);
		
//		Scanner sc = new Scanner(System.in);
//		String menu;
		
//		do { 
//			System.out.println(" 메뉴 선택 ");
//			System.out.println("커피 , 빵, 치즈, 종료");
//			menu = sc.nextLine();     // 문자열을 받겠다. 
//			System.out.println(" 당신이 선택한 메뉴는 : " + menu);
//		}while(! menu.equals( "종료"));
		
		Scanner sc = new Scanner(System.in);
		int n;
		
		do { 
			System.out.println(" 메뉴 선택 ");
			System.out.println("1.커피  2.빵 3.치즈 0.종료");
			n = sc.nextInt();  
			
			// 0 번을 누르면 종료시키는 코드 완성 
			
		}while(n!=0);
			System.out.println("종료합니다.");


		
	} // end of main

} // end of class
