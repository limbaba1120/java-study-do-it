package org.java.basicjava.chapter3.ch14;

public class Employee {

	private static int serialNum = 1000;

	private int employeeId;
	private String employeeName;
	private String department;

	public Employee() {
		employeeId = ++serialNum;
	}

	public static int getSerialNum() {
		int i = 0; // 지역 변수는 사용 가능
		// employeeName = "Lee"; // static 메서드 안에서는 인스턴스 변수 사용 못함
		return serialNum;
	}

	public static void setSerialNum(int serialNum) {
		Employee.serialNum = serialNum;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}
}
