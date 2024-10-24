package org.java.basicjava.chapter3.ch18;

public class ObjectCopyTest {
	public static void main(String[] args) {
		Book[] library = new Book[4];
		Book[] copyLibrary = new Book[4];

		library[0] = new Book("태백산맥1", "조정");
		library[1] = new Book("태백산맥2", "조정");
		library[2] = new Book("태백산맥3", "조정");
		library[3] = new Book("태백산맥4", "조정");

		copyLibrary[0] = library[0];

		for (int i = 0; i < library.length; i++) {
			copyLibrary[i] = new Book();
			copyLibrary[i].setAuthor(library[i].getAuthor());
			copyLibrary[i].setTitle(library[i].getTitle());
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
