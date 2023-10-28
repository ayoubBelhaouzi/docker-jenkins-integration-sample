package com.example.docker;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoDocker2Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DemoDocker2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Test ***");
	}
}
