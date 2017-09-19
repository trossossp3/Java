package com.rossos.datatypes;

public class StringChars {

	public static void main(String[] args) {
		System.out.println((char)52);
		String one = "cata";
		String two = "ata";
		
		System.out.println(one.substring(1,3));
		
		System.out.println(one.substring(2)); // break apart string 
		
		
		
		System.out.println(one.charAt(1)); // finds the char at that spot
		
		
		
		System.out.println(one.lastIndexOf('a')); // last time the charcter is used
		System.out.println(one.indexOf('a')); // first time charcter is used
		
		
		
		System.out.println(one.length()); // length of string
		
		
		System.out.println("b".compareTo("b")); //
	}

}
