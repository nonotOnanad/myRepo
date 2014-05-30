package com.capgemini.hibernateapp.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.capgemini.hibernateapp.dao.EmployeeDao;
import com.capgemini.hibernateapp.pojo.EmployeePojo;
import com.capgemini.hibernateapp.util.HibernateUtil;

public class EmployeeDaoImpl implements EmployeeDao {

	public EmployeePojo save(EmployeePojo employee){
		SessionFactory sf = HibernateUtil.getSessionFactory();    
		Session session = sf.openSession();    
		session.beginTransaction();     
		Long id = (Long) session.save(employee);   
		employee.setId(id);             
		session.getTransaction().commit();            
		session.close();     
		return employee;
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
	
	
	public EmployeePojo update(EmployeePojo employee) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.merge(employee);
		session.getTransaction().commit();
		session.close();
		return employee;
	}
	
	public void delete(EmployeePojo employee) {
		SessionFactory sf = HibernateUtil.getSessionFactory();
		Session session = sf.openSession();
		session.beginTransaction();
		session.delete(employee);
		session.getTransaction().commit();
		session.close();
	}

}
