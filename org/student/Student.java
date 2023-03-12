package org.student;

import org.department.Department;

public class Student extends Department{

	public void studentName() {
		System.out.println("The student name is Bala");

	}
	public void studentDept() {
		System.out.println("The student is from BCA");

	}
	public void studentId() {

		System.out.println("The setudent ID is RA14312040210049");
	}
	public static void main(String[] args) {
		Student info=new Student ();
		info.collegeName();
		info.collegeCode();
		info.collegeRank();
		info.deptName();
		info.studentName();
		info.studentDept();
		info.studentId();
	}
}



