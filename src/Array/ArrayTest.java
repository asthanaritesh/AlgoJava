package Array;

import java.util.Arrays;
import java.util.Iterator;

public class ArrayTest {
	public static void main(String[] args) {		
		int[] intArr1 = new int[] {1,2,3};
		Integer[] intArr2 = new Integer[] {1,2,3};
		int[] intArr3 = new int[4];
		System.out.println("intArr1: "+ Arrays.toString(intArr1));
		System.out.println("intArr2: "+ Arrays.toString(intArr2));
		System.out.println("intArr3: "+ Arrays.toString(intArr3));
		
		String[] strArr1 = {"A", "B", "C", "D", "E"};
		String[] strArr2 = new String[] {"H", "F", "J", "G", "I"};
		String[] strArr3 = new String[2];
		strArr3[0] = "K";
		
        System.out.println("\nUsing For C++ style: ");
        for (int i =0; i< strArr1.length; i++) {
        	System.out.print("\t" + strArr1[i]);
        }
        
		System.out.println("\nUsing For: ");
        for (String str : strArr1) {
        	System.out.print("\t" + str);
        }
        
        System.out.println("\nUsing Java Style: " + Arrays.toString(strArr1));      
        
        String[] strArr12 = new String[strArr1.length + strArr2.length];
		System.arraycopy(strArr1, 0, strArr12, 0, strArr1.length);
		System.arraycopy(strArr2, 0, strArr12, strArr1.length, strArr2.length);
		System.out.println("\nMerged Array: ");
        for (String str : strArr12) {
        	System.out.print("\t" + str);
        }
		String[] strArr4 = strArr1.clone();
		String[] strArr5 = strArr1;
		String[] strArr6 = new String[]{};
		System.out.println("\nUsing Clone: " + Arrays.toString(strArr4));        
        System.out.println("\nstrArr1 hashcode: "+strArr1.hashCode());
        System.out.println("strArr4 hashcode: "+strArr4.hashCode());
        System.out.println("strArr5 hashcode: "+strArr5.hashCode());
        
        String[] strArr7 = {"A", "B", "C", "D", "E"};
        System.out.println("\nusing [].equals()(Wrong way): "+ strArr1.equals(strArr7));
        System.out.println("using Arrays.equals(Correct way): "+ Arrays.equals(strArr1,strArr7));
        Arrays.sort(strArr2);
        System.out.println("After sorted: "+ Arrays.toString(strArr2));
        System.out.println(Arrays.binarySearch(strArr2, "I"));
        
        int[] intArr = {5,10,100,18,8,25,300,30};
        Arrays.sort(intArr);
        System.out.println(Arrays.toString(intArr)); 
        System.out.println(Arrays.binarySearch(intArr, 101));
	}
}
