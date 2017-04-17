package com.ygz.learn.app.integration.web.utils;

import javax.xml.ws.Endpoint;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.learn.ygz.app.interation.web.service.webuserservice.WebUserService;
import com.ygz.learn.app.integration.web.service.WebUserServiceImpl;

public class PublishAndCreateCelient {
	
	public static final String  WSDL_PRE = "http://localhost:8080/ws/";

	public static  <T> String   publishWS(T wsObject){
		Class<?>[] superClass = wsObject.getClass().getInterfaces();
		//Class superClass = wsObject.getClass().getSuperclass();
		String address = WSDL_PRE+superClass[0].getSimpleName();
		Endpoint.publish(address, wsObject);
		System.out.println("publish :"+address);
		
//		JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
//		factoryBean.setServiceClass(superClass);
//		factoryBean.setAddress(address);
//		factoryBean.setServiceBean(wsObject);
//		factoryBean.create();
		return address;
	}
	
	public static <T> T createClient(T wsObject,String address){
		 JaxWsProxyFactoryBean jwpfb = new JaxWsProxyFactoryBean();
	        jwpfb.setServiceClass(wsObject.getClass());
	        
	        jwpfb.setAddress(address);
	        T hs =  (T) jwpfb.create();
	        System.out.println("get Client:"+hs.getClass().getSimpleName());
		return  hs;
	}
	
	public static <T,I> I publishAndCreateCelient(T wsObject,I wsInterface){
		String address = publishWS(wsObject);
		
		return createClient(wsInterface,address);
	}
	
	public static void main(String[] args) {
		publishAndCreateCelient(new WebUserServiceImpl(),WebUserService.class);
	}
}
