package ch23;

public class MainTest2 {

	public static void main(String[] args) {

		Banana[] bananas = new Banana[10];
		Peach[] peaches = new Peach[10];

		for (int i = 0; i < peaches.length; i++) {
			bananas[i] = new Banana();
			peaches[i] = new Peach();
		}
		// 자바에서 다형성이란?
		// 부모 타입 변수에서 자식 객체를 생성할 수 있음
		// 단, 부모 자식 관계에서 사용가능

		Fruit fruit1 = new Banana();
		Fruit fruit2 = new Peach();

		// 다형성 - 통으로 관리할 수 있음
		// 단, 연관된 데이터 타입 사이에서! 
		Fruit[] fruits = new Fruit[20];

		for (int i = 0; i < 10; i++) {
			fruits[i] = new Banana();
		}
		for (int i = 10; i < 20; i++) {
			fruits[i] = new Peach();
		}
		for (int i = 0; i < fruits.length; i++) {
			fruits[i].showInfo();
			System.out.println();
		}
	}
}
