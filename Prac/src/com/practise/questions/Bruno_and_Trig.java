package com.practise.questions;

import java.util.Scanner; // make more efficient 

public class Bruno_and_Trig {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		if(a + b > c && b + c > a && a + c > b) {
			System.out.println("Huh? A triangle?");
		}else { System.out.println("Maybe I should go out to sea...");
		
		}
	}

}
