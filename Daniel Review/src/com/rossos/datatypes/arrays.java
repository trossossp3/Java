package com.rossos.datatypes;

public class arrays { //one dimensional arrays
	public static void main(String[] args) {
		double[] arr;
		arr = new double[11]; // declaring a new array using word "new" where
								// the number in [] is the number of slots
		// assigning a value to each slot by multiplying each slot number by a
		// constant
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i * 0.4;
		} // for each loop printing method
		for (double temp : arr) {
			System.out.println(temp);
		}
		// traversing one dimensional array printing method
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			// random string program
			String[] foods = { "meat", "fruit", "vegtables" };
			String randomfood = foods[(int) (Math.random() * foods.length)];
			System.out.println(randomfood);

		}

	}

}
