package ch17;

public class Zealot {

	private String name;
	private int power;
	private int hp;

	public Zealot(String name) {
		this.name = name;
		this.power = 10;
		this.hp = 100;
	}

	// 상태창 보기
	public void showInfo() {
		System.out.println("----- 정보창 -----");
		System.out.println(" 유닛 이름 : " + name);
		System.out.println(" 공격력 : " + power);
		System.out.println(" 체력  : " + hp);
		System.out.println(" =============== ");
	}

	// 공격을 받습니다
	public void beAttacked(int power) {
		this.hp -= power;
	}

	// 질럿이 마린을 공격
	public void attackMarine(Marine marine) {
		System.out.println(this.name+" 이 마린을 공격합니다. ");
		marine.beAttacked(this.power);
	}
	// 질럿이 저글링을 공격
	public void attackZergling(Zergling zergling) {
		System.out.println(this.name+" 이 저글링을 공격합니다.");
        zergling.beAttacked(this.power);	
	}
}
