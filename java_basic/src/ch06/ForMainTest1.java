package ch06;

public class ForMainTest1 {

	public static void main(String[] args) {
		
//		for(초기화식; 조건식; 증감식) {
//			수행문(코드)
//		}
		
		int sum = 0;
		for(int i = 0;  i<10; i++) {
			
			sum = sum + i;
			System.out.println("i의 현재 값: "+i+"     sum 의 값: "+sum);
			
		}
	} // end of main
} // end of class
