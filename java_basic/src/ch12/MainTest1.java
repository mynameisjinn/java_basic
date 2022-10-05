package ch12;

public class MainTest1 {

	public static void main(String[] args) {

		// 생성자 - 생성을 시키는 자 
		Bus bus100 = new Bus(1001,0,0);

//		bus100.busNumber = 1001;
//		bus100.personCount = 0;
//		bus100.money = 0;
		
//		bus100.showInfo();
//		
//		System.out.println("===================");
//		
//		Bus bus200 = new Bus(200,10,1000);
//		bus200.showInfo();
//		
//		System.out.println("===================");
//		
//		// 사용자 정의 생성자를 만들게 되면 강제셩이 부과딤
//		Student student = new Student("홍길동",100);
//		student.showInfo();
		
		Subway subway1 = new Subway();
		subway1.showInfo();
		System.out.println("==================");
		Subway subway2 = new Subway(2,100,1000);
		subway2.showInfo();
		
	}

}
