package com.sample.model;

public class Employee{
	private String empId;
	private String empName;
	private String empNo;
	private String address;
	
	public Employee() {}

	public Employee(String empId, String empName, String empNo, String address) {
		this.empId = empId;
		this.empName = empName;
		this.empNo = empNo;
		this.address = address;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpNo() {
		return empNo;
	}

	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
