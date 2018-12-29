package ru.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("thatSillyCoach")
public class TennisCoach implements Coach {
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	public TennisCoach() {
		System.out.println("TennisCoach: inside default constructor");
	}
	@PostConstruct
	private void doMyStartupStuff() {
		System.out.println("TennisCoach: inside my doMyStartStuff method");
	}
	@PreDestroy 
	private void doMyCleanupStuff() {
		System.out.println("TennisCoach: inside my doMyCleanupStuff method");
	}
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand valley";
	}
	@Override
	public String getFortuneService() {
		return fortuneService.getFortune();
	}
}
