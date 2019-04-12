package com.kurtco.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class JavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(SportConfig.class);
		
		Coach coach = context.getBean("tennisCoach", Coach.class);
		System.out.println("AnnotDemoApp: " + coach.getDailyWorkout());
		System.out.println("AnnotDemoApp: " + coach.getDailyFortune());
		context.close();

	}

}
