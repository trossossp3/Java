package cccpractise;

import java.util.Scanner;

public class ccc20151 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int month = scanner.nextInt();
		int day = scanner.nextInt();
		if (month > 2){
			System.out.println("After");			
		}
		if (month < 2){
			System.out.println("Before");
		}
		if (month == 2 && day > 18){
			System.out.println("After");
		}
		if (month == 2 && day < 18){
			System.out.println("Before");
		}
		if (month == 2 && day == 18){
			System.out.println("Special");
		}
	
	}

}
