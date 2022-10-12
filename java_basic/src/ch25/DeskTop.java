package ch25;

public class DeskTop extends Computer {

	@Override
	public void display() {
		// 일반 메서드로 재정의 되었다
		System.out.println("Desktop display");
	}

	@Override
	public void typing() {
		System.out.println("키보드로 타이핑한다.");
	}

	// 추상 메서드를 포함하는 클래스는 추상 클래스가 되어야 함 
	
	// 오류 해결 방법
	// 1. DeskTop 클래스를 추상 클래스로 만들어준다 
	// 2. 추상 메서드를 일반 메서드로 재정의 한다. -> 오버라이드 
}
