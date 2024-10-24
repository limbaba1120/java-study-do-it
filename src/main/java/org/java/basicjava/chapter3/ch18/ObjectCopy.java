package org.java.basicjava.chapter3.ch18;

public class ObjectCopy {
	public static void main(String[] args) {
		Book[] library = new Book[4];
		Book[] copyLibrary = new Book[4];

		library[0] = new Book("태백산맥1", "조정");
		library[1] = new Book("태백산맥2", "조정");
		library[2] = new Book("태백산맥3", "조정");
		library[3] = new Book("태백산맥4", "조정");

		System.arraycopy(library, 0, copyLibrary, 0, library.length);

		for (Book book : library) {
			book.showBookInfo();
		}

		System.out.println("==============");

		for (Book book : copyLibrary) {
			book.showBookInfo();
		}

		library[0].setAuthor("박원서");
		library[0].setTitle("나목");

		for (Book book : library) {
			book.showBookInfo();
		}

		System.out.println("==============");

		for (Book book : copyLibrary) {
			book.showBookInfo();
		}
	}
}
