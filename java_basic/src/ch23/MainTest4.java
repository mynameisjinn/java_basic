package ch23;

public class MainTest4 {

	public static void main(String[] args) {

		// 다형성을 이용한 배열 선언 
		Fruit[] fruits = new Fruit[4];
		
		fruits[0] = new Banana();
		fruits[1] = new Peach();
		fruits[2] = new Banana();
		fruits[3] = new Peach();
		
//		for (int i = 0; i < fruits.length; i++) {
//			fruits[i].showInfo();
//			System.out.println();
//		}
//		
//		// 꼭 기억 - " instanceof "
//		// 데이터 타입확인
//		if (fruits[0] instanceof Banana) {
//			System.out.println("바나나 데이터 타입입니다.");
//		} else {
//			System.out.println("바나나 데이터 타입이 아닙니다.");
//		}
		
		System.out.println("==================");
		// 문제. 데이터 타입이 바나나 이면 화면에 origin  값을 출력 
		for (int i = 0; i < fruits.length; i++) {
			fruits[i].showInfo();
			System.out.println();
		}
		
		
	}

}
