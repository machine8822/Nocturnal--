package com.model;

import java.util.Scanner;

public class DriverUI {
	private SystemFacade driver;

	DriverUI() {
		driver = SystemFacade.getInstance();
	}

	public void run() {
		scenario1();
		scenario2();
	}

	public void scenario1() {
		System.out.println("Scenario 1: Login");

		User loggedInUser = driver.login("grant.smith@example.com", "123grant");
		if (loggedInUser == null) {
			System.out.println("Sorry we couldn't login.");
			return;
		}
		System.out.println("Grant Smith is now logged in");

	}

	public void scenario2() {
		System.out.println("Scenario 2: User Creation");

		User newUser = new User("john.doe@example.com", "password123", "John", "Doe");
		if (driver.addUser(newUser)) {
			System.out.println("User John Doe has been successfully created");
			//driver.deleteUser(newUser.getUserId());
		} else {
			System.out.println("Sorry, we couldn't create the user.");
		}
	}


	public static void main(String[] args) {
		DriverUI appInterface = new DriverUI();
		appInterface.run();

	}
}