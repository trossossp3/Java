package com.rossos.datatypes;

public class TheMathClass {
	static final double TOLERANCE = 0.0001;
	public static void main(String[] args) {
		double pi = Math.PI;
		System.out.println(pi);
		
		int result = (int) ((Math.random()) * (101)); // 0 - 100
		System.out.println(result);
		
		int result1 = (int) (Math.random() * 6) + 10; // 10 -15
		System.out.println(result1);
		
		
		double a = 9.899999;
		double b = 10;
	    boolean b1 = (b - a) <= TOLERANCE;
	    System.out.println(b1);
		
	}

}
