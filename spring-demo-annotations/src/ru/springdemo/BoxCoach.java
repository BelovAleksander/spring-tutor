package ru.springdemo;

import org.springframework.beans.factory.annotation.Value;

public class BoxCoach implements Coach {
	private FortuneService fortuneService;
	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;
	
	public BoxCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	@Override
	public String getDailyWorkout() {
		return "Let's fight";
	}

	@Override
	public String getFortuneService() {
		return this.fortuneService.getFortune();
	}
	public String getEmail() {
		return this.email;
	}
	public String getTeam() {
		return this.team;
	}
}
