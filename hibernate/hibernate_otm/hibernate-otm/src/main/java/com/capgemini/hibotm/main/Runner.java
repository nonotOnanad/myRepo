package com.capgemini.hibotm.main;

import java.sql.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.capgemini.hibotm.domain.Department;
import com.capgemini.hibotm.domain.Employee;
import com.capgemini.hibotm.util.HibernateUtil;

public class Runner {
	
	public static void main(String[]args){
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		Department department = new Department();
		department.setDepartmentName("Sales");
		session.save(department);
		
		Employee emp1 = new Employee("Nina", "Mayers",new Date(System.currentTimeMillis()), "111");
		Employee emp2 = new Employee("Tony", "Almeida",new Date(System.currentTimeMillis()), "222");
		emp1.setDepartment(department);
		emp2.setDepartment(department);
		
		session.save(emp1);
		session.save(emp2);
		session.getTransaction().commit();
		session.close();

	}
}
