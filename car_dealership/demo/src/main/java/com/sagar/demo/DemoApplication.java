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

//		Car normalCar = (Car) context.getBean("normalCar");
		Car car = null;

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
				System.out.println("1. Normal Tyre");
				System.out.println("2. Sports Tyre");
				int newOption = Integer.parseInt(scanner.nextLine());
				switch (newOption) {
					case 1:
						car = (Car) context.getBean("normalCar");
						break;
					case 2:
						car = (Car) context.getBean("normalCarSportsTyre");
						break;
				}
				break;
			case 2:
				System.out.println("1. Sports Tyre");
				System.out.println("2. Heavy Tyre");
				int newOption2 = Integer.parseInt(scanner.nextLine());
				switch (newOption2) {
					case 1:
						car = (Car) context.getBean("sportsCar");
						break;
					case 2:
						car = (Car) context.getBean("sportsCarHeavyTyre");
						break;
				}
				break;
			case 3:
				car = (Car) context.getBean("truck");
				break;
		}
		car.setOwnerName(name);
		toPrint = car.getInfo();

		System.out.println(toPrint);

	}

}
