package org.java.masteringjava.ch03.ch01;

public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();

		powderPrinter.setMaterial(new Powder());
		System.out.println(powderPrinter);

		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
		plasticPrinter.setMaterial(new Plastic());
		System.out.println(plasticPrinter);
	}
}
