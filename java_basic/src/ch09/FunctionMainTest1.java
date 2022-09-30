package ch09;

public class FunctionMainTest1 {

	public static void main(String[] args) {

	// 함수 사용하기 ( 모양 맞추기 )
		int myResult = add(10,20);
		System.out.println(myResult);
	
	} // end of main

	// 함수 만들어 보기
	public static int add(int num1, int num2) {
		
		int result = num1 + num2;
		return result;  //  리턴 키워드를 만났을 때, 
		                            //  실행에 제어가 반납됨. 
	}
	
} // end of class
