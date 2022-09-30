package ch02;

public class TypeConversion2 {

	// 코드의 시작점
	public static void main(String[] args) {

		// 형 변환 : 데이터 타입 변경
		// int  자료형을  double  로 변경하거나 반대의 경우를 말함
		// 형 변환에는 자동형변환과 강제형변환 두가지가 있음
		
		int iName = 100;
		System.out.println(iName);
		
		// 자동형변환 
		double dNum1 = iName; // double : 8 byte -> int : 4 byte =>  메모리가 작은 값으로 변경(자동형변환)
		System.out.println(dNum1);
		
		// 강제형변환
		double dNum2 = 1.123456;
		
		// 컴파일러가 작은 상자에 큰 상자를 넣으려면 오류를 일으킴
		// int iNum2 = dNume2;       -> iNum2 는 int(4 byte) 인데 double(8 byte)을 넣으려는 상황
		
		// 개발자가 컴파일러에게 강제로 넣게함 
		int iNum2 = (int)dNum2;
		System.out.println(iNum2);
		
		// 소수점을 그냥 버리고 값을 저장
		System.out.println("===================================");
		
		double dValue;
		int iValue;
		
		dValue = 0.5;
		iValue = (int)dValue;
		
		int iValue2 = (int)10.1; 
		System.out.println(iValue2);  // 소수점 버리고 값을 저장하고 출력함 
		
	} // end of main

} // end of class 
