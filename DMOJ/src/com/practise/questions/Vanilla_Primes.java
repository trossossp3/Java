package com.practise.questions;

import java.util.Scanner;

public class Vanilla_Primes {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int prime = in.nextInt();
		if (prime < 1 || prime%2 == 0 && prime != 2|| prime == 1) {
			System.out.println("not");

		} else {

			System.out.println("prime");
		}

	}
}
