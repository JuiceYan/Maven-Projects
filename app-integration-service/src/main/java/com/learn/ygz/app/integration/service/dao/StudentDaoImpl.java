package com.learn.ygz.app.integration.service.dao;

import org.springframework.stereotype.Repository;

import com.learn.ygz.app.integration.service.entity.Student;
import com.learn.ygz.app.integration.service.utils.BaseDaoUtilsImpl;

@Repository
public class StudentDaoImpl extends BaseDaoUtilsImpl<Student, String> implements StudentDao{
	public StudentDaoImpl(){
		System.out.println("UserDaoImpl>>>>>>>>>>init");
	}

	public Student getStudent(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	public String saveStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}
}
