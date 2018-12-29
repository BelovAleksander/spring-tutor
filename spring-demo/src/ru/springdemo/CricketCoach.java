package ru.springdemo;

public class CricketCoach implements Coach {
	private FortuneService fortuneService;
	private String emailAddress;
	private String team;
	
	public CricketCoach() {
		System.out.println("CricketCoach: inside non-arg constructor");
	}
	
	public void setFortuneService(final FortuneService fortuneService) {
		System.out.println("CricketCoach: inside setter method - setFortuneService");
		this.fortuneService = fortuneService;
	}
	public void setEmailAddress(final String emailAddress) {
		System.out.println("CricketCoach: inside setter method - setEmailService");
		this.emailAddress = emailAddress;
	}
	public void setTeam(final String team) {
		System.out.println("CricketCoach: inside setter method - setTeamService");
		this.team = team;
	}
	@Override
	public String getDailyWorkout() {
		return "Practice fast bowling for 15 minutes";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
	public String getEmailAddress() {
		return this.emailAddress;
	}
	public String getTeam() {
		return this.team;
	}
}
