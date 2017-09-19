package com.rossos.datatypes;

public class IntegerClass {
	public static void main(String[] args) {
		int n1 = 10;
		Integer myInteger = new Integer(n1);
		int result = myInteger.intValue();
		System.out.println(result);
		
		
		int rresult = Integer.MAX_VALUE;
		System.out.println(rresult);
		int min = Integer.MIN_VALUE;
		System.out.println(min);
		
	}

}
