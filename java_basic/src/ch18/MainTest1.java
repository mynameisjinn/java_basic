package ch18;

//자바 문법 -  MainTest1.java
//하나의 자바 파일안에 여러개의 클래스를 작성 할 수 있음
//단,  public 접근 제어지시자를 가진 클래스는 단 하나만 사용 가능 ! 

class A {
	// protected-자식 객체에서 접근가능
	protected int num1;
	protected int num2;
	protected int num3;
	
}

class B {
	int num1;
	int num2;
	int num3;
	int num4;
	int num5;
}

class C extends A{
	// num1,2,3 은 물려 받은 상태 (extends A)
	int num4; 
	int num5;
}


public class MainTest1 {
	
	// 코드의 시작점(메인 함수)
	public static void main(String[] args) {
		
		C c1 = new C();
		c1.num1 = 1;
		c1.num2 = 2;
		c1.num5 = 5;
		
		System.out.println(c1.num1);
		System.out.println(c1.num2);
		
	}// end of main
	
}// end of class 
