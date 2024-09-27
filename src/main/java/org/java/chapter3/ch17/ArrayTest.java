package org.java.chapter3.ch17;

public class ArrayTest {
	public static void main(String[] args) {
		int[] arr1 = new int[10];
		int arr2[] = new int[10];

		int[] numbers = {1, 2, 3, 4};

		for (int i = 0; i < numbers.length; i++) {
			System.out.println(i + "번째: " + numbers[i]);
		}

		int[] ids;
		ids = new int[] {10, 20, 30, 40, 50};

		int j = 0;
		for (int id : ids) {
			System.out.println(j + "번째: " + id);
			j++;
		}

		int[] arr = new int[10];

		for (int i = 0, num = 1; i < arr.length; i++, num++) {
			arr[i] = num;
		}

		int total = 0;

		for (int i = 0; i < arr.length; i++) {
			total += arr[i];
		}
		System.out.println(total);

		int count = 0;
		double[] dArr = new double[5];
		dArr[0] = 1.1; count++;
		dArr[1] = 2.1; count++;
		dArr[2] = 3.1; count++;
		double mtotal = 1;

		// 잘못된 방식
		/*for (double dnum : dArr) {
			mtotal *= dnum;
		}*/
		for (int i = 0; i < count; i++) {
			mtotal *= dArr[i];
		}
		// result는 0 왜냐하면 dArr[3], dArr[4] 번째 데이터는 0이므로 0이 곱해짐
		System.out.println(mtotal);

		char[] alphabets = new char[26];
		char ch = 'A';
		for (int i = 0; i < alphabets.length; i++) {
			alphabets[i] = ch++;
		}
		for (char alpha : alphabets) {
			System.out.print(alpha + " ");
		}
	}
}
