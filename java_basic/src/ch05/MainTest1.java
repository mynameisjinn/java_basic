package ch05;

public class MainTest1 {

	public static void main(String[] args) {

		// 제어문  if (만약 ~ 이라면)
		// 주어진 조건에 따라서 실행이 이루어 지도록 구현

		boolean flag1 = false;
		
		// if 문 단독
		if(flag1) {
			System.out.println("조건식이 true 이면 여기가 실행됩니다.");
		} // end of if 문
									// 단독 if 문은 실행이 될 수도 있고 안될 수도 있음! 
	
		// if-else 문
//	 if(true) {
//		 System.out.println("true이면 여기 실행");
//		 System.out.println("block 의 유효 범위는 여기까지~! ");
//	 }else {
//		 System.out.println("false 이면 여기 실행");
//	  }
	 
		// if else if else 문
		int point = 70;
		
		if (point >= 90) {
			System.out.println("A");
		}else if(point >= 80) {
			System.out.println("B");
		}else if(point >= 70) {
			System.out.println("C");
		}else if(point >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}

}
