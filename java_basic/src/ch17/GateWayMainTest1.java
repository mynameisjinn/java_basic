package ch17;

public class GateWayMainTest1 {

	public static void main(String[] args) {

		GateWay gateWay1 = new GateWay(1);
		GateWay gateWay2 = new GateWay(2);
//		gateWay.createZealot();
		Zealot zealot1 = gateWay1.createZealot();
		Zealot zealot2 = gateWay1.createZealot();
		Zealot zealot3 = gateWay1.createZealot();
		
		Zealot zealot4 = gateWay2.createZealot();
		
		
		zealot1.showInfo();
		gateWay1.showInfo();
		System.out.println("질럿 총 생산량 : "+GateWay.zealotCount);
	}

}
