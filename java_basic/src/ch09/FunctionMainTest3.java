package ch09;

import java.util.Random;

public class FunctionMainTest3 {

	public static void main(String[] args) {
		
		for(int i =0; i<6; i++) {
			System.out.print(randomNumber() + "\t" );	// \t : tab 
		}

	} // end of main

	public static int randomNumber() {

		// 난수 발생 클래스(java)
		Random random = new Random();
		// random.nextInt() : 랜덤으로 정수값 하나 반환(0~ 약21억)
		int lottoNumber = random.nextInt(45) + 1; 
		// 1~45 까지 숫자 중 하나 반환 
		
		return lottoNumber;
	}
} // end of class
