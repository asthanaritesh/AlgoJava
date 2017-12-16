package Sort;

import java.util.Arrays;

import Utility.Input;

public class InsertionSort {
	public static void main(String args[]) {
		int[] arr = Input.arrayOfInts();
		for(int i=0; i<arr.length; i++) {
			int j = i-1, curElem = arr[i];
            /* Move elements of arr[] from i-1 to 0, that are greater than current element, to one position ahead of their current position */
			while(j>=0 && arr[j]>curElem) {
				arr[j+1] = arr[j];
				j--;
			}
			arr[j+1]=curElem;
		}
		System.out.println(Arrays.toString(arr));
	}
}
