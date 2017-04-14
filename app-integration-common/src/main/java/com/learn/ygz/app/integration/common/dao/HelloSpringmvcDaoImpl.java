package com.learn.ygz.app.integration.common.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class HelloSpringmvcDaoImpl implements HelloSpringmvcDao{
	private SessionFactory sessionFactory;
	
	/**
	 * @return the sessionFactory
	 */
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * @param sessionFactory the sessionFactory to set
	 */
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public void sayHello() {
		System.out.println("Hello Spring MVC"+sessionFactory);
		Session session = sessionFactory.openSession();
		String queryString = "insert into User(userName,age) values (?,?)";
		Query  query = session.createSQLQuery(queryString);
//		query.setParameter(0, 1);
		query.setParameter(0, "user");
		query.setParameter(1, 11);
		int result = query.executeUpdate();
		System.out.println("result:"+result);
	}
	
}
