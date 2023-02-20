package com.programming.javaconfiguration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		// load spring java config file
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(SportConfig.class);
		
		// get the bean from spring container
		SwimCoach theCoach=context.getBean("swimCoach",SwimCoach.class);
		
		//call a method on the bean
		System.out.println(theCoach.getDailyWorkOut());
		
		// call a method to get the dailyfortune
		System.out.println(theCoach.getDailyFortune());
		
		// call our new swim coach methods... has the props values injected
		System.out.println("Email : "+theCoach.getEmail());
		System.out.println("Team  : "+theCoach.getTeam());
		
		// close the context
		context.close();
	}

}
