package com.capgemini.hibernateapp.dao;

import java.util.List;

import com.capgemini.hibernateapp.pojo.EmployeePojo;

public interface EmployeeDao {
	
	public EmployeePojo save(EmployeePojo employee);

	public List list();
	
	public EmployeePojo read(Long id);

	public EmployeePojo update(EmployeePojo employee);
	
	public void delete(EmployeePojo employee);
}