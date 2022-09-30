package ch06;

public class WhileMainTest2 {

	// 코드의 시작점 ( 메인 쓰래드 )
	public static void main(String[] args) {

		// while 문을 사용하여 1~10 까지 더한 결과 화면에 출력

		int i = 1;
		int sum = 0;

		while (i < 11) {
			sum = sum + i;
			if (i == 10) {
				System.out.println(sum);
			}
			i++;
		}
	} // end of main

} // end of class
