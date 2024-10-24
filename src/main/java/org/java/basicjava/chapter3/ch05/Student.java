package org.java.basicjava.chapter3.ch05;

public class Student {
	private int studentId;
	private String studentName;

	Subject korean;
	Subject math;

	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;

		korean = new Subject();
		math = new Subject();
	}

	public void setKoreanSubject(String subjectName, int score) {
		korean.subjectName = subjectName;
		korean.score = score;
	}

	public void setMathSubject(String subjectName, int score) {
		math.subjectName = subjectName;
		math.score = score;
	}

	public void showStudentScore() {
		int total = korean.score + math.score;
		System.out.println(studentName + "학생의 총점은 " + total + "점 입니다");
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentName(String name) {
		this.studentName = name;
	}


}
