package com.capgemini.hibotpcc.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

public abstract class HibernateUtil {

	private static SessionFactory sessionFactory;
	
	static{
		sessionFactory = new AnnotationConfiguration().configure().buildSessionFactory();
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
