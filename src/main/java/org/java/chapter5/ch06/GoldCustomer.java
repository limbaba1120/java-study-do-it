package org.java.chapter5.ch06;

public class GoldCustomer extends Customer {

	private int agentId;
	double salesRatio;

	public GoldCustomer(int customerId, String customerName) {
		super(customerId, customerName);

		customerGrade = "GOLD";
		salesRatio = 0.1;
		bonusRatio = 0.02;
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price*salesRatio);
	}
}
