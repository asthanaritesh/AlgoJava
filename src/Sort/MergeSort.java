package Sort;

import java.util.Arrays;

import Utility.Input;

public class MergeSort {
	
	private static void mergeSort(int[] arr, int L, int R) {
		if(L<R) {
			int M =(L+R)/2;
			mergeSort(arr, L, M);
			mergeSort(arr, M+1, R); // M+1 is important here.
			merge(arr,L,M,R);
		}		
	}

	// Merges two sub arrays of arr[]. First subarray is arr[l..m]. Second subarray is arr[m+1..r]
	private static void merge(int[] arr, int L, int M, int R) {
		//create two temp arrays equal to size of left sub array and right sub array respectively.
		int sizeL = M-L+1;
		int sizeR = R-M;
		int[] left = new int[sizeL];
		int[] right = new int[sizeR];
		//copy the data from two sub arrays into temp arrays.
		for(int i=0; i<sizeL; i++) left[i] = arr[L+i];
		for(int i=0; i<sizeR; i++) right[i] = arr[M+1+i];
		
		//merge the two temp arrays
		int i=0,j=0,k=L;
		while(i<sizeL && j<sizeR) {
			if(left[i] <= right[j]) arr[k++] = left[i++];
			else arr[k++] = right[j++];
		}
		//copy the remaining elements
		while(i<sizeL) arr[k++] = left[i++];
		while(i<sizeR) arr[k++] = left[j++];
	}

	public static void main(String args[]) {
		int[] arr = Input.arrayOfInts();
		mergeSort(arr, 0, arr.length-1);
		System.out.println("Sorted Array is:\n"+Arrays.toString(arr));
	}
}
