package com.learn.ygz.app.integration.service.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 实体类 - 基类
 */
@Entity  
@Table(name="user")  
public class User extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	/**
	 * userName
	 */
	 @Column(length=32)  
	    private String userName;  
	 /**
		 * age
		 */   
     @Column(length=32)  
     private int age;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getAge() {
		return age;
	}


     
}

