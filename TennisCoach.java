package com.programming.springannotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
//@Scope("prototype")// by default bean scope is "singleton"
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("rams")
	private FortuneService fortuneService;
	

	//define a default constructor
	public TennisCoach() {
		System.out.println("Inside a default constructor");
	}
	
	/*
	// injecting using a constructor
	@Autowired
	public TennisCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	*/
	
	/*
	// injecting using a setter method
	@Autowired
	public void setfortuneService(FortuneService fortuneService) {
		System.out.println("Inside setter method ");
		this.fortuneService = fortuneService;
	}
	*/
	
	/*
	// injecting using a method
	@Autowired
	public void mymethod(FortuneService fortuneService) {
		System.out.println("inside a normal method");
		this.fortuneService=fortuneService;
	}
	*/
	
	@Override
	public String getDailyWorkOut() {
		return "play tennis daily 5 hours good job";
	}

	@Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
	
	// define my init method
//	@PostConstruct
//	public void myInitMethod() {
//		System.out.println("TennisCoach: inside init method");
//	}
//	
//	//define my destroy method
//	@PreDestroy
//	public void myDestroyMethod() {
//		System.out.println("TennisCoach: inside destroy method");
//	}
}
