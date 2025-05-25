package com.example.SpringAop;

import org.springframework.boot.SpringApplication;

public class TestSpringAopApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringAopApplication::main).with(TestcontainersConfiguration.class).run(args);
	}

}
