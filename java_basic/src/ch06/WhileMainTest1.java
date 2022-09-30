package ch06;

public class WhileMainTest1 {

	// 코드의 시작점 ( 메인함수 )
	public static void main(String[] args) throws InterruptedException {

		// 반복문 while
		// while ( 조건식) { 수행 코드 }

		// for 문 - while 문 차이점
		// for : 반복의 횟수가 정해진 코드일 경우
		// while : 반복의 횟수가 정해지지 않은 경우

//		int num = 1;
//		while (num < 10) {
//			System.out.println("num : " +num);
//			num++;
//		}
		
		boolean flag = true;
		int count = 0;
		while(flag) {
			System.out.print("-");
			count++;
			if(count==100) {
				System.out.println(" count 가 100 입니다.");
				flag = false;
			}
			Thread.sleep(10 ); //0.01 초에 한번씩 실행 
		}

	} // end of main

} // end of class
