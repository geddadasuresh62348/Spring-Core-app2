package com.programming.javaconfiguration;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	// literal values
	@Value("${foo.email}")
	private String email;
	
	@Value("${foo.team}")
	private String team;
	
	public SwimCoach(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	@Override
	public String getDailyWorkOut() {
		return "swim 1000 meters as warm up";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}
	public String getEmail() {
		return email;
	}
	public String getTeam() {
		return team;
	}
	
	

}
