package com.example.Vaccination;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class VaccinationApplication {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome to the Vaccination Application");
            System.out.println("Please choose your vaccine preference:\n1. Covid\n2. Polio\n3. Typhoid");
            int vaccineChoice = Integer.parseInt(scanner.nextLine());
            String vaccineName = "";
            switch (vaccineChoice) {
                case 1:
                    vaccineName = "Covid";
                    break;
                case 2:
                    vaccineName = "Polio";
                    break;
                case 3:
                    vaccineName = "Typhoid";
                    break;
            }
            System.out.println("Whom do you want to vaccinate\n1. Father\n2. Mother\n3. Self\n4. Spouse\n5. Exit");
            int userChoice = Integer.parseInt(scanner.nextLine());
            User user = null;
            String username="";
            switch (userChoice) {
                case 1:
                    user = (User) context.getBean("father"+vaccineName);
                    username="Father";
                    break;
                case 2:
                    user = (User) context.getBean("mother"+vaccineName);
                    username="Mother";
                    break;
                case 3:
                    user = (User) context.getBean("self"+vaccineName);
                    username="Self";
                    break;
                case 4:
                    user = (User) context.getBean("spouse"+vaccineName);
                    username="Spouse";
                    break;
                case 5:
                    System.out.println("Exiting the application");
                    return;
            }

            if (user.IsVaccinated()) {
                System.out.println("User is already Vaccinated\nDo you want to register for someone Else\n1. Yes\n2. No");
                int choice = Integer.parseInt(scanner.nextLine());
                if (choice==1) {
                    continue;
                }
                else return;
//                Todo: invalid input not handled
            }

            System.out.println("Please enter "+username+" details:");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            System.out.print("Age: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.print("Appointment date (YYYY-MM-DD): ");
            String date = scanner.nextLine();
            System.out.print("Appointment time (HH:MM AM/PM): ");
            String time = scanner.nextLine();
            System.out.print("Appointment location: ");
            String location = scanner.nextLine();

            TimeAndLocation timeAndLocation = new TimeAndLocation();
            timeAndLocation.setDetails(time, location, date);

            user.setUserDetails(name, age, timeAndLocation);
            user.setAppointment();

//            System.out.println("Hello "+name+ " your appointment has been fixed for Covid Vaccine on "+time+ " at "+ location + " on " + date );

            System.out.println("Do you want to register for someone Else\n1. Yes\n2. No");
            int choice = Integer.parseInt(scanner.nextLine());
            if (choice==1) {
                continue;
            }
            else return;

        }

        /*
		You need to complete this application as mentioned in the problem 
		statement build your own logic and perform the following tasks.

		 Tasks:
		1. Fetch context from ApplicationContext.xml and initiate Scanner.
		2. Fetch vaccine and User type choice.
		3. Get the required bean from context.
		4. Get the appointment details form user
		5. Display the appointment details
		6. Run the loop again to book for another user or else exit.
		 */

    }
}