package com.programming.springannotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		// load spring java config file
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkOut());
		
		// call a method to get the dailyfortune
		System.out.println(theCoach.getDailyFortune());
		
		// close the context
		context.close();
	}

}
