package com.programming.springannotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("rams")
public class RandomFortuneService implements FortuneService {
	
	// create an array of strings
	private String[] data= {
			"partly cloudy",
			"system library",
			"referenced libraries"
	};
	// create a random number generator
	private Random myRandom=new Random();
	
	@Override
	public String getFortune() {
		// pick a random string from the array
		int index=myRandom.nextInt(data.length);
		String theFortune=data[index];
		return theFortune;
	}

}
