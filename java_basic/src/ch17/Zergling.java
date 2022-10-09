package ch17;

public class Zergling {
	private String name;
	private int power;
	private int hp;

	public Zergling(String name) {
		this.name = name;
		this.power = 5;
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
		if (this.hp <= 0) {
			System.out.println(this.name + "은 이미 사망하였습니다.");
		} else {
			this.hp -= power;
		}
	}
	// 저글링이 마린을 공격
	public void attackMarine(Marine marine) {
		System.out.println(this.name+" 이 "+marine.getName()+" 을 공격합니다. ");
		marine.beAttacked(this.power);
	}
	// 질럿이 저글링을 공격
	public void attackZergling(Zergling zergling) {
		System.out.println(this.name+" 이 "+zergling.getName()+" 을 공격합니다.");
        zergling.beAttacked(this.power);	
	}

	public String getName() {
		return name;
	}
	public int getPower() {
		return power;
	}
	public int getHp() {
		return hp;
	}
}
