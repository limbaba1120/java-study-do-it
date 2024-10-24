package org.java.basicjava.chapter5.ch11;

public abstract class Calculator implements Calc {
	@Override
	public int add(int num1, int num2) {
		return num1 + num2;
	}

	@Override
	public int sub(int num1, int num2) {
		return num1 - num2;
	}

	@Override
	public void showInfo() {
		System.out.println("모두 구현했다222");
	}


}
