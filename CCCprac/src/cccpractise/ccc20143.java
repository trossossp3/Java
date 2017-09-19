package cccpractise;

import java.util.Scanner;

public class ccc20143 {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int n = scanner.nextInt();
		int player1 = 100;
		int player2 = 100;

		for (int i = 0; i < n; i++) {

			int diceroll1 = scanner.nextInt();
			int diceroll2 = scanner.nextInt();

			if (diceroll1 > diceroll2) {
				player2 = player2 - diceroll1;
			} else if (diceroll2 > diceroll1) {
				player1 = player1 - diceroll2;
			}
		}

		System.out.println(player1);
		System.out.println(player2);

	}
}
