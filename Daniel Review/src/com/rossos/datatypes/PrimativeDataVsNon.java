package com.rossos.datatypes;

public class PrimativeDataVsNon {
	static final int HOURS_DAY = 24;

	public static void main(String[] args) {
		String buster = "buster";
		String copy = "buster";
		
		System.out.println(buster == copy);
		
		int works = 90;

		System.out.println(test(works,"ass"));
		System.out.println(works);

		System.out.println(buster);
		System.out.println(buster);
	}
	
	public static int test (int x, String y){
		return x -x;
	}
	
	public static String test(String x){
		return "changed!";
	}

}
