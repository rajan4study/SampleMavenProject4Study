package com.study.maven;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Maven4studyApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Maven4studyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		System.out.print("Build is sucess");
		
	}

}
