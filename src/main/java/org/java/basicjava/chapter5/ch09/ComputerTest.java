package org.java.basicjava.chapter5.ch09;

public class ComputerTest {
	public static void main(String[] args) {
		Computer computer = new Computer() {
			@Override
			public void display() {

			}

			@Override
			public void typing() {

			}
		};

		Desktop desktop = new Desktop();
		desktop.display();
		desktop.turnOff();

		MyNoteBook myNoteBook = new MyNoteBook();
		myNoteBook.display();
		myNoteBook.typing();
	}
}
