package org.java.chapter5.ch14;

public interface Calc {

	int add (int num1, int num2);
	int sub (int num1, int num2);
	int mul (int num1, int num2);

	int div(int num1, int num2);

	void showInfo();

	default void description() {
		System.out.println("정수를 계산");
		myMethod();
	}

	private void myMethod() {
		System.out.println("private method");
	}

	static int total(int[] arr) {
		mystaticMethod();

		int total = 0;

		for (int i : arr) {
			total += i;
		}

		return total;
	}

	private static void mystaticMethod() {
		System.out.println("private static method");
	}
}
