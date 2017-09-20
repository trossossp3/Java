package com.practise.questions;

import java.util.Scanner;

public class FestiveFardin {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String s1 = scanner.next();
		String s2 = scanner.next();
		if (s1 != "red" || s1 != "green" || s1 != "white" ) {
			System.out.println("Boring...");

		} else {
			System.out.println("Jingle Bells");

		}
	}

}
