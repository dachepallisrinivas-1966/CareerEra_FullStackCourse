package com.ce.ui;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Projections;

import com.ce.entity.Job;
import com.ce.util.HibernateUtil;

public class App2 {

	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();

		Session session = sessionFactory.openSession();

		Criteria c = session.createCriteria(Job.class);
		c.list().forEach(System.out::println);
		
		System.out.println("-------------------------------------------------");
		
		Criteria c2=session.createCriteria(Job.class);  
		c2.setFirstResult(5);  
		c2.setMaxResults(2);
		c2.list().forEach(System.out::println);
		
		
	    Criteria c3=session.createCriteria(Job.class);  
	    c3.setProjection(Projections.property("jobTitle"));  
	    c3.list().forEach(System.out::println);  
		
		
	}

}
