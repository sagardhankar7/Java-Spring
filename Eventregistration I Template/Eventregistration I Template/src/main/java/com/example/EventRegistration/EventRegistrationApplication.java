package com.example.EventRegistration;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;


@SpringBootApplication
public class EventRegistrationApplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		System.out.println("Welcome to the Graduation Ceremony Registration Application");
		// Take the college event bean from the application context.
		CollegeEvent collegeEvent = (CollegeEvent) context.getBean("event");
		// Print the event details.
		collegeEvent.printEventDetails();

		while (true) {
			System.out.println("Do you want to register for the ceremony\n1. Yes\n2. No");
			int input = Integer.parseInt(scanner.nextLine());
			if (input == 1) {
				System.out.println("Please enter your name");
				String name = scanner.nextLine();
				System.out.println(name);
				System.out.println("Please enter your department");
				String department = scanner.nextLine();
				System.out.println("In which year did you pass out?");
				int batch = Integer.parseInt(scanner.nextLine());
				Attendee student = (Attendee) context.getBean("student");
				student.setAttendeeDetails(name, department, batch);
				collegeEvent.registerStudent(student);
				student.printRegistrationConfirmation();
				/*
				 1. Take attendee details from the console.
				 2. Get studentAttendee bean from context and set the attendee details
				 3. Register the attendee for the event.
				 4. Print the registration confirmation.
				 */

			} else if(input == 2) {
				break;
			} else {
				System.out.println("Invalid Choice");
				return;
			}
		}

		// Get the number of attendees and print along with the statement below
		System.out.println("No. of attendees registered are: " + collegeEvent.getAttendeeCount());
		System.out.println("The list of attendees are:");
		for (int i = 0; i < collegeEvent.getAttendeeCount(); i++) {
			Attendee attendee = collegeEvent.getAllAttendees().get(i);

			System.out.println(attendee.getAttendeeName()+"\tReference id: @"+ attendee.toString().split("@")[1]);
//			+"\tReference id: @"+ this.toString().split("@")[1]
		}
		// Print all the attendee names with their reference ids as given in the sample output..

	}

}
