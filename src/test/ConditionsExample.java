package test;

import java.util.Scanner;

public class ConditionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the Age ");

		age = scanner.nextInt();

		if (age < 17) {

			System.out.println("You are not eligible for voting");

		} else if (age == 17) {

			System.out.println("You will be eligible for voting next year");
		} else {

			System.out.println("You are eligible for voting");
		}

	}

}