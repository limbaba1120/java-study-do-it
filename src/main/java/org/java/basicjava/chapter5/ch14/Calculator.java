package org.java.basicjava.chapter5.ch14;

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

	@Override
	public void description() {
		Calc.super.description();
		System.out.println("사칙 연산을 숭행하는 계산기");
	}
}
