package Sort;

import java.util.Arrays;
import Utility.Input;

public class SelectionSort {
	public static void main(String[] args) {
		int[] arr = Input.arrayOfInts();
		int temp;
		for (int i=0; i<arr.length; i++) {
			for (int j=0; j<arr.length;j++) {
				if (arr[i] < arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("Sorted Array is:");
		System.out.println(Arrays.toString(arr));
	}
}
