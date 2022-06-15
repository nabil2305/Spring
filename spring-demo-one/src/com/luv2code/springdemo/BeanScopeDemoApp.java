package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanScopeDemoApp {

	public static void main(String[] args) 
	{

		
		ClassPathXmlApplicationContext context = 
		new ClassPathXmlApplicationContext("beanScopeapplicationContext.xml");
		
		//Retrieve bean from spring container
		
		Coach theCoach = context.getBean("myCoach",Coach.class);
		Coach alphaCoach = context.getBean("myCoach",Coach.class);
		
		System.out.println(theCoach==alphaCoach);
		//

		context.close();
	}

}
