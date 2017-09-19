package com.rossos.datatypes;

import java.util.ArrayList;

public class CopyArrayAlgorithm {
	public static void main(String[] args) {
		// duplicates an array
		ArrayList<Integer> original = new ArrayList<Integer>();
		original.add(23);
		original.add(330);
		original.add(89);
		ArrayList<Integer> duplicate = new ArrayList<Integer>();
		for (Integer temp : original){
			duplicate.add(temp);
		}
	}

}

