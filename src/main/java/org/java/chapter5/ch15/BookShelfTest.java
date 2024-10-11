package org.java.chapter5.ch15;

public class BookShelfTest {
	public static void main(String[] args) {
		Queue bookQueue = new BookShelf();
		bookQueue.enQueue("태산맥1");
		bookQueue.enQueue("태산맥2");
		bookQueue.enQueue("태산맥3");

		System.out.println("bookQueue.getSize() = " + bookQueue.getSize());
		System.out.println("bookQueue.deQueue() = " + bookQueue.deQueue());
		System.out.println("bookQueue.getSize() = " + bookQueue.getSize());
		System.out.println("bookQueue.deQueue() = " + bookQueue.deQueue());
		System.out.println("bookQueue.getSize() = " + bookQueue.getSize());
		System.out.println("bookQueue.deQueue() = " + bookQueue.deQueue());

	}
}
