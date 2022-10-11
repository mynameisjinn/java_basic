package ch19;

public class Warrior extends Hero {

	public Warrior(String name, int hp) {
		super(name, hp);
	}
	
	public void comboAttack() {
		System.out.println(this.name + "의 공격");
	}

}
