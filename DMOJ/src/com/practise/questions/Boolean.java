package com.practise.questions;

import java.util.Scanner;

public class Boolean {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String lastBool = input.substring(input.length() - 5);
		boolean bool;
		if (lastBool.equals(" True")) {
			bool = true;
			for (int i = 0; i < input.length() - 4; i += 4) {
				bool = !bool;
			}
		} else {
			bool = false;
			for (int i = 0; i < input.length() - 5; i += 4) {
				bool = !bool;
			}

		}
		if (bool) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}

}
