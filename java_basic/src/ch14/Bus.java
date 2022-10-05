package ch14;

public class Bus {

	private int busNumber;
	private int personCount;
	private int money;

	// this 키워드

	public Bus(int busNumber, int personCount, int money) {
		this.busNumber = busNumber;
		this.personCount = personCount;
		this.money = money;
	}

	// getter
	public int getBusNumber() {
		return this.busNumber;
	}

	public int getPersonCount() {
		return this.personCount;
	}

	public int getMoney() {
		return this.money;
	}

	// setter
	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}

	public void setPersonCount(int personCount) {
		this.personCount = personCount;
	}

	public void setMoney(int money) {
		this.money = money;
	}
}
