package org.java.masteringjava.chapter03.ch03.ch01;

public class GenericPrinter<T> {

	private T material;

	public void setMaterial(T material) {
		this.material = material;
	}

	public T getMaterial() {
		return material;
	}

	public String toString(){
		return material.toString();
	}
}

