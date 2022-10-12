package ch25;

public class MainTest2 {

	// 코드의 시작점
	public static void main(String[] args) {

		// 추상 클래스는 기본적으로 new 할 수 없다!
		Computer computer1 = new MyNoteBook();
		Computer computer2 = new DeskTop();
		
		computer1.display();
		computer1.typing();
		System.out.println();
		computer2.display();
		computer2.typing();
	} // end of main

} // end of class 
