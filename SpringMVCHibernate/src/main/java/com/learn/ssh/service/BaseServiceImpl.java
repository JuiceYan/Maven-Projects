package com.learn.ssh.service;

import java.io.Serializable;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;

import com.learn.ssh.dao.BaseDao;
public class BaseServiceImpl<T, PK extends Serializable> implements BaseService<T, PK>{
	public BaseServiceImpl(){
		System.out.println("BaseServiceImpl>>>>>>>>>>>>init");
	}
	@Autowired
	private BaseDao<T, PK> baseDao;
	
	
	public T get(PK id) {
		return baseDao.get(id);
	}
	
	public PK save(T entity) {
		return baseDao.save(entity);
	}

}
