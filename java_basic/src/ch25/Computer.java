package ch25;

// 추상클래스란? 추상메서드를 포함하는 클래스
// 단, 필수조건은 아님
// 기본적으로 new 할 수 없게 만듦

public abstract class Computer {

	// 메서드의 선언부만 존재
	// 추상 메서드를 포함하는 클래스는 추상클래스가 되어야 함 
	public abstract void display();
	
	public abstract void typing();
	
	public void turnOff() {
		System.out.println("전원을 끕니다.");
	}
	public void turnOn() {
		System.out.println("전원을 켭니다."); 
		// {  메서드의 바디 } - 구현부 
	}
}
