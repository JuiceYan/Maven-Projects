package com.learn.ssh.service;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.learn.ssh.dao.StudentDao;
import com.learn.ssh.entity.User;
@Transactional
@Service
public class StudentServiceImpl<T, PK extends Serializable> extends BaseServiceImpl<T, Serializable> implements UserService<T, Serializable>{
	@Autowired
	private StudentDao<User, String> studentDao;
	public StudentServiceImpl(){
		super();
		System.out.println("UserServiceImpl>>>>>>>>>>>>>>>>init");
		
	}
	
	
}
