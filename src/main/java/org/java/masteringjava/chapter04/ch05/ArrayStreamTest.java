package org.java.masteringjava.chapter04.ch05;

import java.util.Arrays;

public class ArrayStreamTest {
	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};

		int sum = Arrays.stream(arr).sum();
		System.out.println(sum);
		long count = Arrays.stream(arr).count();
		System.out.println(count);

		int sumReduce = Arrays.stream(arr).reduce(0, (x, y) -> x - y);
		System.out.println(sumReduce);
	}
}
