package ch12;

public class Student {

	// 생성자 
	// 클래스에는 적어도 하나 이상의 생성자가 존재해야 한다. 
	
	// 기본 생성자 
	
	// 사용자 정의 생성자 
	
	String name; 
	int money; 
	
	// 기본 생성자 - 모양
	public Student(){
		
	}
	
	// 사용자 정의 생성자
	public Student(String n, int m) {
		name = n;
		money = m; 
	}
	// 학생이 버스를 탄다
	// 객체와 객체간 상호작용하게 설계할 것 ! 
	public void takeBus(Bus bus) {
		money-=1300;
		bus.take(1300);
	}
	// 학생이 지하철을 탄다
	public void takeSubway(Subway subway) {
		money-=1500;
		subway.take(1500);
	}
	
	public void takePlane(Plane plane) {
		money-=50000;
		plane.take(50000);
	}
	
	// 사용자 정의 생성자를 만들어주게 되면
	// 컴파일러는 기본 생성자는 만들어 주지 않음


	public void showInfo() {
		System.out.println("학생의 이름 : "+name);
		System.out.println("학생의 용돈 : "+money);
	}
}
