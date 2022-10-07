package ch16;

public class Employee {
	
	public static int serialNumber = 1001;
	
	private String employeeName;
	// 객체 자신이 고유한 값을 가지는 변수로 활용! 멤버변수  
	
	private String department; 
	private int employeeId;
	
	public Employee(String employeeName, String department) {
		
		this.employeeId = serialNumber;
		serialNumber++;
		this.employeeName = employeeName;
		this.department = department;
		
	}
	
	public int getEmployeeId() {
		return employeeId;
	}
	public String getEployeeName() {
		return employeeName;
	}
	public String getDepartment() {
		return department;
	}
}
