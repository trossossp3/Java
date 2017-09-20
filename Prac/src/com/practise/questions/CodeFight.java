package com.practise.questions;

import java.util.Scanner;

public class CodeFight {
	public static int[] arr;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int n = scanner.nextInt();
		for (int i = 0; i < n; i++) {
			int k = scanner.nextInt();
			if (a - k > 100) {
				System.out.println("go away! 3:<");
			} else {
				System.out.println("fite me! >:3");

			}
		}
	}
}
