package com.capgemini.hibotpcc.main;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.capgemini.hibotpcc.domain.Employee;
import com.capgemini.hibotpcc.domain.Owner;
import com.capgemini.hibotpcc.domain.Person;
import com.capgemini.hibotpcc.util.HibernateUtil;

public class Runner {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		Person person = new Person("Steve", "Balmer");
		person.setPersonId(1L);
		session.save(person);
		
		Employee employee = new Employee("James", "Gosling", "Marketing", new Date());
		employee.setPersonId(2L);
		session.save(employee);
		
		Owner owner = new Owner("Bill", "Gates", 300L, 20L);
		owner.setPersonId(3L);
		session.save(owner);
		
		session.getTransaction().commit();
		session.close();

	}

}
