package com.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BootTemplate1Application {

	public static void main(String[] args) {
		SpringApplication.run(BootTemplate1Application.class, args);
		System.out.println("실행");
	}

}
