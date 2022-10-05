package ch12;

public class MainTest3 {

	public static void main(String[] args) {
		// 학생 객체를 2개 이상 생성
		// 버스 객체를 2개 이상 생성
		// 지하철 객체를 1개 이상 생성

		// 메서드를 호출 시켜서 동작 시켜보기

		Student student1 = new Student("Kim", 5000);
		Student student2 = new Student("Lee", 80_000);

		Bus bus80 = new Bus(80, 0, 0);
		Bus bus52 = new Bus(52, 0, 0);

		Subway subway1 = new Subway(1,0,0);
		
		student1.takeBus(bus80);
		student1.showInfo();
		System.out.println(" ");
		bus80.showInfo();
		System.out.println(" ");
		
		student2.takeSubway(subway1);
		student2.showInfo();
		System.out.println(" ");
		subway1.showInfo();
		
		
		// 비행기라는 클래스 설계 
		// 학생이 비행기를 타다 메서드 만들어서 동작 시켜보기 
		
		Plane plane1 = new Plane("대한항공",0,0);
		
		student2.takePlane(plane1); 
		System.out.println(" ");
		student2.showInfo();
		System.out.println(" ");
		plane1.showInfo();
		
	}

}
