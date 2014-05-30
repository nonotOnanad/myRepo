package com.capgemini.hibannoted.main;

import java.sql.Date;
import java.util.List;

import com.capgemini.hibannoted.dao.EmployeeDao;
import com.capgemini.hibannoted.dao.impl.EmployeeDaoImpl;
import com.capgemini.hibannoted.pojo.EmployeePojo;

public class Runner {

	public static void main(String[] args) {
		
		// Initialize DAO
		EmployeeDao empDao = new EmployeeDaoImpl();
		
		// Write
		System.out.println("******* WRITE *******");
		EmployeePojo empl = new EmployeePojo("Mark", "Onanad", new Date(System.currentTimeMillis()), "911");
		
		empl = empDao.save(empl);
		empl = empDao.read(empl.getId());
		System.out.println("Successfully added Employee named "+empl.getFirstname()+" "+empl.getLastname()+". Id is "+empl.getId()+".");
		
		// Read
		System.out.println("******* READ *******");
		List employees = empDao.list();
		System.out.println("Total Employees: " + employees.size());
		
		// Update
		System.out.println("******* UPDATE *******");
		EmployeePojo empl2 = empDao.read(empl.getId()); 
		System.out.println("Name Before Update:" + empl2.getFirstname());
		empl2.setFirstname("James");
		empDao.update(empl2); 
		empl2 = empDao.read(empl.getId()); 
		System.out.println("Name Aftere Update:" + empl2.getFirstname());
		
		// Delete
		System.out.println("******* DELETE *******");
		empDao.delete(empl); 
		EmployeePojo empl3 = empDao.read(empl.getId());
		System.out.println("Object:" + empl3);

	}

}
