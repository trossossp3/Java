package com.sorting.algorithms;

public class Alphabatizer {

	public static void main(String[] args) {
		String[] array = new String[] { "1", "aat", "R", "r", "e" };
		array = alpha(array);
		print(array);
	}

	public static String[] alpha(String array[]) {
		String temp;
		for (int j = 1; j < array.length; j++) {
			int i = j;
			temp = array[j];
			while (i > 0 && temp.compareTo(array[i - 1]) < 1) {
				array[i] = array[i - 1];
				i--;
			}
			array[i] = temp;
		}
		return (array);

	}

	private static void print(String[] input) {

		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ", ");
		}
		System.out.println("\t");
	}

}