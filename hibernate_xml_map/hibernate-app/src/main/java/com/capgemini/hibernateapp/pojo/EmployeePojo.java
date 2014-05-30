package com.capgemini.hibernateapp.pojo;

import java.sql.Date;

public class EmployeePojo {
	
	private Long id;
	
	private String firstname;
	
	private String lastname;
	
	private Date birthDate;
	
	private String cellphone;

	public EmployeePojo() {
		super();
	}

	public EmployeePojo(String firstname, String lastname, Date birthDate,
			String cellphone) {
		super();
		this.firstname = firstname;
		this.lastname = lastname;
		this.birthDate = birthDate;
		this.cellphone = cellphone;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

}
