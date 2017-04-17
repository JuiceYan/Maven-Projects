package com.learn.ssh.dao;

import com.learn.ssh.entity.User;

public interface UserDao{

	User getUser(String id);

	String saveUser(User entity);  

}  
