package ch18;

class Cal {

	public int sum(int n1, int n2) {
		return n1 + n2;
	}

	// 자바 개발자들이 메서드 오버로딩 기술을 만들어 줬음
//	public int sumThree(int n1, int n2, int n3) {
//		return n1+n2+n3; 
//	}
	// 메서드 오버로딩
	public int sum(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}

	public int sum(double n1, double n2) {
		return (int) (n1 + n2);
	}

	public int multiply(int n1, int n2) {
		return n1 * n2;
	}
}

class Cal2 extends Cal {
	public int minus(int n1, int n2) {
		return n1 - n2;
	}
	// 오버라이드란?
	// 상속관계에 있을 때 부모 메서드를 재정의할 수 있는 것.

	// 메서드 오버로딩 != 메서드 오버라이드

	@Override // 어노테이션 - 주석 + 힌트(컴파일러)
	public int multiply(int n1, int n2) {
		if (n1 == 0 || n2 == 0) {
			System.out.println("0을 입력하지 마세요");
			return 0;
		} else {
//			return n1*n2;
			
			// super - 부모 클래스를 가리키는 키워드 
			return super.multiply(n1, n2);
		}
	}

}

public class MainTest2 {

	public static void main(String[] args) {

//		Cal2 cal2 = new Cal2();
//		System.out.println(cal2.sum(5, 3));
//		System.out.println(cal2.multiply(5, 3));
//		System.out.println(cal2.minus(5, 3));
//
//		System.out.println(cal2.multiply(0, 3));

		System.out.println(true);
		System.out.println(10);
		System.out.println(0.5);
		System.out.println('A');
		System.out.println("반가워");

		// 결론
		// 메서드 오버로딩이란? System.out.println() 이다
		// 메서드의 매개변수 갯수, 데이터 타입을 다르게 선언하여 같은 이름으로
		// 사용할수 있게하는 기법이다.

	}

}
