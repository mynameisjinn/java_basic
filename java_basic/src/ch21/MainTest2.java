package ch21;

public class MainTest2 {

	public static void main(String[] args) {

		// 문제 1. 마린을 담을 배열 10 개 생성
		// 반복문 사용해서 초기화
		// 화면에 showInfo 호출
		
		Marine[] marines = new Marine[10];
		
		marines[0]= new Marine ("마린1");
		marines[1]= new Marine ("마린2");
		marines[2]= new Marine ("마린3");
		marines[3]= new Marine ("마린4");
		marines[4]= new Marine ("마린5");
		marines[5]= new Marine ("마린6");
		marines[6]= new Marine ("마린7");
		marines[7]= new Marine ("마린8");
		marines[8]= new Marine ("마린9");
		marines[9]= new Marine ("마린10");
		
		for (int i=0; i<marines.length; i++) {
			marines[i].showInfo();
		}
		
	
		
		// 문제2. 저글링
	
		
	}

}
