package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitDemoProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitDemoProjectApplication.class, args);
		System.out.print("Hello Git World");
	}

}
