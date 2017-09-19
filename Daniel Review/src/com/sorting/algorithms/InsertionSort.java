package com.sorting.algorithms;

public class InsertionSort {
	public static int[] insertion(int[] arr) {
		int temp;
		for (int i = 1; i < arr.length; i++) {
			for (int j = i; j > 0; j--) {
				if (arr[j] < arr[j - 1]) {
					temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;

				}
			}
		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr1 = { 65, 1, 23, 3, 45, 3, 3, 6, 7, 34, 45, 2, 43, 4, 3 };
		int[] arr2 = insertion(arr1);
		for (int i : arr2) {
			System.out.print(i);
			System.out.print(", ");

		}

	}
}
