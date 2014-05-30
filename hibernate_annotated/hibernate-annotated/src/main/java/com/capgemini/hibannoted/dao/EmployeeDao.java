package com.capgemini.hibannoted.dao;

import java.util.List;

import com.capgemini.hibannoted.pojo.EmployeePojo;

public interface EmployeeDao {
	
	public EmployeePojo save(EmployeePojo employeePojo);

	public List list();

	public EmployeePojo read(Long id);

	public EmployeePojo update(EmployeePojo employeePojo);

	public void delete(EmployeePojo employeePojo);
	
	public EmployeePojo findByFirstName(String firstname);
}
