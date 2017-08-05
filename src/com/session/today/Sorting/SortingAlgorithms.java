package com.session.today.Sorting;

public class SortingAlgorithms {

	static int arraySize = 10;
	
	public static void bubbleSort(int[] Database) {
		
		for (int i = arraySize -1; i > 0; i--) {
			
			for (int j = 0; j < i; j++) {
				
				if(Database[j] > Database[j+1]){
					
					Swap(Database,j,j+1);
				}
				
			}
			
		}
		
	}

	private static void Swap(int[] database, int j, int i) {
		int temp = database[j];
		database[j] = database[i];
		database[i] = temp;
		
	}
}
