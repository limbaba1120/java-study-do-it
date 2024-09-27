package org.java.chapter3.ch18;

public class BookArrayTest {
	public static void main(String[] args) {
		Book[] library = new Book[5];

		for (int i = 0; i < library.length; i++) {
			System.out.print(library[i] + " ");
		}

		System.out.println();

		library[0] = new Book("태백산맥1", "조정");
		library[1] = new Book("태백산맥2", "조정");
		library[2] = new Book("태백산맥3", "조정");
		library[3] = new Book("태백산맥4", "조정");
		library[4] = new Book("태백산맥5", "조정");

		for (int i = 0; i < library.length; i++) {
			System.out.print(library[i] + " ");
			library[i].showBookInfo();
		}

	}
}
