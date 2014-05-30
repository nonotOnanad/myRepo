package com.capgemini.hibannoted.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.capgemini.hibannoted.dao.EmployeeDao;
import com.capgemini.hibannoted.pojo.EmployeePojo;
import com.capgemini.hibannoted.util.HibernateUtil;

public class EmployeeDaoImpl implements EmployeeDao{

	public EmployeePojo save(EmployeePojo employeePojo){
		SessionFactory sf = HibernateUtil.getSessionFactory();    
		Session session = sf.openSession();    
		session.beginTransaction();     
		Long id = (Long) session.save(employeePojo);   
		employeePojo.setId(id);             
		session.getTransaction().commit();            
		session.close();     
		return employeePojo;
	}

	public List list() {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		List employees = session.createQuery("from EmployeePojo").list();
		session.close();
		return employees;
	}

	public EmployeePojo read(Long id) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		EmployeePojo employee = (EmployeePojo) session.get(EmployeePojo.class, id);
		session.close();
		return employee;
	}


	public EmployeePojo update(EmployeePojo employeePojo) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.merge(employeePojo);
		session.getTransaction().commit();
		session.close();
		return employeePojo;
	}

	public void delete(EmployeePojo employeePojo) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.delete(employeePojo);
		session.getTransaction().commit();
		session.close();
	}

	public EmployeePojo findByFirstName(String firstname){
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		EmployeePojo employee = (EmployeePojo) session.get(EmployeePojo.class, firstname);
		session.close();

		return employee;
	}
}
