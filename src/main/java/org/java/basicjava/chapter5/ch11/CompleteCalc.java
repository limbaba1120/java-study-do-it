package org.java.basicjava.chapter5.ch11;

public class CompleteCalc extends Calculator {
	@Override
	public int mul(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int div(int num1, int num2) {
		if (num2 == 0) {
			return 0;
		} else {
			return num1 / num2;
		}
	}

	@Override
	public void showInfo() {
		System.out.println("모두 구현했다");
	}
}
