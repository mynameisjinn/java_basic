package ch19_1;

public class CarMainTest2 {

	public static void main(String[] args) {

		Engine engine = new Engine(" V6",900);
		// 외부에서 주입 
		Car m3 = new Car("M3",15000, engine);
		
		System.out.println(m3.engine.name);
	}

}
