package com.ce.ui;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.ce.entity.Song;

public class App4 {

	public static void main(String[] args) {
		
		// configuration
		Configuration configuration = new Configuration().configure();
		configuration.addAnnotatedClass(Song.class);
		
		// session factory - which provide sessions
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		
		// creating a session
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
		
		Song song = session.get(Song.class, 3);
		
		session.delete(song);
		
		session.getTransaction().commit();
		
		
		session.close();
		sessionFactory.close();

	}

}
