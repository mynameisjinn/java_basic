package ch09;

public class FunctionMainTest2 {
	
	// 메인 함수 
	public static void main(String[] args) {
		int num1=100; // 지역변수
		int num2=200;
		int num3=300;
		
		// 함수의 호출은 모양 맞추기이다. 
		int total = addNumber(num1,num2, num3);
//		System.out.println("total : " + total);
		
//		sayHello("Hi");
		
//		int myResult2 = calSum();
//		System.out.println(calSum());
		int q1 = intAdd(10,20);
		System.out.println("intAdd 함수 실행 결과 : "+q1);
		
		double q2 = doubleAdd(4.5,5.5);
		System.out.println("doubleAdd 함수 실행 결과 : "+q2);
		
		printArticle("Article");

	} // end of main

	// 1. 리턴값이 있는 함수

	public static int addNumber(int n1, int n2, int n3) {
		// 함수 안에도 변수를 선언할 수 있다.
		// 함수 안에 선언 되는 변수 -> 지역 변수
		int result;
		result = n1 + n2 + n3;
		return result;
	}

	// 2. 리턴값이 없는 함수 -> void ( 텅 빈)
	// ( 괄호 안에 ) ---> 메개변수
	public static void sayHello(String greeting) {
		System.out.println("매개변수로 넘겨 받은 값 : " + greeting);
	}

	// 3. 리턴 값이 있지만 매개변수가 없는 함수
	public static int calSum() {
		int sum = 0; // 지역변수 선언과 동시에 초기화
		int i;
		
		for(i=1;i<=100;i++) {
			sum += i ; 			
		}
		return sum;
	}
	
	// 문제 1)
	// 1. 리턴값 int , 매개변수 n1,n2 이름은 intAdd 함수 만들기
	public static int intAdd(int n1, int n2) {
		// 괄호안의 매개변수 범위는 함수 몸체까지 이다. 
//		int i_sum = n1 + n2;
		return n1+n2;
	}
	// 2. 리턴값 double 매개변수  d1,d2 이름은  doubleAdd  함수 만들기
	public static double doubleAdd(double d1, double d2) {
		double d_sum = d1 + d2;
		return d_sum;
	}
	// 3. 리턴값 void 매개변수 String article 이름은 printArticle 함수 만들기
	public static void printArticle(String article) {
		System.out.println(article);
//		return; 
	}

} // end of class
