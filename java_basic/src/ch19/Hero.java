package ch19;

public class Hero {

	String name;
	int hp;

	public Hero(String name, int hp) {
		this.name = name;
		this.hp = hp;
	}

	public void attack() {
		System.out.println(this.name+" 의 공격");
	}
}
