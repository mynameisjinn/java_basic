package ch19;

public class MainTest1 {

	public static void main(String[] args) {

		Hero hero1 = new Hero("A",100);
		Hero hero2 = new Hero("B",150);
		Hero hero3 = new Hero("C",130);
		
		hero1.attack();
		
		Warrior warrior1 = new Warrior("D",120);
		warrior1.attack();
		
	}

}
