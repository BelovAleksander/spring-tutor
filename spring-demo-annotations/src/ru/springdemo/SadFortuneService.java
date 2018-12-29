package ru.springdemo;

public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "You gonna be sad";
	}

}
