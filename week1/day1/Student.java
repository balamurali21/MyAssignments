package week1.day1;

public class Student {

	public void studentInfo() {
		String studentName = "P.Balamuralikrishnan";
		int rollNo = 21;
		String collegeName = "SRM University";
		int markScored = 890;
		float cgpa = 8.9f;
		System.out.println("Student name ="  +  studentName);
		System.out.println("Roll no ="  +  rollNo);
		System.out.println("College name =" +  collegeName);
		System.out.println("Mark obtained ="  +  markScored);
		System.out.println("CGPA ="  +  cgpa);
	}
	public static void main(String[] args) {
		Student s=new Student ();
		s.studentInfo();
	}
}