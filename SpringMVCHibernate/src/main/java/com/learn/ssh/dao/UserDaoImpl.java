package com.learn.ssh.dao;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl<User, PK extends Serializable> extends BaseDaoImpl<User, Serializable> implements UserDao<User, PK>{
	public UserDaoImpl(){
		System.out.println("UserDaoImpl>>>>>>>>>>init");
	}

}
