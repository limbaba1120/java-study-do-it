package org.java.masteringjava.chapter03.ch03.ch02;

import org.java.masteringjava.chapter03.ch03.ch01.GenericPrinter;
import org.java.masteringjava.chapter03.ch03.ch01.Plastic;
import org.java.masteringjava.chapter03.ch03.ch01.Powder;

public class GenericPrinterTest {

	public static void main(String[] args) {
		org.java.masteringjava.chapter03.ch03.ch01.GenericPrinter<org.java.masteringjava.chapter03.ch03.ch01.Powder> powderPrinter = new org.java.masteringjava.chapter03.ch03.ch01.GenericPrinter<>();
		powderPrinter.setMaterial(new Powder());
		System.out.println(powderPrinter);


		org.java.masteringjava.chapter03.ch03.ch01.GenericPrinter<org.java.masteringjava.chapter03.ch03.ch01.Plastic> plasticPrinter = new GenericPrinter<>();
		plasticPrinter.setMaterial(new Plastic());
		System.out.println(plasticPrinter);

		// GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>();
	}
}
