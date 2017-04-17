package com.learn.ssh.service;

import com.learn.ssh.entity.Student;

/**
 * Dao接口 - Dao基接口
 */

public interface StudentService{
	Student getStudent(String id);
	String saveStudent(Student student);
}