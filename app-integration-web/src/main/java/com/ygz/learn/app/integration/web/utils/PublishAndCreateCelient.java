package com.ygz.learn.app.integration.web.utils;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

public class PublishAndCreateCelient {
	
	public final String  WSDL_PRE = "http://localhost:8080/ws/";
	public  <T> T publishAndGetClient(T wsObject){
		Class superClass = wsObject.getClass().getSuperclass();
		String address = WSDL_PRE+superClass.getSimpleName();
		JaxWsServerFactoryBean factoryBean = new JaxWsServerFactoryBean();
		factoryBean.setServiceClass(superClass);
		factoryBean.setAddress(address);
		factoryBean.setServiceBean(wsObject);
		factoryBean.create();
		System.out.println("publish :"+address);
		T Client = (T) createClient(superClass,address);
		return Client;
	}
	
	public <T> T createClient(T wsObject,String address){
		 JaxWsProxyFactoryBean jwpfb = new JaxWsProxyFactoryBean();
	        jwpfb.setServiceClass(wsObject.getClass());
	        jwpfb.setAddress(address);
	        T hs =  (T) jwpfb.create();
	        System.out.println("get Client:"+hs.getClass().getSimpleName());
		return  hs;
	}
}
