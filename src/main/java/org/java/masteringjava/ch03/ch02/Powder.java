package org.java.masteringjava.ch03.ch02;
public class Powder extends Material {

	public String toString() {
		return "재료는 Powder 이다";
	}

	@Override
	public void doPrinting() {
		System.out.println("파우더 재료를 출력한다");
	}
}

