package com.ygz.learn.app.integration.web.utils;

import javax.xml.ws.Endpoint;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.learn.ygz.app.interation.web.service.webuserservice.WebGetUserInfoRequest;
import com.learn.ygz.app.interation.web.service.webuserservice.WebGetUserInfoResponse;
import com.learn.ygz.app.interation.web.service.webuserservice.WebUserService;
import com.ygz.learn.app.integration.web.WebServiceImpl.WebUserServiceImpl;

public class PublishAndCreateCelientUtils {
	
	public static final String  WSDL_PRE = "http://localhost:8083/ws/";

	public static   void   publishWS(){
        System.out.println("web service start");
        WebUserServiceImpl implementor= new WebUserServiceImpl();
        String address=WSDL_PRE+"WebUserService";
        Endpoint.publish(address, implementor);
        System.out.println("web service started");
}
	
	public static WebUserService createClient(){
        JaxWsProxyFactoryBean svr = new JaxWsProxyFactoryBean();
        svr.setServiceClass(WebUserService.class);
        String address=WSDL_PRE+"WebUserService";
        svr.setAddress(address);
        WebUserService hw = (WebUserService) svr.create();
        WebGetUserInfoRequest webGetUserInfoRequest = new WebGetUserInfoRequest();
        webGetUserInfoRequest.setAge(1);
        webGetUserInfoRequest.setId("111");
//        webGetUserInfoRequest.setBirthday(new Date());
        WebGetUserInfoResponse webGetUserInfoResponse = hw.webGetUserInfo(webGetUserInfoRequest);
        System.out.println(webGetUserInfoResponse.getReturnCode());
		return hw;
	 }
	
	public static void destoryWS(){
	}
	public static void main(String[] args) {
		publishWS();
	}
}
