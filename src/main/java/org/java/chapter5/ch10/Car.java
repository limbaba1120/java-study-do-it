package org.java.chapter5.ch10;

public abstract class Car {
	public abstract void drive();

	public abstract void stop();

	public abstract void fuel();

	public void startCar() {
		System.out.println("시동을 킨다");
	}

	public void turnOff() {
		System.out.println("시동을 끈다");
	}

	public void washCar() {
		// 중괄호가 있다는 것은 구현 코드가 있다 -> abstract 아님
	}

	// 변하지 않고 재정의 안함
	// template 메서드 안에는 abstract, 구현 메서드가 들어가도됨
	final public void run() {
		startCar();
		drive();
		stop();
		turnOff();
		fuel();
		washCar();
	}
}
