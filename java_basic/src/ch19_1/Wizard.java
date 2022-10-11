package ch19_1;

public class Wizard extends Hero {

	public Wizard(String name, int hp) {
		super(name, hp);
	}
	
	public void freezing() {
		System.out.println("마법사가 얼음공격을 합니다.");
	}
}
