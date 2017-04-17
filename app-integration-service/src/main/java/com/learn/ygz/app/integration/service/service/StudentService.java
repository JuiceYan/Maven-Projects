package com.learn.ygz.app.integration.service.service;

import com.learn.ygz.app.integration.service.entity.Student;

/**
 * Dao接口 - Dao基接口
 */

public interface StudentService{
	Student getStudent(String id);
	String saveStudent(Student student);
}