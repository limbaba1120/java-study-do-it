package org.java.masteringjava.chapter04.ch05;

import java.util.Arrays;
import java.util.function.BinaryOperator;

class CompareString implements BinaryOperator<String> {

	@Override
	public String apply(String s1, String s2) {
		if (s1.getBytes().length >= s2.getBytes().length) {
			return s1;
		} else {
			return s2;
		}
	}
}

public class ReduceTest {

	public static void main(String[] args) {
		String[] greetings = {"안녕하세요~~~~~~~~~", "helloasdasdasddas", "good morning", "방가방가"};

		System.out.println(greetings[0].length());
		System.out.println(greetings[0].getBytes().length);
		System.out.println(greetings[1].length());
		System.out.println(greetings[1].getBytes().length);

		String maxString = Arrays.stream(greetings).reduce("", (s1, s2) -> {
			if (s1.getBytes().length >= s2.getBytes().length) {
				return s1;
			} else {
				return s2;
			}
		});
		System.out.println(maxString);

		System.out.println(Arrays.stream(greetings).reduce(new CompareString()).get());

	}
}
