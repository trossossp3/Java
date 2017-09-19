package com.sorting.algorithms;

public class SelectionSort {

	public static int[] selection(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int index = i;
			for (int j = i + 1; j < arr.length; j++)
				if (arr[j] < arr[index])
					index = j;
			int biggerNumber = arr[index];
			arr[index] = arr[i];
			arr[i] = biggerNumber;

		}
		return arr;
	}

	public static void main(String[] args) {
		int[] arr1 = {65,56,323,453,244222,4324};
		int[] arr2 = selection(arr1);
		for (int i : arr2) {
			System.out.print(i);
			System.out.print(", ");

		}
	}
}