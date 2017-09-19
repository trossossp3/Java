package com.sorting.algorithms;


public class BubbleSort {

	public static void bubble(int array[]) {
		int n = array.length;
		int k;
		for (int j = n; j >= 0; j--) {
			for (int i = 0; i < n - 1; i++) {
				k = i + 1;
				if (array[i] > array[k]) {
					swap(i, k, array);
				}
			}
			print(array);

		}
	}

	private static void swap(int i, int j, int[] array) {

		int temp;
		temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}

	private static void print(int[] input) {

		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + ", ");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		int array[] = new int[]{12,122};
		bubble(array);
	}



}
