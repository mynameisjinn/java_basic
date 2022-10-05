package ch14;

// 통장 계좌
public class Bank {

	// 정보 은닉
	private int balance;

	// getter 메서드
	public int getBalance() {
		return this.balance;
	}

	// setter 메서드
	public void setBalance(int balance) {
		// 방어적 코드
		if (balance <= 0) {
			System.out.println("잘못된 입력값 입니다.");
		} else {
			this.balance = balance;
		}
	}

	// 입금
	public void deposit(int money) {
		this.balance += money;
		System.out.println("입금 : " + money);
	}

	// 출금
	public void withdraw(int money) {
		this.balance -= money;
		System.out.println("출금 : " + money);
	}

	// 잔액 확인
	public void showInfo() {
		System.out.println(" 현재 잔액은 " + this.balance + " 입니다.");
	}
}
