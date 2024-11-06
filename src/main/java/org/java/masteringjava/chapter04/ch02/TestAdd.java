package org.java.masteringjava.chapter04.ch02;

public class TestAdd {
	public static void main(String[] args) {
		Add addF = (x, y) -> {
			return x + y; // return, 중괄호 생략 가능
		};

		System.out.println(addF.add(3, 5));

		MyMaxNumber max = (x, y) -> {
			return (x >= y) ? x : y;
		};

		System.out.println(max.getMax(5, 10));
	}
}
