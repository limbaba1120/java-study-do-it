package org.java.basicjava.chapter5.ch03;

public class CustomerTest {
	public static void main(String[] args) {
	// /*	Customer customerLee = new Customer();
	// 	customerLee.setCustomerName("이순신");
	// 	customerLee.setCustomerId(10000);
	// 	customerLee.bonusPoint = 1000;
	// 	System.out.println(customerLee.showCustomerInfo());*/

		VIPCustomer customerKim = new VIPCustomer(1111, "유유");
		customerKim.bonusPoint = 2000;
		VIPCustomer vCustomer = new VIPCustomer(0, "LEE"); // Customer, VIPCustomer 클래스에 있는 변수, 메서드 모두 사용 가능
		Customer customer = new VIPCustomer(11, "KIM"); // Customer 클래스에 있는 변수 , 메서드만 사용 가능
		System.out.println(customerKim.showCustomerInfo());


	}
}
