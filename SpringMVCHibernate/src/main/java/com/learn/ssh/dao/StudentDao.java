package com.learn.ssh.dao;

import com.learn.ssh.entity.Student;

public interface StudentDao{

	Student getStudent(String id);

	String saveStudent(Student student);  

}  
