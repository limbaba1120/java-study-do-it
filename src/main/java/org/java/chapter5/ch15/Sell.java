package org.java.chapter5.ch15;

public interface Sell {

	void sell();

	default void order() {
		System.out.println("sller order");
	}
}
