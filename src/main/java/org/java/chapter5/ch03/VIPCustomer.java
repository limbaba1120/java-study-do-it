package org.java.chapter5.ch03;

public class VIPCustomer extends Customer {

	private int agentID;

	double salesRatio;

	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		customerGrade = "VIP"; // 접근 불가
		salesRatio = 0.05;
		bonusRatio = 0.1;

		System.out.println("VIP CUSTOMER(int, String) CALL"); // 상위 클래스가 먼저 생성됨
	}

	@Override
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return (int)(price - (price * salesRatio));
	}

	public int getAgentID() {
		return agentID;
	}

	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + " 상담원 아이디는 " + agentID;
	}
}
