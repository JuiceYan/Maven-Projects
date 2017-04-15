package com.learn.ssh.dao;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDaoImpl<User, PK extends Serializable> extends BaseDaoImpl<User, Serializable> implements StudentDao<User, PK>{
	public StudentDaoImpl(){
		System.out.println("UserDaoImpl>>>>>>>>>>init");
	}

}
