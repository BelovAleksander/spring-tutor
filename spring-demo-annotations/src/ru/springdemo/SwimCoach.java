package ru.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope("prototype")
public class SwimCoach implements Coach {
	@Autowired
	@Qualifier("fileFortuneService")
	private FortuneService fortuneService;
	@Value("${foo.email}")
	private String email;
	@Value("${foo.team}")
	private String team;

	@Override
	public String getDailyWorkout() {
		return "Swim hard 1k";
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
