package org.java.chapter3.ch04;

public class Student {
	int studentID;
	String studentName;
	String studentAddress;

	// default constructor
	public Student() {

	}

	public Student(int studentID, String studentName) {
		this.studentID = studentID;
		this.studentName = studentName;
	}

	public Student(int studentID, String studentName, String studentAddress) {
		this.studentID = studentID;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}

	public void showStudentInfo() {
		System.out.println(studentID + "," + studentName + "," + studentAddress);

	}

	public String getStudentName() {
		return studentName;
	}


}
