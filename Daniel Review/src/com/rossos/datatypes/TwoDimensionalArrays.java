package com.rossos.datatypes;

public class TwoDimensionalArrays {
	public static void main(String[] args) { 
		// general way of making a 2-`d array with a predefined list
		char [][] TickTacToe = { { 'a', 'b', 'a'}, { 'b','b', 'a'}, {'a', 'a', 'b'}};
		TickTacToe [0][0] = 'b'; // assigning a value to a spot
		// number of rows
		int rows = TickTacToe.length;
		// number of columns
		int columns = TickTacToe[0].length;
		System.out.println(rows); // 3
		System.out.println(columns); // 3
		
		
		// declaring a 2-d array using key word "new"u
		int [][] sudoko = new int [9]/*first square brackets is rows*/[9]; // second is columns	
		sudoko[0][0] = 4;
		// traversing a 2-d array in Row-Major order. Row-Major is left to right then next row
		for (int row = 0; row < sudoko.length; row++){
			for (int column = 0; column < sudoko[0].length; column++){
				System.out.println(sudoko[row][column]);
			}
			
		}
		// traversing a 2-d array in Column-Major order. Column-Major is read column by column
		for (int column = 0; column < sudoko[0].length; column++){
			for (int row = 0; row < sudoko.length; row++){
				System.out.println(sudoko[row][column]);
			}
		}
		
		
		
	}

}
