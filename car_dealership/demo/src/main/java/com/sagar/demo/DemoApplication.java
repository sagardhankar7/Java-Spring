package com.sagar.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class DemoApplication {

	public static void main(String[] args) {
//		1
//		ShortTable shortTable = new ShortTable();
//		String print = shortTable.showDetails();
//		System.out.println(print);

//		2
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		Car normalCar = (Car) context.getBean("normalCar");
		Car sportsCar = (Car) context.getBean("sportsCar");
		Car truckCar = (Car) context.getBean("truckCar");

		Scanner scanner = new Scanner(System.in);
		System.out.println("What is your nane");
		String name = scanner.nextLine();
		System.out.println("Choose");
		System.out.println("1. Normal Car");
		System.out.println("2. Sports Car");
		System.out.println("3. Truck");
		int option = Integer.parseInt(scanner.nextLine());

		String toPrint="";
		switch (option) {
			case 1:
				normalCar.setOwnerName(name);
				toPrint = normalCar.getInfo();
				break;
			case 2:
				sportsCar.setOwnerName(name);
				toPrint = sportsCar.getInfo();
				break;
			case 3:
				truckCar.setOwnerName(name);
				toPrint = truckCar.getInfo();
				break;

		}

		System.out.println(toPrint);

	}

}
