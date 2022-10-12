package ch23;

public class MainTest3 {
	public static void main(String[] args) {
	
		// 업캐스팅
		// 컴파일 시점 - 문법을 작성하고 실행시키기 전까지 (사람 -> 기계어)
		Fruit fruit1 = new Banana();
		Banana banana1 = new Banana();
		
		((Banana)(fruit1)).origin ="태국"; // 다운 캐스팅 
		
		int num = (int)10.0;
	}
}
