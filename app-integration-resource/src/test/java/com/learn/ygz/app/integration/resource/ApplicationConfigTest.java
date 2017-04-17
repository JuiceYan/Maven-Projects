package com.learn.ygz.app.integration.resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/applicationContext/application-context.xml"})
public class ApplicationConfigTest {
	@Test
	public void testConfig() {
		System.out.println("SUCCESS");
		
	}
}
