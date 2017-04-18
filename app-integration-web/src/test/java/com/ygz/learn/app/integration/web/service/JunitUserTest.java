package com.ygz.learn.app.integration.web.service;

import java.io.Serializable;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.learn.ygz.app.integration.service.entity.User;
import com.learn.ygz.app.integration.service.service.UserService;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/applicationContext/application-context-junit.xml"})
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
}
