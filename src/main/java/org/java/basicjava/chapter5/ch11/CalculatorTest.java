package org.java.basicjava.chapter5.ch11;

public class CalculatorTest {

	public static void main(String[] args) {
		Calc calc = new CompleteCalc();
		System.out.println("calc.add(1, 2) = " + calc.add(1, 2));
		System.out.println("calc.sub(1,2) = " + calc.sub(1, 2));
		calc.showInfo();
	}
}
