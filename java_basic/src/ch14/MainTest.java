package ch14;

public class MainTest {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
		// 멤버 변수는 초기값을 넣지않으면 기본값으로 지정됨.(컴파일러의 역할)
		// int -> 0;  / double -> 0.0; / boolean -> false; / String -> null; 
//		System.out.println(bank.balance);
		
		bank.deposit(10_000);
		bank.showInfo();
		
		// 출금하기 
		bank.withdraw(5_000);
		bank.showInfo();
		
		// 실수로 멤버 변수에 접근해서 잔액을 수정한 경우
//		bank.balance = 100_000; 
//		bank.showInfo();
		
		// 접근 제어 지시자 
		
	}

}
