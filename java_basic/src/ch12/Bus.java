package ch12;

public class Bus {

	int busNumber;
	int personCount;
	int money;
	
	//  생성자 - 리턴타입이 없다. 클래스 이름과 같다(대문자)
	public Bus(int b, int p, int m) {
		busNumber = b;
		personCount = p;
		money = m;
		
	}
	
	public void take(int pay) {
		money += pay;
		personCount ++;
		
	}
	
	
	public void showInfo() {
		System.out.println("버스 번호 : " + busNumber);
		System.out.println("현재 승객수 : " + personCount);
		System.out.println("현재 수익금 : " + money);
	}
}
