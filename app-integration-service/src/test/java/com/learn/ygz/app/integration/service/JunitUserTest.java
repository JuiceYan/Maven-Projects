package com.learn.ygz.app.integration.service;

import java.io.Serializable;
import java.util.Date;

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
@ContextConfiguration(locations = {"classpath:config/applicationContext/application-context-service-junit.xml"})
@TransactionConfiguration(transactionManager = "transactionManager",defaultRollback=true)
@Transactional
public class JunitUserTest {
	@Autowired
	UserService userService;
	@Test
	public void testSaveUser(){
		User user = new User();
		user.setAge(11);
		user.setCreateDate(new Date());
		user.setUserName("yy");
		Serializable pk = userService.saveUser(user);
		System.out.println("PK:"+pk);
	}
	
	@Test
	public void testGetUser(){
		User user = new User();
		user.setAge(11);
		user.setCreateDate(new Date());
		user.setUserName("yy");
		Serializable savePk = userService.saveUser(user);
		System.out.println("savePk:"+savePk);
		
		String id = (String)savePk;
		User user1 = userService.getUser(id);
		System.out.println("PK:"+user1.getId());
	}
}
