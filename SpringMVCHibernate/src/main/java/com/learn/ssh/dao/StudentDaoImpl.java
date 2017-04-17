package com.learn.ssh.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learn.ssh.entity.Student;
import com.learn.ssh.utils.BaseDaoUtils;

@Repository
public class StudentDaoImpl implements StudentDao{
	@Autowired
	private BaseDaoUtils<Student, String> baseDaoUtils;
	
	public StudentDaoImpl(){
		System.out.println("UserDaoImpl>>>>>>>>>>init");
	}
	
	public Student getStudent(String id) {
		// TODO Auto-generated method stub
		return baseDaoUtils.get(id);
	}

	public String saveStudent(Student student) {
		// TODO Auto-generated method stub
		return baseDaoUtils.save(student);
	}

}
