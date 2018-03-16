package Sort;

import java.util.Arrays;
import Utility.Input;

//Maintain two subarrays, firstone is sorted, and second one in unsorted
//find the minimum element and swap with the first elem of unsorted array.
//unsorted array reduces by one sixe in each iteration
public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = Input.arrayOfInts();
		int len = arr.length;
		int temp;
		for (int i=0; i<len-1; i++) {
			int min_idx = i;
			for (int j=i+1; j<len; j++){
				if (arr[j]<arr[min_idx]) min_idx = j;
			}
			temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
		}
		System.out.println("Sorted Array is:");
		System.out.println(Arrays.toString(arr));
	}
}
