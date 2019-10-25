package com.session.today.Sorting;

import com.session.today.Main;

public class SortingAlgorithms {

	static int arraySize = 10;
	
	public static void bubbleSort(int[] Database) {
		
		for (int i = arraySize -1; i > 0; i--) {
			
			for (int j = 0; j < i; j++) {
				
				if(Database[j] > Database[j+1]){
					
					Swap(Database,j,j+1);
					//ArrayPartition.DisplayTheArray(i, j)
					
				}
				Main.PrintHorizontalArray(i, j);
				
			}
			
		//	Main.PrintHorizontalArray(i, -1);
		}
		
	}

	public static void Swap(int[] database, int j, int i) {
		int temp = database[j];
		database[j] = database[i];
		database[i] = temp;
		
	}


	public static void  InsertionSort(int[] Database) {
		
		for (int i = 0; i < arraySize; i++) {
			int j = i;
			
			int ValueToAdd = Database[i];
			
			while((j>0) && (Database[j -1] > ValueToAdd)){
				
				Database[j] = Database[j -1];
				j--;
				
				Main.PrintHorizontalArray(i, j);
			} 
			
			Database[j] = ValueToAdd;
			
			Main.PrintHorizontalArray(i, j);
			
			System.out.println("\nArray[i] =  " + Database[i] + 
					"\nArray[j] = " + Database[j] + "\nValue to insert = " + ValueToAdd);
		}
	}
	
	public static void QuickSort(int[] Database) {}
	
	public static void MergeSort(int[] Database) {}

	
	public static void SeletionSort(int[] Database) {

		
		for (int i = 0; i < arraySize; i++) {
			
			int min = i;
			
			for (int j = i; j < arraySize; j++) {
				
				if (Database[min] > Database[j]) {
					
					min = j;
					
				}
			}
			
			Swap(Database, i, min);
			Main.PrintHorizontalArray(i, -1);
		}
	}
}
