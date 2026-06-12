package com.codingNinjas.Bank.Account.Registration;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class BankAccountRegistrationApplication {

	public static void main(String[] args) {

		System.out.println( "Welcome to the Account Registration Application!");
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your name?");
		String name = scanner.nextLine();
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		User user = (User) context.getBean("myUser");
		user.setUserDetails(name);

		while (true) {
			System.out.println("Do you want to add account\n1. Yes\n2. No");
			int option = Integer.parseInt(scanner.nextLine());
			switch (option) {
				case 1:
					System.out.println("Please select the account type\n1. Current\n2. Savings");
					int accountType = Integer.parseInt(scanner.nextLine());
					System.out.println("Enter the opening balance");
					int openingBalance = Integer.parseInt(scanner.nextLine());
					Account account=null;
					switch (accountType) {
						case 1:
							account = (Account) context.getBean("currentAccount");
//							account = user.
							break;
						case 2:
							account = (Account) context.getBean("savingsAccount");
							break;
						default:
							System.out.println("Invalid account type");
							break;
					}
					account.addBalance(openingBalance);
					user.addAccount(account);
					break;
				case 2:
					System.out.println("Hi "+user.getName()+ ", here is the list of your accounts:");

					for(Account account1 : user.getAllAccounts()) {
						System.out.println(account1.getAccountType() + " account : opening balance - "+ account1.getBalance()+ " Reference Id @"+ account1.toString().split("@")[1]);
					}
					break;
				default:
					System.out.println("Invalid option");
					break;
			}

			if (option > 1) break;
		}

		context.close();

//		System.out.println("User account list:");

		/*
		You need to complete this application as mentioned in the problem 
		statement build your own logic and perform the following tasks.
		
		* 1. Fetch context from ApplicationContext.xml and initiate scanner.
		* 2. Get user details from console.
		* 3. Get account details from user and add them to the account list.
		* 4. Display the list of accounts with their reference ids.
		*/

	}

}
