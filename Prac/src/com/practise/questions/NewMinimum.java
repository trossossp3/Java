package com.practise.questions;

import java.util.LinkedList;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class NewMinimum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> ints = new ArrayList<Integer>();
		int n1 = sc.nextInt();
		for (int i = 0; i < n1; i++) {
			ints.add(sc.nextInt());

		}
		for (int i = 0; i < n1; i++) {
			int n2 = (Collections.min(ints));
			int n3 = ints.indexOf(Collections.min(ints));
			System.out.println(n2);
			ints.remove(n3);
		
		}

	}

}
