package ru.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		Coach first = context.getBean("thatSillyCoach", Coach.class);
		Coach second = context.getBean("thatSillyCoach", Coach.class);
		System.out.println("Enstances are equals: " + (first == second));
		System.out.println("Memory location for the first: " + first);
		System.out.println("Memory location for the second: " + second);
		context.close();
	}
}
