package ch23;

public class MainTest5 {

	public static void main(String[] args) {
		
		// 다형성을 이용한 배열 선언 
				Fruit[] fruits = new Fruit[4];
				
				// 부모 데이터 타입에 자식 객체 -> 업캐스팅 
				fruits[0] = new Banana();
				fruits[1] = new Peach();
				fruits[2] = new Banana();
				fruits[3] = new Peach();
				
				
				// 문제 ) 바나나 타입이면 화면에 origin 변수출력
				for (int i = 0; i < fruits.length; i++) {
					if(fruits[i] instanceof Banana) {
						// 바나나 타입 보장 
//						((Banana)fruits[i]).origin;
						System.out.print(fruits[i].name+"의 원산지는");
						System.out.println(((Banana)fruits[i]).origin);
						System.out.println();
					}
					fruits[i].showInfo();
					System.out.println();
				}
	}

}
