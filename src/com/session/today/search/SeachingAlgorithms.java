package com.session.today.search;

import com.session.today.Main;



public class SeachingAlgorithms {

	
	static int arraySize = 10;
	public static String LinearSearch(int[] Database,int Value) {
		
		boolean ValueInArray = false;
		String indexWithVlue="";
		
		for (int i = 0; i < arraySize; i++) {
			
			if(Database[i] == Value){
				
				ValueInArray = true;
				indexWithVlue += i + " ";
				
			}
			
			Main.PrintHorizontalArray(i, -1);
		}
		
		if(!ValueInArray){
			 
			indexWithVlue = "Nothing Was Found: ";
			
		}
		
		System.out.println(Value + " Was Found @ Index: " + indexWithVlue);
		return indexWithVlue;
		
	}

    
	public static void  BinarySearch(int[] Database,int Value) {
		
		int low = 0;
		int high = arraySize - 1;
		
		while(low <= high){
			
			int middle = (low + high) /2;
			
			if(Database[middle] > Value) high = middle -1;
			
			else if(Database[middle] < Value) low = middle + 1;
			
			else {
				
				System.out.println(Value + ": Found @ index:" + middle);
				
				
				low = high + 1;
			}
			
			Main.PrintHorizontalArray(middle, -1);
			
		}
		
	}
}
