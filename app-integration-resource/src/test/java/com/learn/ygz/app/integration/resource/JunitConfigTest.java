package com.learn.ygz.app.integration.resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/applicationContext/application-context-junit.xml"})
public class JunitConfigTest {
	@Test
	public void testJunitConfig() {
		System.out.println("SUCCESS");
	}
}
