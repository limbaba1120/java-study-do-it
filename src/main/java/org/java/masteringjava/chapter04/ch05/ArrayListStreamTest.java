package org.java.masteringjava.chapter04.ch05;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.add("aasdf");
		list.add("dasbas");
		list.add("basd");
		list.add("csdfsdf");

		Stream<String> stream = list.stream();
		stream.forEach(s -> System.out.println(s));

		list.stream().sorted().forEach(s -> System.out.println(s));
		list.stream().map(s -> s.length()).forEach(n -> System.out.println(n));
		list.stream().filter(s->s.length() >= 6).forEach(s->System.out.println(s));
	}
}
