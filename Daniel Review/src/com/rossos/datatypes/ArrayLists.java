package com.rossos.datatypes;

import java.util.ArrayList; // must import this for ArrayLists

public class ArrayLists {
	public static void main(String[] args) {
		ArrayList<Integer> ints = new ArrayList<Integer>(); // general way of
															// declaring an
															// array list
		ints.add(new Integer(8));// adding an integer to the Array
		ints.add(new Integer(10)); // same as last line
		ints.add(new Integer(89)); // same as last line
		ints.add(1, new Integer(9)); // add an integer into the index u said "1"
		int n1 = ints.size(); // how many number of items stored
		int n2 = ints.remove(0); // removes the value in the index then stores
									// the value in the variable
		int n3 = ints.get(0); // makes a copy of the value of the selected index
								// and stores it in the variable
		int n4 = ints.set(1, new Integer(10)); // set method sets value of index
												// to the new one and stores the
												// old value in the variable
		// traversing an ArrayList using for loop
		for (int i = 0; i < ints.size(); i++) {
			System.out.println(ints.get(i));
		} // traversing an ArrayList using for-each loop
		for (Integer int1 : ints) {
			System.out.println(int1);
		} // dont use .remove in for-each to remove some values because u need an index so do what is below
		int index = 0;
		while (index < ints.size()) {
			if (ints.get(index) >= 20 )
				ints.remove(index);
			else
				index++;
		}

	}

}
