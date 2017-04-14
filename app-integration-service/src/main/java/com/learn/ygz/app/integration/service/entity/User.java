package com.learn.ygz.app.integration.service.entity;

import javax.persistence.Column;  
import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;  
import javax.persistence.Id;  
import javax.persistence.Table;  
  
import org.hibernate.annotations.GenericGenerator;  
  
@Entity  
@Table(name="user")  
public class User {  

    public User() {
		super();
	}

	public User(String userName, String age) {
		super();
		this.userName = userName;
		this.age = age;
	}

	public User(int id, String userName, String age) {
		super();
		this.id = id;
		this.userName = userName;
		this.age = age;
	}

	@Id  
    @GeneratedValue(generator="system-uuid")  
    @GenericGenerator(name = "system-uuid",strategy="uuid")  
    @Column(length=32)  
    private int id;  
      
    @Column(length=32)  
    private String userName;  
      
    @Column(length=32)  
    private String age;  
  
    public int getId() {  
        return id;  
    }  
  
    public void setId(int id) {  
        this.id = id;  
    }  
  
    public String getUserName() {  
        return userName;  
    }  
  
    public void setUserName(String userName) {  
        this.userName = userName;  
    }  
  
    public String getAge() {  
        return age;  
    }  
  
    public void setAge(String age) {  
        this.age = age;  
    }  
      
}  
