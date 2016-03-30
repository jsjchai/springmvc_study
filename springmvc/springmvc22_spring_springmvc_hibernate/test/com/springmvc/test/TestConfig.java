package com.springmvc.test;

import javax.annotation.Resource;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springmvc.service.UserService;

public class TestConfig {

	private ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	
	@Resource
	private SessionFactory sessionFactory;
	
	@Test
	public void testUserService(){
		UserService	userService=(UserService) ac.getBean("userServiceImpl");
		System.out.println(userService);
	}
	
	@Test
	public void testSessionFactory() {
		System.out.println(ac.getBean("sessionFactory"));
	}
	
}
