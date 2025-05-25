package com.example.SpringAop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@EnableAspectJAutoProxy
@SpringBootApplication(scanBasePackages = "com.example.SpringAop")
public class SpringAopApplication {

	public static void main(String[] args) {
		System.out.println("Application started successfully!");
		SpringApplication.run(SpringAopApplication.class, args);
		System.out.println("Application closed successfully!");
	}

}
