package org.java.basicjava.chapter5.ch15;

public interface Sell {

	void sell();

	default void order() {
		System.out.println("sller order");
	}
}
