package org.java.chapter3.ch09;

public class BirthDayTest {

	public static void main(String[] args) {
		BirthDay day = new BirthDay();
		day.setYear(2023);
		day.setMonth(1);
		day.setDay(30);

		System.out.println(day.isValid());
		System.out.println(day);
		day.printThis();
	}
}
