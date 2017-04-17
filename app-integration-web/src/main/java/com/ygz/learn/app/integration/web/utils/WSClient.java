package com.ygz.learn.app.integration.web.utils;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.learn.ygz.app.interation.web.service.webuserservice.WebGetUserInfoRequest;
import com.learn.ygz.app.interation.web.service.webuserservice.WebGetUserInfoResponse;
import com.learn.ygz.app.interation.web.service.webuserservice.WebUserService;

public class WSClient {
	
	public static final String  WSDL_PRE = "http://localhost:8080/ws/";

	 public static void main(String[] args) {
         JaxWsProxyFactoryBean svr = new JaxWsProxyFactoryBean();
         svr.setServiceClass(WebUserService.class);
         String address=WSDL_PRE+"WebUserService";
         svr.setAddress(address);
         WebUserService hw = (WebUserService) svr.create();
         WebGetUserInfoRequest webGetUserInfoRequest = new WebGetUserInfoRequest();
         webGetUserInfoRequest.setAge(1);
         webGetUserInfoRequest.setId("111");
//         webGetUserInfoRequest.setBirthday(new Date());
         WebGetUserInfoResponse webGetUserInfoResponse = hw.webGetUserInfo(webGetUserInfoRequest);
         System.out.println(webGetUserInfoResponse.getReturnCode());
	 }
}
