package com.ygz.learn.app.integration.web.service;

import com.ygz.learn.app.interation.web.service.beans.webuserservicebeans.WebGetUserInfoRequest;
import com.ygz.learn.app.interation.web.service.beans.webuserservicebeans.WebGetUserInfoResponse;
import com.ygz.learn.app.interation.web.service.webuserservice.WebUserService;
import javax.jws.WebService;
@WebService(serviceName="WebUserService", portName="WebUserServiceSOAP", name="WebUserService", targetNamespace="http://www.learn.ygz.com/app/interation/web/service/WebUserService")  
public class WebUserServiceImpl implements WebUserService {

	public WebGetUserInfoResponse webGetUserInfo(WebGetUserInfoRequest webGetUserInfoRequest) {
		WebGetUserInfoResponse webGetUserInfoResponse = new WebGetUserInfoResponse();
		webGetUserInfoResponse.setReturnCode("SUCCESS");
		return webGetUserInfoResponse;
	}

}
