package com.tap.Manager;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import com.tap.Entity.Employee;
import com.tap.Entity.Project;

public class HibernateManager 
{
	private Session session;

	public HibernateManager()
	{
		session = new Configuration().configure().addAnnotatedClass(Employee.class).
		addAnnotatedClass(Project.class).buildSessionFactory().openSession();
	}
	
	public void add(Employee e)
	{
		session.beginTransaction();
		session.persist(e);
		session.getTransaction().commit();
	}

}
