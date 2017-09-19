package cccpractise;

import java.util.Scanner;

public class ccc20121 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Enter the speed limit:");
		int limit = scanner.nextInt();		
		System.out.println("Enter the recorded speed of the car:");
		int current = scanner.nextInt();
		if ((current - limit) <= 0) {
			System.out.println("Congratulations, you are within the speed limit!");
		}
		if ((current - limit) >= 31) {
			System.out.println("You are speeding and your fine is $500");
		}
		if ((current - limit) >= 21 && (current - limit) <= 30) {
			System.out.println("You are speeding and your fine is $270");

		}
		if ((current - limit) >= 1 && (current - limit) <= 20) {
			System.out.println("You are speeding and your fine is $100");
		}
	}
}
