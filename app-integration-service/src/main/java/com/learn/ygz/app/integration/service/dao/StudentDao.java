package com.learn.ygz.app.integration.service.dao;

import com.learn.ygz.app.integration.service.entity.Student;

public interface StudentDao{

	Student getStudent(String id);

	String saveStudent(Student student);  

}  
