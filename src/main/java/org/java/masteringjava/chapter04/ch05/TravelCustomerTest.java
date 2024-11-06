package org.java.masteringjava.chapter04.ch05;

import java.util.ArrayList;
import java.util.List;

public class TravelCustomerTest {
	public static void main(String[] args) {
		TravelCustomer customerLee = new TravelCustomer("이순신", 40, 100);
		TravelCustomer customerPark = new TravelCustomer("박유신", 20, 70);
		TravelCustomer customerKim = new TravelCustomer("김순", 60, 50);

		List<TravelCustomer> customerList = new ArrayList<>();

		customerList.add(customerLee);
		customerList.add(customerPark);
		customerList.add(customerKim);

		customerList.stream().map(c -> c.getName()).forEach(System.out::println);
		int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("총 여행 비용 : " + total + "이다");

		customerList.stream().filter(c -> c.getAge() >= 30).map(TravelCustomer::getName).forEach(System.out::println);
	}
}
