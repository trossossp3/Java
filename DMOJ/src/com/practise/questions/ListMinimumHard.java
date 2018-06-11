package com.practise.questions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ListMinimumHard {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String inputString = in.readLine();
		int n1 = Integer.parseInt(inputString);
		String[] ints = null;
		int[] nums = null;
		for (int i = 0; i <n1; i++) {
			ints[i] = in.readLine();
			nums[i] = Integer.parseInt(ints[i]);		
			System.out.println(nums[i]);
			
	
		}
	}
}