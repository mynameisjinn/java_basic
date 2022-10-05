package ch12;

public class Plane {
	
	String name;
	int personCount; 
	int money;
	
	public Plane(String n, int p, int m) {
		name=n;
		personCount=p;
		money = m;
	}
	public void take(int pay) {
		money += pay;
		personCount ++;
	}
	public void showInfo() {
		System.out.println("항공사 : "+ name);
		System.out.println("현재 승객수 : "+ personCount);
		System.out.println("현재 수익금 : " +money);
	}

}
