package com.kurtco.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class SwimJavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		SwimCoach coach = context.getBean("swimCoach", SwimCoach.class);
		System.out.println("AnnotDemoApp: " + coach.getDailyWorkout());
		System.out.println("AnnotDemoApp: " + coach.getDailyFortune());
		System.out.println("AnnotDemoApp: " + coach.getEmail());
		context.close();

	}

}
