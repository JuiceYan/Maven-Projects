package com.ygz.learn.app.integration.web.service;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.learn.ygz.app.interation.web.service.webuserservice.WebGetUserInfoRequest;
import com.learn.ygz.app.interation.web.service.webuserservice.WebGetUserInfoResponse;
import com.learn.ygz.app.interation.web.service.webuserservice.WebUserService;
import com.ygz.learn.app.integration.web.utils.PublishAndCreateCelientUtils;

@RunWith(SpringJUnit4ClassRunner.class) 
//@ContextConfiguration("classpath:config/applicationContext/application-context-junit.xml")
@ContextConfiguration("classpath:config/applicationContext/application-context.xml")

@Transactional  
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)  
public class WebUserServiceImplTest {
	public static final String  WSDL_PRE = "http://localhost:8083/ws/";
	private WebUserService webUserService;

	@Before
	public void SetupContext(){
		PublishAndCreateCelientUtils.publishWS();
		webUserService = PublishAndCreateCelientUtils.createClient();
		System.out.println("service:"+webUserService);
	}
	@Test
	public void testGetWebUser(){
		WebGetUserInfoRequest webGetUserInfoRequest = new WebGetUserInfoRequest();
		WebGetUserInfoResponse webGetUserInfoResponse = webUserService.webGetUserInfo(webGetUserInfoRequest);
		Assert.assertEquals("SUCCESS", webGetUserInfoResponse.getReturnCode());
	}
	
}
