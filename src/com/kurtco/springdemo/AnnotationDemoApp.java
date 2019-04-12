package com.kurtco.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Coach coach = context.getBean("tennisCoach", Coach.class);
		System.out.println("AnnotDemoApp: " + coach.getDailyWorkout());
		System.out.println("AnnotDemoApp: " + coach.getDailyFortune());
		context.close();

	}

}
