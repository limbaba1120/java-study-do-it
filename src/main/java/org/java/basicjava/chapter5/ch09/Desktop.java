package org.java.basicjava.chapter5.ch09;

public class Desktop extends Computer{
	@Override
	public void display() {
		System.out.println("Desktop Display");
	}

	@Override
	public void typing() {
		System.out.println("Desktop typing");
	}

	@Override
	public void turnOn() {
		System.out.println("Desktop turn On");
	}

	@Override
	public void turnOff() {
		System.out.println("Desktop turn Off");
	}
}
