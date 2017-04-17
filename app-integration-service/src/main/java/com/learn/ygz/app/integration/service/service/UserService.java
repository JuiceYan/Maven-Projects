package com.learn.ygz.app.integration.service.service;

import com.learn.ygz.app.integration.service.entity.User;

/**
 * Dao接口 - Dao基接口
 */

public interface UserService{
	 User getUser(String id);
	 String saveUser(User user);
}