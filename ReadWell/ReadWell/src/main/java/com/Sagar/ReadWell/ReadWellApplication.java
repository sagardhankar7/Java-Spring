package com.Sagar.ReadWell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class ReadWellApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(ReadWellApplication.class, args);
		Scanner scanner = new Scanner(System.in);
		Admin admin = (Admin) context.getBean(MyAdmin.class);
		Student student = (Student) context.getBean(SimpleStudent.class);

		while (true) {
			System.out.println("Please choose your user type : \n1.Admin\n2.Student\n3.Exit ");
			int option = scanner.nextInt();
			if (option==3) return;
			else if (option==1) { // Admin Section
				while (true) {
					System.out.println("Do you want to add books\n1.Yes\n2.No");
					int option2 = scanner.nextInt();
					if (option2==2) {
						for (Book book : admin.getAllBooks()) {
							System.out.println(book.getName());
						}
						break;
					}
					Book book = context.getBean(SimpleBook.class);
					System.out.println(book.toString());
					System.out.println("Enter the name of book");
					scanner.nextLine();
					String bookname = scanner.nextLine();
					book.setName(bookname);
					System.out.println(book.toString());

					admin.addBook(book);

				}

			}
			else if (option==2) { // Studen Section
				System.out.println("Enter your name=id");
				scanner.nextLine();
				String studentid = scanner.nextLine();
				while (true) {
					System.out.println("List of all available books");
					for (Book book : admin.getAllBooks()) {
						if (book.isIssued()) continue;
						System.out.println(book.getName());
					}

					System.out.println("Do you want to issue a book\n1.Yes\n2.No");
					int option2 = scanner.nextInt();
					if (option2==2) {
						break;
					}
					System.out.println("Enter the book number which you want to issue: ");
					int id = scanner.nextInt();
					for (Book book: admin.getAllBooks()) {

						if (id==book.getId()) {
							if (book.isIssued()) {
								System.out.println("Book not available");
								break;
							}
							book.setIssue(studentid);
						}
					}
				}

//				student.issueBook();


			}
		}


	}

}
