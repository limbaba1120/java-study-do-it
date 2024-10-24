package org.java.basicjava.chapter5.ch10;

public class ManualCar extends Car{
	@Override
	public void drive() {
		System.out.println("사람이 운전");
		System.out.println("사람이 핸들 조작");
	}

	@Override
	public void stop() {
		System.out.println("브레이크 밞아서 정지");
	}

	@Override
	public void fuel() {

	}

	@Override
	public void washCar() {
		System.out.println("손세차를 합니다");
	}
}
