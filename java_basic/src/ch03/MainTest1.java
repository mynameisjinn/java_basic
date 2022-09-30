package ch03;

public class MainTest1 {

	// 코드의 시작점
	public static void main(String[] args) {

		// 대입 연산자 ( = )
		// 연산의 방향은 오른쪽 -> 왼쪽 으로 연산
		
		int number = 10;  // " 10 이라는 값을 number 라는 변수에 대입하겠다." 
		
		int number2 = number;
		System.out.println(number2);
		System.out.println("=======================");
		
		// 부호 연산자 ( +, - ) 
		System.out.println(-number);
		System.out.println("=======================");
		System.out.println(number);
		
		// 부호를 변경하는 연산자 
		// 단, 변수에 들어 있는 실제 값을 변경하는 연산자는 아님
		// 실제 값을 변경하려는 경우? -> 대입 연산자 사용 ! 
		
		number = - number; 
		System.out.println(number);
		
		System.out.println("=======================");
		int number3 = - 100;
		
		// number3 이라는 변수의 값을 양수로 변경하기
		
		number3 = -number;
		System.out.println(number3);
		
	} // end of main

} // end of class 
