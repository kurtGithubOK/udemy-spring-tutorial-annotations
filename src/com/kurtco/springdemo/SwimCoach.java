package com.kurtco.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class SwimCoach implements Coach {
	
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;

	public SwimCoach(FortuneService myFortuneService) {
		fortuneService = myFortuneService;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String getDailyWorkout() {
		return "Swim 1000 meters.";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
