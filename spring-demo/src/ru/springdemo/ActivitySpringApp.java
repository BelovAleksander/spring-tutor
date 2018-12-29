package ru.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ActivitySpringApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("activity-applicationContext.xml");
		SwimCoach theCoach = context.getBean("myCoach", SwimCoach.class);
		System.out.println(theCoach.getDailyWorkout());
		context.close();
	}
}
