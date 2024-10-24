package org.java.basicjava.chapter3.ch05;

public class StudentSubjectTest {
	public static void main(String[] args) {
		Student lee = new Student(100, "LEE");
		Student kim = new Student(101, "KIM");

		lee.setKoreanSubject("국어", 100);
		lee.setMathSubject("수학", 95);

		kim.setKoreanSubject("국어", 90);
		kim.setMathSubject("수학", 85);

		lee.showStudentScore();
		kim.showStudentScore();

		System.out.println(lee.getStudentId());
		System.out.println(kim.getStudentId());

		lee.setStudentName("park");
		lee.showStudentScore();
	}
}
