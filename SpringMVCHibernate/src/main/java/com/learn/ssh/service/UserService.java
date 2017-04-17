package com.learn.ssh.service;

import com.learn.ssh.entity.User;

/**
 * Dao接口 - Dao基接口
 */

public interface UserService{
	 User getUser(String id);
	 String saveUser(User user);
}