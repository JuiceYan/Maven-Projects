package com.learn.ygz.app.integration.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.learn.ygz.app.integration.service.dao.StudentDao;
import com.learn.ygz.app.integration.service.entity.Student;
@Transactional
@Service
public class StudentServiceImpl implements StudentService{
	@Autowired
	private StudentDao studentDao;
	public StudentServiceImpl(){
		System.out.println("StudentServiceImpl>>>>>>>>>>>>>>>>init");
	}
	public Student getStudent(String id) {
		// TODO Auto-generated method stub
		return studentDao.getStudent(id);
	}
	public String saveStudent(Student student) {
		// TODO Auto-generated method stub
		return studentDao.saveStudent(student);
	}
}
