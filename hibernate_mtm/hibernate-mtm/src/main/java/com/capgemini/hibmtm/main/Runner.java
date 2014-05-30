package com.capgemini.hibmtm.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.capgemini.hibmtm.domain.Employee;
import com.capgemini.hibmtm.domain.Meeting;
import com.capgemini.hibmtm.util.HibernateUtil;

public class Runner {

	public static void main(String[] args) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		
		Meeting meeting1 = new Meeting("Quaterly Sales meeting");
		Meeting meeting2 = new Meeting("Weekly Status meeting");
		Employee employee1 = new Employee("Sergey", "Brin");
		Employee employee2 = new Employee("Larry", "Page");
		employee1.getMeetings().add(meeting1);
		employee1.getMeetings().add(meeting2);
		employee2.getMeetings().add(meeting1);
		session.save(employee1);
		session.save(employee2);
		session.getTransaction().commit();
		session.close();

	}

}
