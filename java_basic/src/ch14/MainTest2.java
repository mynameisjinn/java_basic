package ch14;

public class MainTest2 {

	public static void main(String[] args) {
		
		Bank bank = new Bank();
//		bank.deposit(100_000);
//		System.out.println("bank  접근해서 현재 잔액 : " + bank.getBalance());
		
		bank.setBalance(0);
		bank.showInfo();
	}

}
