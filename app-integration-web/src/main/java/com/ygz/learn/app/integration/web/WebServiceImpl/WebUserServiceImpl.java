package com.ygz.learn.app.integration.web.WebServiceImpl;

import javax.jws.WebService;

import com.learn.ygz.app.interation.web.service.webuserservice.WebGetUserInfoRequest;
import com.learn.ygz.app.interation.web.service.webuserservice.WebGetUserInfoResponse;
import com.learn.ygz.app.interation.web.service.webuserservice.WebUserService;
@WebService(serviceName="WebUserService", portName="WebUserServiceImplPort", name="WebUserService", targetNamespace="http://www.ygz.learn.com/app/interation/web/service/WebUserService")  
public class WebUserServiceImpl implements WebUserService {

	public WebGetUserInfoResponse webGetUserInfo(WebGetUserInfoRequest webGetUserInfoRequest) {
		WebGetUserInfoResponse webGetUserInfoResponse = new WebGetUserInfoResponse();
		System.out.println(webGetUserInfoRequest.getAge()+" "+webGetUserInfoRequest.getId()+" "+webGetUserInfoRequest.getName()+" "+webGetUserInfoRequest.getBirthday());
		webGetUserInfoResponse.setReturnCode("SUCCESS");
		return webGetUserInfoResponse;
	}

}
