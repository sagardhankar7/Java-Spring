package com.sagar.mvc_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MvcDemoApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(MvcDemoApplication.class, args);

		System.out.println("Hello From Spring  .... ");



	}

}
