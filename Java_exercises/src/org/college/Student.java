package org.college;

public class Student extends College_Details {
	
	private void studentName() {
		System.out.println("Ashik kumar");

	}
	
	private void studentDept() {
		System.out.println("Mechanical");

	}
	
	private void studentId() {
		System.out.println("2016111");

	}
	
	public static void main(String[] args) {
		
		Student obj = new Student();
		obj.studentName();
		obj.studentId();
		obj.studentDept();
		obj.department();
		obj.hostelName();
		obj.collegeCode();
		obj.collegeName();
		obj.collegeRank();

	}

}
