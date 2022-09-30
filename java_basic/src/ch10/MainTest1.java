package ch10;

public class MainTest1 {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		Student s2 = new Student();
		Student s3 = new Student();
	
		s1.studentID = 1;
		s1.studentName ="철수";
		s1.address = "부산시 진구";
		
		s2.studentID = 2;
		s2.studentName ="길수";
		s2.address = "부산시 해운대구";
		
		s3.studentID = 3;
		s3.studentName ="티모";
		s3.address = "푸른 언덕";
		
		// 기능 사용
//		s1.study();
//		s1.breakTime();
//		System.out.println("================");
//		
//		s2.study();
//		s2.breakTime();
//		System.out.println("================");
//		
//		s3.study();
//		s3.breakTime();
//		System.out.println("================");
		
		s1.test();
		s1.clean();
	}

}
