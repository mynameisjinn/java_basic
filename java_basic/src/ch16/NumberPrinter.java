package ch16;

public class NumberPrinter {
	// static  에 대해 알아보기 
	
	private String name; 
	private static int waitNumber; 
		
	public NumberPrinter(String name) {
		this.name = name;
		this.waitNumber = 1;
		// 원래 0 인데 생성자가 호출되는 순간 1이 됨.
	}
	
	// 번호표 출력 
	public void printWaitNumber() {
		System.out.println(name+" 기기의 대기 순번 : "+waitNumber);
		waitNumber ++;
	}
	
}
