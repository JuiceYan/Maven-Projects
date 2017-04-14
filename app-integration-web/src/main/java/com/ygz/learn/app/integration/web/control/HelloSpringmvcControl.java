package com.ygz.learn.app.integration.web.control;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.learn.ygz.app.integration.service.service.HelloSpringmvcService;
@Controller
@RequestMapping(value = "/")
public class HelloSpringmvcControl {
		@Resource(name = "helloSpringmvcService")
		private HelloSpringmvcService helloSpringmvcService;
		/**
		 * @return the helloSpringmvcService
		 */
		public HelloSpringmvcService getHelloSpringmvcService() {
			return helloSpringmvcService;
		}
		/**
		 * @param helloSpringmvcService the helloSpringmvcService to set
		 */
		public void setHelloSpringmvcService(HelloSpringmvcService helloSpringmvcService) {
			this.helloSpringmvcService = helloSpringmvcService;
		}
		@ResponseBody
		@RequestMapping(value = "hello", method = RequestMethod.GET)
		public String sayHello() {
			System.out.println("helloSpringmvcService:"+helloSpringmvcService);
			helloSpringmvcService.sayHello();
			return "index";
		}
}
