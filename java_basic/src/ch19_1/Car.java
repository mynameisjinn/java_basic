package ch19_1;

public class Car {
	
	String name;
	int price;
	
	// 포함 관계
	// Engine  은 Car 에 포함 되어 있다. 
	Engine engine; // 주소값 
	
	public Car(String name, int price, Engine engine){
		this.name = name;
		this.price = price;
//		this(name,price); // 생성자에서 다른 생성자를 호출 
		this.engine = engine;
	}
	
	public Car(String name, int price) {
		this.name = name;
		this.price = price;
		
		// Car 인스턴스화 할 때 , Engine 객체를 초기화
		this.engine = new Engine("GDI",500);
	}
	   
	public void showInfo() {
		System.out.println("Car name : "+name);
		System.out.println("Car price : "+price);
	}

}
