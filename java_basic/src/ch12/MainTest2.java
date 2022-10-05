package ch12;

public class MainTest2 {
	// 메인함수 (코드의 시작점)
	public static void main(String[] args) {
		Student student = new Student("이순신",10_000);
		Student studentKim = new Student("김유신",50_000);
		Bus bus100 = new Bus(100,0,0);
		Bus bus200 = new Bus(200,0,0);
		Subway subway1 = new Subway(3,0,0);
		

		student.takeBus(bus100);
		student.showInfo();
		System.out.println("=========");
		student.takeBus(bus200);
		student.showInfo();
		System.out.println("=========");
		
		bus100.showInfo();
		System.out.println("=========");
		bus200.showInfo();
		
		System.out.println("=========");
		studentKim.takeSubway(subway1);
		studentKim.showInfo();
		System.out.println("=========");
		subway1.showInfo();
		
	} // end of main

} // end of class
