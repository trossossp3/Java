package com.practise.questions;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class BoardGame {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		int del = in.indexOf(' ');
		StringBuilder sb = new StringBuilder(in);
		sb.deleteCharAt(del);
		System.out.println(in);
		int con = 1;
		boolean bool = false;
		ArrayList<Integer> ints = new ArrayList<Integer>();

		for (int i = 0; i < in.length() - 1; i++) {
			int j = i + 1;
			if (in.charAt(j) == 'L') {
				bool = true;
			} else {
				bool = false;
			}
			if (bool == true && in.charAt(i) == 'L' && in.charAt(j) == 'L') {

				con++;
				ints.add(con);

			}
			if (bool == false) {
				con = 1;

			}
			int max = ints.get(0);
			for (Integer k : ints) {
				if (k > max)
					k = max;
			}

		}

	}

}
