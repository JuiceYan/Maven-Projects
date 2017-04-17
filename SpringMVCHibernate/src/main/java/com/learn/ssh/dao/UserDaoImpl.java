package com.learn.ssh.dao;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.ssh.entity.User;
import com.learn.ssh.utils.BaseDaoUtils;

@Repository
public class UserDaoImpl implements UserDao{
	@Autowired
	private BaseDaoUtils<User, Serializable> baseDaoUtils;
	
	public UserDaoImpl(){
		System.out.println("UserDaoImpl>>>>>>>>>>init");
	}
	public User getUser(String id) {
		// TODO Auto-generated method stub
		return baseDaoUtils.get(id);
	}
	public String saveUser(User entity) {
		// TODO Auto-generated method stub
		return (String) baseDaoUtils.save(entity);
	}

}
