package com.sagar.SocialMedia;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class SocialMediaApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Post post;
		PostList postList = (PostList) context.getBean("simplePostList");
		Scanner scanner = new Scanner(System.in);

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
						String pm = postList.getPost(i).getMessage();
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
