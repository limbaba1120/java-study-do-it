package org.java.chapter3.ch19;

public class TwoDimensionTest {
	public static void main(String[] args) {
		// int[][] arr = new int[2][3];
		// System.out.println(arr.length); // 전체 행 수
		// System.out.println(arr[0].length); // 열의 수

		int[][] arr = {{1, 2, 3}, {4, 5, 6}};


		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");

			}
			System.out.println();
		}

	}
}
