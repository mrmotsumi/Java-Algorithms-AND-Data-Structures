package com.session.algorithms.Sorting;


import com.session.algorithms.Main;
import com.session.algorithms.helper.Helper;

public class SortingAlgorithms {

	static int arraySize = 10;
	
	

	/*
	 * Shellsort, also known as Shell sort or Shell's method, is an in-place
	 * comparison sort. It can be seen as either a generalization of sorting by
	 * exchange (bubble sort) or sorting by insertion (insertion sort). The method
	 * starts by sorting elements far apart from each other and progressively
	 * reducing the gap between them.
	 */
	public static void ShellSort(int[] Database) {
		int in, out, temp;

		int i = 1;

		while (i <= Database.length) {

			i = i * 2 + 1;
		}
		while (i > 0) {
			for (out = i; out < Database.length; out++) {
				temp = Database[out];
				in = out;

				while (in > i - 1 && Database[in - i] >= temp) {
					Database[in] = Database[in - i];
					in -= i;
				}
				Database[in] = temp;
			}
			i = (i - 1) / 2;

		}

	}
	
	public static void RadixSort() {}
	
	public static void  HeapSort() {}
	
	
	/*
	 * In the Bucket Sorting technique, the data items are distributed in a set of
	 * buckets. Each bucket can hold a similar type of data. After distributing,
	 * each bucket is sorted using another sorting algorithm. After that, all
	 * elements are gathered on the main list to get the sorted form.
	 * 
	 * 
	 * Time Complexity: O(n + k) for best case and average case and O(n^2) for the
	 * worst case.
	 * 
	 * Space Complexity: O(nk) for worst case
	 */
	public static void  BucketSort(int[] Database, int maxVal) {
		
	      int [] bucket=new int[maxVal+1];
	      
	      for (int i=0; i<bucket.length; i++) {
	          bucket[i]=0;
	       }
	  
	       for (int i=0; i<Database.length; i++) {
	          bucket[Database[i]]++;
	       }
	  
	       int outPos=0;
	       for (int i=0; i<bucket.length; i++) {
	          for (int j=0; j<bucket[i]; j++) {
	        	  Database[outPos++]=i;
	          }
	       }
		
	}

	
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
				Helper.merge(arr, out, j, i);



			}

			temp = arr; arr = out; out = temp;

		}
		
		System.arraycopy(arr, 0, array, 0, arr.length);

		
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
