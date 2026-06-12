package com.sagar.SocialMedia;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class SocialMediaApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Post post;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to Social Media Application!");
		System.out.println("Please enter your username");
		String username = scanner.nextLine();
		User user = (User) context.getBean("simpleUser");
		user.setUserName(username);

//		PostList postList = (PostList) context.getBean("simplePostList");
		PostList postList = user.getPostList(); // Dependency Injection

		while (true) {
			System.out.println("1. Create a post\n2. Get All Posts");
			int option = Integer.parseInt(scanner.nextLine());
			switch (option) {
				case 1:
					post  = (Post) context.getBean("simplePost");

					System.out.println("Enter your message:\n");
					String message = scanner.nextLine();
					post.setMessage(message);
					postList.addPost(post);
					break;
				case 2:
					for (int i = 0; i < postList.size(); i++) {
						String pm = user.getUserName()+ "'s "+(i+1)+"th Post - "+postList.getPost(i).getMessage();
						System.out.println(pm);
					}
					break;
				default:
					System.out.println("Exiting...");
					return;
			}
		}
	}

}
