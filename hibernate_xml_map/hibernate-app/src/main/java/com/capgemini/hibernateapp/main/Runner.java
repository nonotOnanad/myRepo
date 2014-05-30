package com.capgemini.hibernateapp.main;

import java.sql.Date;
import java.util.List;

import com.capgemini.hibernateapp.dao.EmployeeDao;
import com.capgemini.hibernateapp.dao.impl.EmployeeDaoImpl;
import com.capgemini.hibernateapp.pojo.EmployeePojo;

public class Runner {

	public static void main(String[] args) {
		
		EmployeeDao employeeDao = new EmployeeDaoImpl();
		// Write
		System.out.println("******* WRITE *******");
		EmployeePojo empl = new EmployeePojo("Mark", "Onanad", new Date(System.currentTimeMillis()), "911");
		empl.setId(new Long(1));
		empl = employeeDao.save(empl);
		empl = employeeDao.read(empl.getId());
		System.out.println("Successfully added Employee named "+empl.getFirstname()+" "+empl.getLastname()+". Id is "+empl.getId()+".");
		
		// Read
		System.out.println("\n******* READ *******");
		List employees = employeeDao.list();
		System.out.println("Total Employees: " + employees.size());
		
		// Update
		System.out.println("\n******* UPDATE *******");
		EmployeePojo empl2 = employeeDao.read(new Long(1)); // read employee with id 1
		System.out.println("Name Before Update:" + empl2.getFirstname());
		empl2.setFirstname("James");
		employeeDao.update(empl2); // save the updated employee details
		empl2 = employeeDao.read(new Long(1)); // read again employee with id 1
		System.out.println("Name After Update:" + empl2.getFirstname());
		
		// Delete
		System.out.println("\n******* DELETE *******");
		employeeDao.delete(empl); 
		EmployeePojo empl3 = employeeDao.read(empl.getId());
		System.out.println("Object:" + empl3);
	}

}
