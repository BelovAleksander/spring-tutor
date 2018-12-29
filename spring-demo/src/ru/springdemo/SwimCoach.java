package ru.springdemo;

public class SwimCoach implements Coach {
	private FortuneService fortuneService;
	
	public SwimCoach(final FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Swim a hard 1k";
	}
	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
	//init method
	public void doMyStartupStuff() {
		System.out.println("TrackCoach: inside method doMyStartupStuff");
	}
	//destroy method
	public void doMyCleanupStuffYoYo() {
		System.out.println("TrackCoach: inside method doMyCleanupStuffYoYo");
	}
}
