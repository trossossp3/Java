package com.friday.nineteen;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class j32017 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("data/data.dat"));

		String[] tokens = in.readLine().split(" ");
		int y1 = Integer.parseInt(tokens[0]);
		int x1 = Integer.parseInt(tokens[1]);
		String[] tokens1 = in.readLine().split(" ");
		int y2 = Integer.parseInt(tokens1[0]);
		int x2 = Integer.parseInt(tokens1[1]);
		int fuel = Integer.parseInt(in.readLine());
		int Total1 = y1 + x1;
		int Total2 = y2 + x2;
		int deltadist = Math.abs(Total2 - Total1);
		if (deltadist % 2 == 0 && fuel % 2 == 0 && deltadist <= fuel
				|| deltadist <= fuel && deltadist % 2 != 0 && fuel % 2 != 0) {
			System.out.println("Y");
		} else {
			System.out.println("N");
		}
	}
}