package ch16;

public class MainTest1 {

	public static void main(String[] args) {

		NumberPrinter numberPrinter1 = new NumberPrinter("보험");
		NumberPrinter numberPrinter2 = new NumberPrinter("예금");
		
		numberPrinter1.printWaitNumber();
		numberPrinter1.printWaitNumber();
		System.out.println("====================");
		numberPrinter2.printWaitNumber();
		numberPrinter2.printWaitNumber();
	}

}
