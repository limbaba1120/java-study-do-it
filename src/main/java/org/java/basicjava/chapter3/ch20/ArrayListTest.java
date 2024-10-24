package org.java.basicjava.chapter3.ch20;

import java.util.ArrayList;

import org.java.basicjava.chapter3.ch18.Book;

public class ArrayListTest {

	public static void main(String[] args) {
		ArrayList<Book> list = new ArrayList<>();

		list.add(new Book("태백산맥1", "조정"));
		list.add(new Book("태백산맥2", "조정"));
		list.add(new Book("태백산맥3", "조정"));

		for (int i = 0; i < list.size(); i++) {
			list.get(i).showBookInfo();
		}
	}
}
