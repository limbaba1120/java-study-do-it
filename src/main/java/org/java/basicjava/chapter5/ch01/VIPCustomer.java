package org.java.basicjava.chapter5.ch01;

public class VIPCustomer extends Customer {

	private int agentID;

	double salesRatio;

	public VIPCustomer() {
		customerGrade = "VIP"; // 접근 불가
		salesRatio = 0.05;
		bonusRatio = 0.1;
	}

	public int getAgentID() {
		return agentID;
	}
}
