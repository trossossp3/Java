package com.practise.questions;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;
import java.util.List;

public class NewMinimum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinkedList<Integer> ints = new LinkedList<Integer>();
		int n1 = sc.nextInt();
		for (int i = 0; i < n1; i++) {
			ints.add(sc.nextInt());
			
		} for (int i = 0; i < n1; i++) {
			int n2 = (Collections.min(ints));
			i
			System.out.println(Collections.min(ints));
	
			
		}
		

	}

}
