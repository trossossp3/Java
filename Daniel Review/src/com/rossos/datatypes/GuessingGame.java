package com.rossos.datatypes;

import java.util.Scanner;

public class GuessingGame {
	static final String WORD = "cat";

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s1 = scan.next();
		System.out.println(guess("cat"));
		
		
	
		
		

	}
	
	public static String guess(String x){
	WORD.indexOf(x);
		return x;
	}

}
