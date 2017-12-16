package Sort;

import java.util.Arrays;

import Utility.Input;

public class BubbleSort {
	public static void main(String[] args) {
		int[] arr = Input.arrayOfInts();
		int temp, toSort = arr.length;
		//toSort is the length of array remained to be sorted. (length-toSort) is already sorted at the end of array.
		while (toSort > 1) {
			for (int i = 0; i < toSort-1; i++) { //at each iteration, highest element will bubble towards end of array.
				if (arr[i] > arr[i + 1]) {
					temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
			toSort--;
		}
		System.out.println("Sorted Array is: " + Arrays.toString(arr));
	}
}
