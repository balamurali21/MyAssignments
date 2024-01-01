package week1.day1_javabasics;

public class Student {
	public void studentInfo() {
		String studentName = "P.Balamuralikrishnan";
		String collegeName = "SRM University";
	    short rollNo = 21;
	    int markScored = 450;
	    float cgpa = 9.0f;
	    System.out.println("Student name = "  +studentName);
	    System.out.println("College name = " +collegeName);
		System.out.println("Roll no = "  +rollNo);
		System.out.println("Mark obtained = "  +markScored);
		System.out.println("CGPA = " +cgpa);
		
	}
	public static void main(String[] args) {
		Student info=new Student();
		info.studentInfo();
	}

}
