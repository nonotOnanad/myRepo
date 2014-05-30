package com.capgemini.hiboto.main;

import java.sql.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.capgemini.hiboto.domain.Employee;
import com.capgemini.hiboto.domain.EmployeeDetail;
import com.capgemini.hiboto.util.HibernateUtil;

public class Runner {

	public static void main(String[]args){
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();

		Employee employee = new Employee("Nina", "Mayers",new Date(System.currentTimeMillis()), "111");		
		EmployeeDetail employeeDetail = new EmployeeDetail("10th Street", "LA", "San Francisco", "U.S.");
		employee.setEmployeeDetail(employeeDetail);
		employeeDetail.setEmployee(employee);
		session.save(employee);
				

		List<Employee> employees = session.createQuery("from Employee").list();        
		for (Employee employee1 : employees) {         
			System.out.println(employee1.getFirstname() + " , "                
					+ employee1.getLastname() + ", "                   
					+ employee1.getEmployeeDetail().getState());        }

		session.getTransaction().commit();
		session.close();

	}
}
