package com.learn.ygz.app.integration.service.utils;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;
@Component
public class BaseDaoUtilsImpl<T, PK extends Serializable> implements BaseDaoUtils<T, PK>{
	private Class<T> entityClass;
	@Autowired
	protected SessionFactory sessionFactory;
	  {
		this.entityClass = null;
		Class<?> c = getClass();
		Type type = c.getGenericSuperclass();
		if (type instanceof ParameterizedType) {
            Type[] parameterizedType = ((ParameterizedType) type).getActualTypeArguments();
            System.out.println(parameterizedType[0]);
            this.entityClass = (Class<T>) parameterizedType[0];
        }
	  }
	@SuppressWarnings("unchecked")
	public BaseDaoUtilsImpl() {			
		System.out.println("BaseDaoImpl>>>>>>>>>>>>>>>>init");
	}
	
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	public T get(PK id) {
		Assert.notNull(id, "id is required");
		return (T) getSession().get(entityClass, id);
	}

	public PK save(T entity) {
		Assert.notNull(entity, "entity is required");
		System.out.println("openSession:"+getSession()+" sessionFactory:"+sessionFactory);
		return (PK) getSession().save(entity);
	}

}
