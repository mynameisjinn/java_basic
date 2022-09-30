package ch06;

public class BreakMainTest {

	public static void main(String[] args) {

		// break --> ( 예약어 ) 중간에 멈추는 break

//		for (int i = 1; i < 11; i++) {
//			System.out.println(" i : " + i);
//
//			if (i % 7 == 0) {
//				break;  // 자신의 가장 가까운 반복문을 하나 멈춘다. 
//			} // end of if
//			
//		} // end of for

		// 1 ~ 10 까지 반복할 때 3의 배수만 화면에 출력
//		for (int i = 1; i < 11; i++) {
//			if (i % 3 == 0) {
//				System.out.println(i);
//			}
//		}
		
		// i 값이 8 이면 반복문 멈추기
		for (int i = 1; i < 11; i++) {
			System.out.println(i);
			if (i == 8) {
				break;
			}
		}

	} // end of main

} // end of class
