package com.programming.springannotations;

import java.awt.Container;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationsBeanScopeDemoApp {

	public static void main(String[] args) {
		// load the spring config file
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		// retrieve bean from spring container
		Coach theCoach=context.getBean("tennisCoach",Coach.class);
		
	
		Coach alphaCoach=context.getBean("tennisCoach",Coach.class);
		
		// check if they are the same
		boolean result=(theCoach==alphaCoach);
		
		// print out the results 
		System.out.println("\nPointing to the same object : "+result);
		
		System.out.println("\nMemory Location for theCoach : "+theCoach);
		System.out.println("\nMemory Location for alphaCoach : "+alphaCoach);
		
		// close the context
		context.close();
	}

}
