package ch19;

public class Archer extends Hero{

	public Archer(String name, int hp) {
		super(name, hp);
	}
	
	public void fireArrow() {
		System.out.println(this.name + "의 공격");
	}

}
