package Sort;

import java.util.Arrays;

import Utility.Input;
//Maintain two sub-arrays, first one is sorted, and second one in unsorted
//pick the first one from unsorted array and find the appropriate place(index) in the sorted array for it to be inserted.
//Each element in the sorted array after that index will move to right by one position
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
