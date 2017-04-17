package com.learn.ygz.app.integration.service.dao;

import com.learn.ygz.app.integration.service.entity.User;

public interface UserDao{

	User getUser(String id);

	String saveUser(User entity);  

}  
