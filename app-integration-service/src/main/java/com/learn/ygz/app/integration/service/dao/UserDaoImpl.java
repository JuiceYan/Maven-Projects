package com.learn.ygz.app.integration.service.dao;

import org.springframework.stereotype.Repository;

import com.learn.ygz.app.integration.service.entity.User;
import com.learn.ygz.app.integration.service.utils.BaseDaoUtilsImpl;
@Repository
public class UserDaoImpl extends BaseDaoUtilsImpl<User, String> implements UserDao{
	public UserDaoImpl(){
		System.out.println("UserDaoImpl>>>>>>>>>>init");
	}

	public User getUser(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String saveUser(User entity) {
		// TODO Auto-generated method stub
		return null;
	}
}
