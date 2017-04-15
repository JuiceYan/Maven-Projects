package com.learn.ssh.service;

import java.io.Serializable;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.learn.ssh.dao.UserDao;
import com.learn.ssh.entity.User;
@Transactional
@Service
public class UserServiceImpl<T, PK extends Serializable> extends BaseServiceImpl<T, Serializable> implements UserService<T, Serializable>{
	@Autowired
	private UserDao<User, String> userDao;
	public UserServiceImpl(){
		super();
		System.out.println("UserServiceImpl>>>>>>>>>>>>>>>>init");
		
	}
	
	
}
