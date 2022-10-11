package ch19_1;

public class CarMainTest {

	public static void main(String[] args) {

//		Engine engine = new Engine("GDI2.5",800);
		
		Car car1 = new Car("BMW",5700);
		car1.showInfo();
//		car1.engine
		System.out.println(car1.engine.name);
//		 java.lang.NullPointerException
		// 가리키는 객체주소가 없다.
		// 1. 객체를 생성했나?
		// 2. 참조변수에 주소값을 잘 담았는가?
	}

}
