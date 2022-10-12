package ch22;

public class MainTest2 {

	public static void main(String[] args) {

		// 배열의 사용방법
		int[] numbers = new int[3];

		numbers[0] = 100;
		numbers[1] = 200;
		numbers[2] = 300;

		System.out.println(numbers[0]);
		System.out.println(numbers[1]);
		System.out.println(numbers[2]);

		// 1. 배열 선언과 동시에 초기화 하는 방법
		// 배열은 반드시 크기 정해져야한다.
		int[] numbers2 = new int[] { 10, 20, 30 };
		int[] numbers3 = { 20, 30, 40 }; // 코드의 간소화

		// 배열은 보통 반복문과 함께 많이 사용
	}

}
