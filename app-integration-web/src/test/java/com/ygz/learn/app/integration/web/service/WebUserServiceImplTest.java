package com.ygz.learn.app.integration.web.service;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.fasterxml.jackson.databind.Module.SetupContext;
import com.ygz.learn.app.integration.web.utils.PublishAndCreateCelient;
import com.ygz.learn.app.interation.web.service.beans.webuserservicebeans.WebGetUserInfoRequest;
import com.ygz.learn.app.interation.web.service.beans.webuserservicebeans.WebGetUserInfoResponse;
import com.ygz.learn.app.interation.web.service.webuserservice.WebUserService;

import junit.framework.Assert;

@RunWith(SpringJUnit4ClassRunner.class) 
//@ContextConfiguration("classpath:config/applicationContext/application-context-junit.xml")
@ContextConfiguration("classpath:config/application-context.xml")

@Transactional  
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)  
public class WebUserServiceImplTest {

	private WebUserServiceImpl webUserService;

	@Before
	public void SetupContext(){
		webUserService = new PublishAndCreateCelient().publishAndGetClient(new WebUserServiceImpl());
		System.out.println("service:"+webUserService);
	}
	@Test
	public void testGetWebUser(){
		WebGetUserInfoRequest webGetUserInfoRequest = new WebGetUserInfoRequest();
		WebGetUserInfoResponse webGetUserInfoResponse = webUserService.webGetUserInfo(webGetUserInfoRequest);
		Assert.assertEquals("SUCCESS", webGetUserInfoResponse.getReturnCode());
	}
}
