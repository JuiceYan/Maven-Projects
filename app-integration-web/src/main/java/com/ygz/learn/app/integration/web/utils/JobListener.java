package com.ygz.learn.app.integration.web.utils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

import org.quartz.SchedulerException;
import org.quartz.impl.StdScheduler;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

/**
 * Unit test for simple App.
 */
public class JobListener implements ServletContextListener {
	private WebApplicationContext webApplicationContext = null;
	private StdScheduler stdScheduler = null;
	private boolean isServletContextInit;
	public JobListener(){
		System.out.println("JobListener init------------------->>>>>>");
	}
	public void contextInitialized(ServletContextEvent sce) {
		isServletContextInit =true;
	    //checkQuartzStatus(sce,isServletContextInit);

		// public ws
//		PublishAndCreateCelientUtils.publishWS();
	}

	private void checkQuartzStatus(ServletContextEvent sce,boolean isServletContextInit) {
			webApplicationContext = WebApplicationContextUtils.getWebApplicationContext(sce.getServletContext());
	        stdScheduler = (StdScheduler) webApplicationContext.getBean("springJobSchedulerFactoryBean");
			System.out.println("stdScheduler.isStarted():"+stdScheduler.isStarted());
			try {
			if(isServletContextInit && !stdScheduler.isStarted()){
					stdScheduler.start();
				System.out.println("stdScheduler stop-------------");
	         }else if(!isServletContextInit && stdScheduler.isStarted()){
	        	 stdScheduler.shutdown();
	         }	
			} catch (SchedulerException e) {
				System.err.println("stdScheduler error!");
				e.printStackTrace();
			}
	}
	public void contextDestroyed(ServletContextEvent sce) {
		isServletContextInit = false;
	    //checkQuartzStatus(sce,isServletContextInit);
	}

	 
}
