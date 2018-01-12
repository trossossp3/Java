package com.friday.eighteen;

public class ShiftySum {
	public static void main(String[] args) {
		int n1 = 12;
		int n2 = 3;
		int temp = n1;
		for (int i = 0; i < n2; i++) {
			n1 *= 10;
			temp += n1;
		}
		System.out.println(temp);
	}

}
