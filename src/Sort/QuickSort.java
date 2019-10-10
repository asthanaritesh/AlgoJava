package Sort;

import java.util.Arrays;
import Utility.Input;

public class QuickSort {

	static int partition(int arr[], int low, int high) {
		int pivot = arr[high];
		int i=low, j=high-1;
		while (i < j) {
			while (arr[i] < pivot) i++; // Do not use <= or >= in any of the two conditions. b/c we want to move around pivot also.
			while (arr[j] > pivot) j--;
			if(i<j) {
				swap(arr, i, j);
				i++;j--;
			}
		}
		// swap arr[i+1] and arr[high] (or pivot)
		swap(arr, i , high);
		return i;
	}

	static void quickSort(int arr[], int low, int high) {
		if (low < high) {
			/* pi is partitioning index, arr[pi] is now at right place */
			int pi = partition(arr, low, high);
			// Recursively sort elements before partition and after partition
			quickSort(arr, low, pi - 1);
			quickSort(arr, pi + 1, high);
		}
	}

	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String args[]) {
		int[] arr = Input.arrayOfInts();
		quickSort(arr, 0, arr.length - 1);
		System.out.println("The sorted array is: " + Arrays.toString(arr));
	}
}
