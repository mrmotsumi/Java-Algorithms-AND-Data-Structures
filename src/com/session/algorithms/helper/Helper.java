package com.session.algorithms.helper;

import java.util.Arrays;

import com.session.algorithms.Main;

public class Helper {

	public static void QuickSortStep(int[] database, int leftBound, int rightBound) {

		if (leftBound >= rightBound)
			return; // indices have crossed;

		int pivot = database[rightBound];

		int leftInd = leftBound; // will scan leftward

		int rightInd = rightBound - 1;// will scan right until lager than the pivot


		while (leftInd <= rightInd) { // scan right until larger than the pivot

			while ((leftInd <= rightInd) && (database[leftInd] <= pivot)) {
				leftInd++;
			}

			while ((rightInd >= leftInd) && (database[rightInd] >= pivot)) {
				rightInd--;
			}

			if (leftInd < rightInd) { // both elements were found so swap

				Helper.Swap(database, leftInd, rightInd);
				Main.PrintHorizontalArray(rightInd, database.length - 1); // print the array to show how many steps
																			// taken to solve the problem

			}

		} // loop continues until indices cross

		Main.PrintHorizontalArray(leftInd, -1); // print the array to show how many steps taken to solve the problem
		Helper.Swap(database, rightBound, leftInd);

		QuickSortStep(database, leftBound, leftInd - 1); // left recursive call
		QuickSortStep(database, leftInd + 1, rightBound); // right recursive call
		

	}

	public static void Swap(int[] database, int j, int i) {
		int temp = database[j];
		database[j] = database[i];
		database[i] = temp;

	}

	
	//get maximum value in the array
	
	public static int getMax(int[] array) 
	{
	 int max = Arrays.stream(array).max().getAsInt();
	 
	 return max;
	}

	//merge two arrays
	public static void merge(int[] arr, int[] out,  int start, int i) {
		
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

	

}
