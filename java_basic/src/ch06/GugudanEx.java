package ch06;

import java.util.Scanner;

public class GugudanEx {

	public static void main(String[] args) {
		// 2단 ~ 9단 까지 for문 사용해서 화면에 출력
//		for (int i=2;i<10;i++) {
//			System.out.println("=== 구구단 "+ i+" 단 ===");
//			for(int j=1;j<10;j++) {
//				System.out.println("        "+i +" X "+j+" = "+i*j);		
//			}
//		}
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("출력할 구구단 입력 : ");
		int i = s.nextInt();
		
		for (int j=1;j<10;j++) {
			System.out.println(i+" x "+j+" = "+ i*j);
		}
	}
}
