package ch10;

public class Student {

	// 객체의 속성은 멤버 변수로, 
	// 객체의 기능은 메서드로 구현함 
	int studentID;
	String studentName;
	String address;
	
	// 학생의 기능을 설계 
	public  void study() {
		System.out.println(studentName +
				" 가 학생이 공부를 한다.");
	}
	
	public  void breakTime() {
		System.out.println(studentID +
				" 번 학생이 휴식을 한다.");
	}
	// 정리 ) 메서드란?
	// 객체의 기능을 구현하기 위해 클래스 내부에 구현되는 함수 
	
	// 문제 ) 멤버 변수를 활용하여 함수 만들기 
	// 1. 시험을 친다
	public  void test() {
		System.out.println(studentName +
				" 가 학생이 시험을 친다.");
	}
	// 2. 청소를 한다
	public  void clean() {
		System.out.println(studentName +
				" 가 학생이 청소를 한다.");
	}
}
