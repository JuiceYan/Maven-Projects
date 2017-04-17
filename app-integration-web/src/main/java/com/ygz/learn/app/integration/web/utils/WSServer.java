package com.ygz.learn.app.integration.web.utils;

import javax.xml.ws.Endpoint;

import com.ygz.learn.app.integration.web.service.WebUserServiceImpl;

public class WSServer {
	
	public static final String  WSDL_PRE = "http://localhost:8080/ws/";

	public static void main(String[] args) {
              System.out.println("web service start");
              WebUserServiceImpl implementor= new WebUserServiceImpl();
              String address=WSDL_PRE+"WebUserService";
              Endpoint.publish(address, implementor);
              System.out.println("web service started");
   }
}
