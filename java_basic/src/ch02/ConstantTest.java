package ch02;

public class ConstantTest {

	// 코드의 시작점
	public static void main(String[] args) {

		// 예약어
		// 자바에서 개발자들이 미리 선점해둔 단어들
		
		// 상수 (constant)
		int age = 10;
		 age = 11;
		 
		 final int MONTH = 12;  //  상수
		 //  month = 10;
		 //  권장사항 : 상수에 이름을 사용할 때는 대문자로 사용(가독성을 높이기 위함) 
		 
		 System.out.println(MONTH);
	
		 final int MAX_NUM = 10;
		 final int MIN_NUM; 
		 MIN_NUM = 0;
//		 MIN_NUM = 1; 상수는 한번 값이 초기화 되면 그 이후에 변경 할 수 없음 
		 
		 System.out.println(MAX_NUM);
		 System.out.println(MIN_NUM);
		 
		 final int MY_COUNT = 100;
		 // 1. 위에서 상수는? MY_COUNT
		 // 2.  예약어는 ? final, int
		 // 3. 리터럴(literal)은? 100 
		 
	}

}
