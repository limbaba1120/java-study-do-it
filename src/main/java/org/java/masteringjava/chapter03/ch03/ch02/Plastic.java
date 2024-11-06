package org.java.masteringjava.chapter03.ch03.ch02;

public class Plastic extends Material {

	public String toString() {
		return "재료는 Plastic 이다";
	}

	@Override
	public void doPrinting() {
		System.out.println("플라스틱 재료를 출력");
	}
}

