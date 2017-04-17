package com.learn.ygz.app.integration.service;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.learn.ygz.app.integration.service.entity.User;
import com.learn.ygz.app.integration.service.service.UserService;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/applicationContext/application-context.xml"})
@TransactionConfiguration(transactionManager = "transactionManager",defaultRollback=true)
@Transactional
public class UserTest {
	@Autowired
	SessionFactory sessionFactory;
	@Autowired
	UserService userService;
	
	@Before
	public void setUp(){
		Session session = sessionFactory.openSession();
		
		System.out.println("openSession:"+session+" sessionFactory:"+sessionFactory);
	}
	@Test
	public void testSaveUser(){
		User user = new User();
		user.setAge(11);
		user.setCreateDate(new Date());
		user.setUserName("yy");
		Serializable pk = userService.saveUser(user);
		System.out.println("PK:"+pk);
	}
}
