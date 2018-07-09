package com.practise.questions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC14J2VoteCount {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		 String s1 = in.readLine();		 
		 String s2 = in.readLine();
		 int n1 = Integer.parseInt(s1);
		 int aCount = 0;
		 int bCount = 0;;
		 
		 for(int i =0; i<n1; i++) {
			 if(s2.charAt(i)=='A') {
				 aCount++;
			 }else {
				 bCount++;
			 }
		 }
		 if(aCount<bCount) {
			 System.out.println('B');
		 }
		 else if (bCount<aCount) {
			 System.out.println('A');			 
		 }else {
			 System.out.println("Tie");
		 }
	}
	
}
