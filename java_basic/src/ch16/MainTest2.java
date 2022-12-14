package ch16;

public class MainTest2 {

	public static void main(String[] args) {

		// static 변수는 클래스 이름에 접근할 수 있다. 
		int result = Employee.serialNumber;
		// static 함수는 클래스 이름으로 접근가능하다 
		int result2 = Employee.getSerialNumber();
		
		System.out.println(result);
		System.out.println(result2);
		
		Employee employeeKim = new Employee("김길동","영업팀");
		Employee employeeLee = new Employee("이순신","무역팀");
		Employee employeeHong = new Employee("홍길동","개발팀");
	
		int num1 = employeeKim.getEmployeeId();
		int num2 = employeeLee.getEmployeeId();
		int num3 = employeeHong.getEmployeeId();
		
//		System.out.println("num1->"+num1);
//		System.out.println("num2->"+num2);
//		System.out.println("num3->"+num3);
	
		// 인스턴스들이 공유하는 변수 - 현재 마지막 번호는?
//		System.out.println(employeeKim.serialNumber);
//		System.out.println(employeeLee.serialNumber);
//		System.out.println(employeeHong.serialNumber);
		
		// static 변수 호출하는 방법 
		// 클래스 이름으로 접근 가능
//		System.out.println(Employee.serialNumber);
	
		int total = add(10,100);
//		System.out.println(total);
	} // end of main
	
	public static int add(int n1, int n2) {
		return n1+n2;
	}
	
}
