package org.java.basicjava.chapter3.ch13;

public class Student {

	private String studentName;
	private int grade;
	private int money;

	public Student(String studentName, int money) {
		this.studentName = studentName;
		this.money = money;
	}

	public void takeBus(Bus bus) {
		bus.take(1000);
		this.money -= money;
	}

	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= money;
	}

	public void showStudentInfo() {
		System.out.println(this.studentName + "님의 남은 돈은 " + this.money + "원 입니다.");
	}
}
