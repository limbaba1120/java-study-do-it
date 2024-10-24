package org.java.basicjava.chapter3.ch04;

public class StudentTest {
	public static void main(String[] args) {
		Student studentLee = new Student(10, "LEE"); // studentLee(인스턴스) => 참조 변수
		studentLee.studentAddress = "Seoul";

		Student studentKim = new Student(20, "KIM");
		studentKim.studentAddress = "NEW YORK";

		studentLee.showStudentInfo();
		studentKim.showStudentInfo();

		System.out.println(studentLee);
		System.out.println(studentKim);
	}
}
