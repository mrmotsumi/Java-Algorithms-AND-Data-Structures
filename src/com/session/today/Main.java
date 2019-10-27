package com.session.today;

import java.util.Comparator;

import com.session.today.Sorting.SortingAlgorithms;
import com.session.today.search.SeachingAlgorithms;


public class Main {

	
	protected static int[] array = new int[10];
	protected static int ArraySize =10;
	
	
	public static void GenrateRandomArray() {
		
		for (int i = 0; i < ArraySize; i++) {
			
			array[i] = (int) (Math.random() * 10) + 10;
			
		}
		
	}
	
	public static void  DispalyHArray() {
		
		/*
		 * --------------------------------------------------
		 * | 0  | 1  | 2  | 3  | 4  | 5  | 6  | 7  | 8  | 9  |
		 * ---------------------------------------------------
		 * | 13 | 10 | 12 | 17 | 14 | 15 | 16 | 17 | 11 | 19 |
		 * ---------------------------------------------------
		 */
		
		for (int i = 0; i < 51; i++)System.out.print("-");
		System.out.println();
		System.out.print("| ");
		for (int i = 0; i < ArraySize; i++) System.out.print(i + "  | ");
		System.out.println();
		
		
		
		
		for (int i = 0; i < 51; i++)System.out.print("-");
		System.out.println();
		System.out.print("| ");
		for (int i = 0; i < ArraySize; i++) System.out.print(array[i] + " | ");
			
		
		System.out.println();
		for (int i = 0; i < 51; i++)System.out.print("-");
		System.out.println();
		
		
	}
	
	/*
	 * 
	 * Display Array
	 */
	protected static void dislayArray() {

		System.out.print("-----------------------------------------------------------");
		System.out.println();


		for (int i = 0; i < ArraySize; i++) {
			
			System.out.print( i + "   | ");

			
		}
		System.out.println();

		System.out.print("-----------------------------------------------------------");

		System.out.println();
		
	    for (int i = 0; i < ArraySize; i++) {
			
			System.out.print(  array[i] +"  | ");

			
		}
		System.out.println();

		System.out.print("-----------------------------------------------------------");
		System.out.println();


		
	}
	
	
	
	public static void PrintHorizontalArray(int i , int j) {
		
		for (int n = 0; n < 51; n++)System.out.print("-");
		System.out.println();
		System.out.print("| ");
		for (int p = 0; p < ArraySize; p++) System.out.print(p + "  | ");
		System.out.println();
		
		
		
		
		for (int q = 0; q < 51; q++)System.out.print("-");
		System.out.println();
		System.out.print("| ");
		for (int x = 0; x < ArraySize; x++) System.out.print(array[x] + " | ");
			
		
		System.out.println();
		for (int s = 0; s < 51; s++)System.out.print("-");
		System.out.println();
		
		
		if(j != -1){
			
			for (int k = 0; k < ((j * 5 )  + 2 ); k++)System.out.print(" ");
			
			System.out.print(j);
		}
		
		
		if (i != -1) {
			
			for (int c = 0; c < (5* (i - j)  - 1); c++)System.out.print(" ");
			System.out.print(i);
	
		}
		System.out.println();
	}
	

	public static void main(String[] args) {

		GenrateRandomArray();

		// SeachingAlgorithms.LinearSearch(array, 12);

		// SortingAlgorithms.bubbleSort(array);

		// SortingAlgorithms.SelctionSort(array);

		//SortingAlgorithms.InsertionSort(array);
		
		//Test Merge Sort algorithms by uncommenting the following lines of code
		//dislayArray();
		SortingAlgorithms.QuickSort(array);
		//dislayArray();

		// SeachingAlgorithms.BinarySearch(array, 17);

	}

	
	
}
