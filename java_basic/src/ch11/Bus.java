package ch11;

public class Bus {
	// 버스의 속성을 정의하고 기능 설계 
	
    	int passengerNo;
	    String busStation; 
		String busCharge;
		int busNumber;
		
		public static void pNo(String No) {
			System.out.println("탑승한 손님 번호 : "+No);
		}
		public static void bStation(String Station){
			System.out.println( Station +" 역 입니다.");
	}
		public static void bCharge(String charge) {
			if (charge == "어린이") {
				System.out.println("500");
			}else {
				System.out.println("1000");
			}
		}
}
