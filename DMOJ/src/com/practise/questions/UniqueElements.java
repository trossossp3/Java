package com.practise.questions;

import java.util.Scanner;
import java.util.HashSet;

public class UniqueElements {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		HashSet<Integer> ints = new HashSet<Integer>();
		int n1 = sc.nextInt();
		for (int i = 0; i < n1; i++) {
			ints.add(sc.nextInt());
			} System.out.println(ints.size());
		
			
		}

	}


