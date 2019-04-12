package com.kurtco.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	private String[] data = {
		"aaaaaa",
		"bbbbbb",
		"cccccc"
	};
	
	private Random random = new Random();
	
	@Override
	public String getFortune() {
		int index = random.nextInt(data.length);
		String fortune = data[index];
		return fortune;
	}

}
