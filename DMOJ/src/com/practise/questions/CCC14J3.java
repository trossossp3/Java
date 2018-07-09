package com.practise.questions;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CCC14J3 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s1 = in.readLine();
		int n1 = Integer.parseInt(s1);
		int[] Antonia = new int[n1];
		int[] David = new int[n1];
		int dTotal = 100;
		int aTotal = 100;
		
		for(int i = 0; i<n1; i++) {
			String nums = in.readLine();
			char num1 = nums.charAt(0);
			char num2 = nums.charAt(2);
			
			int int1 = Character.getNumericValue(num1);
			int int2 = Character.getNumericValue(num2);
			Antonia[i] = int1;
			David[i] = int2;			
			
		}
		
		for(int i=0; i<n1; i++){
		
			if(Antonia[i]>David[i]) {
				dTotal= dTotal-Antonia[i];
			}else if(Antonia[i]<David[i]) {
				aTotal=aTotal-David[i];
			}
		}
		
		System.out.println(aTotal);
		System.out.println(dTotal);
		
		
		
	}

}
