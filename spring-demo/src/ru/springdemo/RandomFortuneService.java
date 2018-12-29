package ru.springdemo;

import java.util.Random;

public class RandomFortuneService implements FortuneService {
	private String[] fortunes = {
			"Beware of the wolf in sheep's clothing",
			"Diligence is the mother of good luck",
			"The journey is the reward"
	};
	private Random myRandom = new Random();
	
	
	@Override
	public String getFortune() {
		return fortunes[myRandom.nextInt(fortunes.length)];
	}
}
