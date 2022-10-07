package ch15;

public class MainTest1 {

	public static void main(String[] args) {

		Person person1 = new Person();
		Person person2 = new Person();
		
		System.out.println(person1.age);
		System.out.println(person1.name);
		System.out.println(person1);
		
		Person copyPerson = person1;
		System.out.println(copyPerson);
		System.out.println(person2);
	}

}
