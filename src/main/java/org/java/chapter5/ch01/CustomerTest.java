package org.java.chapter5.ch01;

public class CustomerTest {
	public static void main(String[] args) {

		int price = 10000;

		Customer customerLee = new Customer();
		customerLee.setCustomerName("이순신");
		customerLee.setCustomerId(10000);
		customerLee.bonusPoint = 1000;
		int cost = customerLee.calcPrice(price);
		System.out.println(customerLee.showCustomerInfo() + "지불 금액은 " + cost + "입니다.");

		VIPCustomer customerKim = new VIPCustomer();
		customerKim.setCustomerName("김유신");
		customerKim.setCustomerId(10001);
		customerKim.bonusPoint = 2000;
		cost = customerKim.calcPrice(price);
		System.out.println(customerKim.showCustomerInfo() + "지불 금액은 " + cost + "입니다.");

		VIPCustomer customerPark = new VIPCustomer();
		customerPark.setCustomerName("Park");
		cost = customerPark.calcPrice(price);
		System.out.println(customerPark.showCustomerInfo() + "지불 금액은 " + cost + "입니다.");
	}
}
