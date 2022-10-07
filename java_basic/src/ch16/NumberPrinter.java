package ch16;

public class NumberPrinter {
	// static  에 대해 알아보기 
	
	private int id; 
	private int waitNumber; 
	
	
//	private int waitNumber;
	
	public NumberPrinter(int id) {
		this.waitNumber = 1;
	}
	
	public void printWaitNumber() {
		System.out.println("대기 순번 : "+waitNumber);
		waitNumber ++;
	}
	
}
