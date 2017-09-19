package com.rossos.datatypes;

import java.util.ArrayList;

public class FindHighestAlgorithm {
	public int findHigh(ArrayList<Integer> arr) {
		int high = arr.get(Integer.MIN_VALUE);
		for (int i = 0; i < arr.size(); i++) {
			if (arr.get(i) > high) {
				high = arr.get(i);
			}
		}
		return high;

	}

}
