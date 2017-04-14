package com.ygz.learn.app.integration.web.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.ygz.learn.app.interation.web.service.beans.webuserservicebeans.WebGetUserInfoRequest;
import com.ygz.learn.app.interation.web.service.beans.webuserservicebeans.WebGetUserInfoResponse;
import com.ygz.learn.app.interation.web.service.webuserservice.WebUserService;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class) 
@ContextConfiguration("classpath:config/applicationContext/application-context-junit.xml")
@Transactional  
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)  
public class WebUserServiceImplTest{
	@Autowired
	private WebUserService webUserService;
	@Test
	public void testGetWebUser(){
		WebGetUserInfoRequest webGetUserInfoRequest = new WebGetUserInfoRequest();
		WebGetUserInfoResponse webGetUserInfoResponse = webUserService.webGetUserInfo(webGetUserInfoRequest);
		Assert.assertEquals("SUCCESS", webGetUserInfoResponse.getReturnCode());
	}
}
