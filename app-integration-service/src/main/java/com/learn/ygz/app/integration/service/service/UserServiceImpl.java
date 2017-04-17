package com.learn.ygz.app.integration.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.learn.ygz.app.integration.service.dao.UserDao;
import com.learn.ygz.app.integration.service.entity.User;
@Transactional
@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserDao userDao;
	public UserServiceImpl(){
		System.out.println("UserServiceImpl>>>>>>>>>>>>>>>>init");
	}
	public User getUser(String id) {
		// TODO Auto-generated method stub
		return userDao.getUser(id);
	}
	public String saveUser(User user) {
		// TODO Auto-generated method stub
		return userDao.saveUser(user);
	}
	
}
