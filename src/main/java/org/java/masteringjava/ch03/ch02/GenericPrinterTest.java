package org.java.masteringjava.ch03.ch02;

import org.java.masteringjava.ch03.ch01.GenericPrinter;
import org.java.masteringjava.ch03.ch01.Plastic;
import org.java.masteringjava.ch03.ch01.Powder;

public class GenericPrinterTest {

	public static void main(String[] args) {
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<>();
		powderPrinter.setMaterial(new Powder());
		System.out.println(powderPrinter);


		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<>();
		plasticPrinter.setMaterial(new Plastic());
		System.out.println(plasticPrinter);

		// GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>();
	}
}
