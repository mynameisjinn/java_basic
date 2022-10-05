package ch12;

public class Subway {

	int lineNumber;
	int personCount; 
	int money;
	
	// 멤버 변수를 제외하고 제일 먼저 실행 되는 코드 
	// 생성자 오버로딩 
	// 생성자를 여러개 만드는 기법

	public Subway() {
		 lineNumber=1;
		 personCount=10; 
		 money=1000;
//		System.out.println("여기 코드가 자동으로 나오나요");
	}
	
	public Subway(int i, int p, int m) {
		lineNumber = i;
		personCount=p;
		money = m;
	}
	
	public void take(int pay) {
		money += pay;
		personCount ++;
		
	}
	
	public void showInfo() {
		System.out.println("지하철 호선 번호 : "+ lineNumber);
		System.out.println("현재 승객수 : "+ personCount);
		System.out.println("현재 수익금 : " +money);
	}
}
