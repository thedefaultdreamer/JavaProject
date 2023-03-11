package test;

import java.util.Scanner;

public class DynamicPrimeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int age;
		
		boolean flag = true;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age");
		
		age = sc.nextInt();
		
		for (int i = 2; i < age/2; i++) {
			
			int rem = age%i;
			
			if (rem == 0) {
				flag = false;
				break;
			}
			
		}
		
		if (flag == true) {
			System.out.println("age is prime num");
		} else {
			System.out.println("age is not a prime num");
		}
	}

}
