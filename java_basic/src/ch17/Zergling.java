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
			this.hp -= power;
		}


}
