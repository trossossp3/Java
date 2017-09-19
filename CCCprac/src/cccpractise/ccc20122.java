package cccpractise;

import java.util.Scanner;

public class ccc20122 {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		int n1 = scanner.nextInt();
		int n2 = scanner.nextInt();
		int n3 = scanner.nextInt();
		int n4 = scanner.nextInt();
		if (n1 > n2 && n2 > n3 && n3 > n4) {
			System.out.println("Fish Diving");
		}
		else if (n4 > n3 && n3 > n2 && n2 > n1) {
			System.out.println("Fish Rising");
		}
		else if (n4 == n3 && n3 == n2 && n2 == n1) {
			System.out.println("Fish at constant depth");
		} else {
			System.out.println("No fish");
		}
	}

}
