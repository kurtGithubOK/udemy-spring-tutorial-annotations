package com.kurtco.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
//	@Autowired
//	public TennisCoach(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}

	public TennisCoach() {
		System.out.println("now inside default constructor.");
	}
	
//	@Autowired
//	public void setFortuneService(FortuneService theFortuneService) {
//		fortuneService = theFortuneService;
//	}
	
//	@Autowired
//	public void randomMethodNameForAutowiring(FortuneService theFortuneService) {
//		System.out.println("Now in randomMethodNameForAutowiring()");
//		fortuneService = theFortuneService;
//	}
	
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand volley.";
	}
	
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
