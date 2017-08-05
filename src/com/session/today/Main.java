package com.session.today;

import com.session.today.Sorting.SortingAlgorithms;
import com.session.today.search.SeachingAlgorithms;

public class Main {

	
	protected static int[] array = new int[50];
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
		
		for (int i = 0; i < ArraySize; i++) {
			
			System.out.println( i + " " + array[i]);
			
		}
		
	}
	
	

	public static void main(String[] args) {
		
		GenrateRandomArray();
		DispalyHArray();
		
		SeachingAlgorithms.LinearSearch(array, 12);
		
		System.out.println();
		SortingAlgorithms.bubbleSort(array);
	 DispalyHArray();

		System.out.println();
		
		SeachingAlgorithms.BinarySearch(array, 17);
	}

	
	
}
