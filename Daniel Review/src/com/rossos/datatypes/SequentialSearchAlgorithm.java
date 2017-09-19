package com.rossos.datatypes;

public class SequentialSearchAlgorithm {
	public int searchForTitle(String[] titles, String target) {
		int index = 0;
		while (index < titles.length) {
			if (titles[index].equals(target)) {
				return index;
			}
			index++;
		}
		return -1;

	}
}