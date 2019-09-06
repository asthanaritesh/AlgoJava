package Sort;

import java.util.Arrays;
import Utility.Input;

public class QuickSort {

	public static void quickSort(int[] arr, int L, int R) {
		int pivot = arr[(L+R)/2];
		// swap elements from left<-> right
		int i=L, j=R;
		while (i <= j) {
			while (arr[i] < pivot) i++; // Do not use <= or >= in any of the two conditions. b/c we want to move around pivot also.
			while (arr[j] > pivot) j--;
			if(i<=j) {
				swap(arr, i, j);
				i++;j--;
			}
		}
		if(L < j) //Note j. Do not use i. This is imp, here i is greater or equal to j, b/c of inc/dec after swapping.
			quickSort(arr, L, pivot); // or can use j in place of pivot
		if(i < R) // note i.
			quickSort(arr, pivot, R); // or can use i in place of pivot
	}
	
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void main(String args[]) {
		int[] arr = Input.arrayOfInts();
		quickSort(arr, 0, arr.length-1);
		System.out.println("The sorted array is: "+ Arrays.toString(arr));
	}
}
