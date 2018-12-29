package ru.springdemo;

public class BaseballCoach implements Coach {
	private FortuneService fortuneService;
	
	public BaseballCoach(final FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Spend 30 minutes on batting practice";
	}
	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
}
