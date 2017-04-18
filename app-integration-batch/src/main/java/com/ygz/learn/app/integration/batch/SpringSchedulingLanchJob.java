package com.ygz.learn.app.integration.batch;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersInvalidException;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.repository.JobExecutionAlreadyRunningException;
import org.springframework.batch.core.repository.JobInstanceAlreadyCompleteException;
import org.springframework.batch.core.repository.JobRestartException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class SpringSchedulingLanchJob {
	    /**
	     * @param args
	     */
	private Job job;
	private JobLauncher jobLauncher;
	    public  void lanch () throws Exception{
	    	JobParameters jobParams = createJobParameters();  
	        jobLauncher.run(job, jobParams);  
	        
	        ApplicationContext context = new ClassPathXmlApplicationContext(
	                "batch.xml");
	        JobLauncher launcher = (JobLauncher) context.getBean("jobLauncher");
	        Job job = (Job) context.getBean("helloWorldJob");

	        try {
	            /* 运行Job */
	            JobExecution result = launcher.run(job, new JobParameters());
	            /* 处理结束，控制台打印处理结果 */
	            System.out.println(result.toString());
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    }
		private JobParameters createJobParameters() {
			// TODO Auto-generated method stub
			return null;
		}
	}
