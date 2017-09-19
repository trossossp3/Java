package com.rossos.datatypes;
import java.util.List;
public class accumulateAlgorithms {
	public int findSum (List<Integer> arr){
		int sum = 0;
		for (int i = 0; i < arr.size(); i++){
			sum += arr.get(i);
		}
		return sum;
	}

}
