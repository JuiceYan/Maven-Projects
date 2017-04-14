package com.learn.ygz.app.integration.service.service;

import com.learn.ygz.app.integration.common.dao.HelloSpringmvcDao;

public class HelloSpringmvcServiceImpl implements HelloSpringmvcService{
//	@Resource(name = "helloSpringmvcDao")
	private HelloSpringmvcDao helloSpringmvcDao ;

	/**
	 * @return the helloSpringmvcDao
	 */
	public HelloSpringmvcDao getHelloSpringmvcDao() {
		return helloSpringmvcDao;
	}

	/**
	 * @param helloSpringmvcDao the helloSpringmvcDao to set
	 */
	public void setHelloSpringmvcDao(HelloSpringmvcDao helloSpringmvcDao) {
		this.helloSpringmvcDao = helloSpringmvcDao;
	}

	public void sayHello() {
		helloSpringmvcDao.sayHello();
	}
	
}
