package org.java.chapter3.ch18;

public class ObjectCopyTest2 {
	public static void main(String[] args) {
		int[] arr1 = new int[5];
		int[] arr2 = new int[5];

		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		arr1[3] = 4;
		arr1[4] = 5;

		arr2 = arr1;

		for (int i = 0; i < arr1.length; i++) {
			System.out.print(arr1[i]);
		}
		System.out.println(arr1);
		System.out.println();
		for (int i = 0; i < arr2.length; i++) {
			System.out.print(arr2[i]);
		}
		System.out.println(arr2);
	}
}
