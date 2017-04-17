package com.learn.ygz.app.integration.service.entity;
import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * 实体类 - 基类
 */
@Entity  
@Table(name="student")  
public class Student extends BaseEntity implements Serializable{
	private static final long serialVersionUID = 1L;
	/**
	 * studentName
	 */
	@Column(length=32)  
	private String studentName;  
	/**
	* age
	*/
     @Column(length=32)  
     private int age;
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
     
}

