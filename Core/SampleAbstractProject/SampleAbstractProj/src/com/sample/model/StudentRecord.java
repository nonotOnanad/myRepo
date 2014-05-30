package com.sample.model;
/**
 * This is a sample of POJO class. Used as data type or data container for Student details.
 * @author monanad
 *
 */
public class StudentRecord {
	private String name;
	private String studentNo;
	private String address;
	
	public StudentRecord() {
	}

	public StudentRecord(String name, String studentNo, String address) {
		this.name = name;
		this.studentNo = studentNo;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStudentNo() {
		return studentNo;
	}

	public void setStudentNo(String studentNo) {
		this.studentNo = studentNo;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
