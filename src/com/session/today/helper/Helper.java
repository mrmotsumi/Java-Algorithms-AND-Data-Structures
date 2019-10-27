package com.session.today.helper;

import com.session.today.Main;

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
				// temp = database[rightInd]; database[rightInd] = database[leftInd];
				// database[leftInd] = temp;

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

}
