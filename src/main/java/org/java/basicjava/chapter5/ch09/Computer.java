package org.java.basicjava.chapter5.ch09;

public abstract class Computer {

	// 하위 클래스에게 책임을 위임
	// must implement 해야함 (하위 클래스가) -> 구체적인 클래스가 되기 위해
	public abstract void display();

	public abstract void typing();

	public void turnOn() {
		System.out.println("전원을 킨다");
	}
	public void turnOff() {
		System.out.println("전원을 끈다");
	}
}
