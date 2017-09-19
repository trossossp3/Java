package com.test.methods;

import java.util.ArrayList;

public class Random {
	private static void random(int n1, int n2, int n3){
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 0; i < n3; i++){
			if (n1 == 0)
				arr.add((int) (Math.random() * (n2 + 1)));
			else{
				arr.add((int) (Math.random() * ((n2 - n1) + 1) + n1));
			}
				
		} print(arr);
	}
	private static void print(ArrayList<Integer> arr){
		for (int i = 0; i < arr.size(); i++) {
			System.out.println(arr.get(i));
		}
	}
	
	public static void main(String[] args) {
		int n1 = 0;
		int n2 = 1001000;
		int n3 = 2;
		random(n1, n2, n3);
	}

}
