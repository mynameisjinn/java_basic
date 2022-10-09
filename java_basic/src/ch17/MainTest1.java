package ch17;

public class MainTest1 {

	public static void main(String[] args) {

		Zealot zealot1 = new Zealot("질럿1");
		Marine marine1 = new Marine("마린1");
		Marine marine2 = new Marine("마린2");
		Zergling zergling1 = new Zergling("저글링1");
		
		marine1.showInfo();
		zealot1.attackMarine(marine1);
		zealot1.attackMarine(marine1);
		zealot1.attackMarine(marine1);
		marine1.showInfo();
		
		// 공격 hp 가 0 이하일 때 공격기능 없애기 
		marine2.attackZealot(zealot1);
		zealot1.showInfo();
		
		//여기서 질럿의 hp 만 확인하고 싶다면? 
		
		
	}

}
