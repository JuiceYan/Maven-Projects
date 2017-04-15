package com.learn.ssh.service;

import java.io.Serializable;
import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.learn.ssh.entity.User;

@RunWith(value = SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/spring.xml","classpath:config/spring-hibernate.xml"})
public class UserTest {
	@Autowired
	UserService userService;
	@Test
	public void testSaveUser(){
		User user = new User();
		user.setAge(11);
		user.setCreateDate(new Date());
		user.setUserName("yy");
		Serializable pk = userService.save(user);
		System.out.println("PK:"+pk);
	}
}
