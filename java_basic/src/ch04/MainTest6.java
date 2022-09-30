package ch04;

public class MainTest6 {
	
	// 코드의 시작점
	public static void main(String[] args) {
		
		// 논리 연산자
		// && : 엠퍼센트 --> 논리 곱( and  연산자)
		// || : 버티컬바 --> 논리합(or 연산자)
		// 연산의 결과가 true, false
		
		// 논리곱 &&
		
		int num1 = 10;
		int num2 = 20;
		                                
		boolean flag1 = (num1 > 0) && (num2 > 0);   
		boolean flag2 = (num1>0)&&(num2<0);
		
		
		//  논리 합 ||
		
		boolean flag3 = (num1>0) || (num2<0);
		
		boolean flag4 = (num1<0) || (num2>0);
		
		// 문제 1_ 논리곱의 식을 만들어 결과를 화면에 출력
		int num3 = 7;
		int num4 = 3;
		
		boolean flag5 = (num3>4)&&(num4>=3);
		System.out.println(flag5);
		
		// 문제 2_ 논리합의 식을 만들어 결과를 화면에 출력
		boolean flag6 = (num3<=2)||(num4==3);
		System.out.println(flag6);
		
	} // end of main

} // end of class
