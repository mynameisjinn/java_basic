package ch08;

// 다른 사용자가 내가 만든 클래스를 사용하는 쪽의 코딩 
public class MainTest1 {

	public static void main(String[] args) {
		
		Warrior warrior1;    // 변수의 선언 , 데이터 타입 Warrior
		warrior1 = new Warrior();
		warrior1.height = 200;
		warrior1.power = 100;
		warrior1.color = "초록색";
		warrior1.name = "흑우전사";
		
		System.out.println(warrior1.height);
		System.out.println(warrior1.power);
		System.out.println(warrior1.color);
		System.out.println(warrior1.name);
		
		Warrior warrior2 = new Warrior(); // 변수의 선언과 동시에 초기화
		warrior2 = new Warrior();
		warrior2.height = 100;
		warrior2.power = 50;
		warrior2.color = "빨간색";
		warrior2.name = "오크";
		
		System.out.println(warrior2.height);
		System.out.println(warrior2.power);
		System.out.println(warrior2.color);
		System.out.println(warrior2.name);
		
		
	}

}
