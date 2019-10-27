package com.session.today.Sorting;


import com.session.today.Main;
import com.session.today.helper.Helper;

public class SortingAlgorithms {

	static int arraySize = 10;
	
	public static void bubbleSort(int[] Database) {
		
		for (int i = arraySize -1; i > 0; i--) {
			
			for (int j = 0; j < i; j++) {
				
				if(Database[j] > Database[j+1]){
					
					Helper.Swap(Database,j,j+1);
					//ArrayPartition.DisplayTheArray(i, j)
					
				}
				Main.PrintHorizontalArray(i, j);
				
			}
			
		//	Main.PrintHorizontalArray(i, -1);
		}
		
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
	
	public static void QuickSort(int[] Database)
	{
		
		
		


		if (Database.length < 2) {
			return;
		} // array is already sorted
	
		Helper.QuickSortStep(Database, 0, Database.length -1);

		
	}
	
	public static void MergeSort(int[] array )
	{
		
		int[] arr = new int[array.length];
		
		System.arraycopy(array, 0, arr, 0, arr.length);
		
		int[] out =  new int[arr.length];
		
		int[] temp; // temp array reference
		
		int n = arr.length;
		
		
		for(int i = 1; i< n; i*=2) 
		{
			for(int j = 0; j < n; j+=2*i) {
				merge(arr, out, j, i);



			}

			temp = arr; arr = out; out = temp;

		}
		
		System.arraycopy(arr, 0, array, 0, arr.length);

		
	}

	//merge two arrays
	private static void merge(int[] arr, int[] out,  int start, int i) {
		
		int x = start;
		int end1 = Math.min(start + i, arr.length);
		int end2 = Math.min(start + 2*i, arr.length);
		int y = start + i;
		int z = start;
		
		while((x < end1) && (y < end2)) 
			
			if(arr[x] >= arr[y])  {

				out[z++] = arr[x++];

			}
		
			
			else out[z++] = arr[y++];
			
		if(x < end1) {
			System.arraycopy(arr, x, out, z, end1 - x);
		}

		else if(y < end2) {
			System.arraycopy(arr, y, out, z, end2 - y);

		}
		
	}

	public static void SeletionSort(int[] Database) {

		
		for (int i = 0; i < arraySize; i++) {
			
			int min = i;
			
			for (int j = i; j < arraySize; j++) {
				
				if (Database[min] > Database[j]) {
					
					min = j;
					
				}
			}
			
			Helper.Swap(Database, i, min);
			Main.PrintHorizontalArray(i, -1);
		}
	}
}
