package ru.springdemo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class FileFortuneService implements FortuneService {
	private ArrayList<String> fortunes;
	@Value("${foo.path}")
	private String configPath;
	private Random myRandom = new Random();
	
	public FileFortuneService() {
		fortunes = new ArrayList<>();
	}
	@PostConstruct
	private void initFortunes() {
		File file = new File(configPath);
		System.out.println("Path to file: " + configPath);
		System.out.println("File is exists: " + file.exists());
		try (BufferedReader reader = new BufferedReader(
				new FileReader(file));) {		
			String str;
			while((str = reader.readLine()) != null) {
				this.fortunes.add(str);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String getFortune() {
		return fortunes.get(myRandom.nextInt(fortunes.size()));
	}
}
