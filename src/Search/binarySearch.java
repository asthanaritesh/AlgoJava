/* This just search for a number from a Sorted Array. Idea is to employ binary search 
 * Input is sorted array. Output is index of the number. If not found, output is -1
*/
package Search;
import Utility.Input;

public class binarySearch {
	static int searchFor;
	static int index;
	
	public static void main(String[] args) {
		System.out.println("Write the int array");
		int[] intArr = Input.arrayOfInts();
		System.out.println("Write the value to be found");
		searchFor = Input.singleInt();
		int index = binSearch(intArr, 0, intArr.length-1);
		System.out.println("Found at index: "+ index);
	}

	private static int binSearch(int[] intArr, int s, int e) {
		if (s==e) {
			if(intArr[s]==searchFor)
				return s;
			else {
				System.out.println("Not Found");
				return -1;
			}
		}
		int mid = (s+e)/2;
		if (searchFor == intArr[mid])
			return (s+e)/2;
		else if (searchFor < intArr[mid])
			return binSearch(intArr, s, mid-1); // mid-1 and mid+1 are important here.
		else return binSearch(intArr, mid+1, e);
	}
}
