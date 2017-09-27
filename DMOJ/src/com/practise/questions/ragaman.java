package com.practise.questions;

import java.util.Scanner;

public class ragaman {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		String first = in.next();
		String second = in.next();
		boolean anagram = false, wild = false;
				
		
		for (int i = 0; i < second.length(); i ++) {
			char temp = second.charAt(i);
			if (temp < 123 && temp > 97) {
				if (first.indexOf(temp) == -1) {
					//it is a char but not an asterick THEREFORE it is note part of the word and we can exit
					anagram = false;
					break;
				}
				anagram = true;
			}
			else if (temp == 42) {
				wild = true;
			}
		}
		
		if (wild && anagram) {
			System.out.println("A");
		} 
		else {
			System.out.println("N");
		}
		
		
	}}