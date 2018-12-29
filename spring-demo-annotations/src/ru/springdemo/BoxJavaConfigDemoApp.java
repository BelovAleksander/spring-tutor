package ru.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoxJavaConfigDemoApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(
						MyLoggerConfig.class, SportConfig.class);
		BoxCoach theCoach = context.getBean("boxCoach", BoxCoach.class);
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getFortuneService());
		System.out.println(theCoach.getEmail());
		System.out.println(theCoach.getTeam());
		context.close();
	}
	

}
