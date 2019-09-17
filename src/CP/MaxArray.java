package CP;
//Problem is exactly same as DP.MaxTradingProfit.java but entirely different solution
//Maximize arr[j] – arr[i] + arr[l] – arr[k], such that i < j < k < l
//Maximize arr[j] – arr[i] + arr[l] – arr[k], such that i < j < k < l. Find the maximum value of arr[j] – arr[i] + arr[l] – arr[k], such that i < j < k < l
//Example:
//Let us say our array is {4, 8, 9, 2, 20}
//Then the maximum such value is 23 (9 - 4 + 20 - 2)
//The problem can be also stated as maximum profit from two transactions ([i,j] and [k,l]), given eod values given in an array.

//SOLUTION:
//	We will use Dynamic Programming to solve this problem. For this we create four 1-Dimensional DP tables.
//	Let us say there are four DP tables as – table1[], table2[], table3[], table4[]
//	Then to find the maximum value of arr[l] – arr[k] + arr[j] – arr[i], such that i < j < k < l
//	table1[] should store the maximum value of arr[l]
//	table2[] should store the maximum value of arr[l] – arr[k]
//	table3[] should store the maximum value of arr[l] – arr[k] + arr[j]
//	table4[] should store the maximum value of arr[l] – arr[k] + arr[j] – arr[i]
//	Then the maximum value would be present in index 0 of table4 which will be our required answer.
	
import java.util.Arrays; 

public class MaxArray {
	static int findMaxValue(int[] arr, int n) 
    { 
        // If the array has less than 4 elements 
        if (n < 4)  
            System.out.println("The array should have atleast 4 elements"); 
        // We create 4 DP tables 
        int table_l[] = new int[n + 1]; 
        int table_k[] = new int[n]; 
        int table_j[] = new int[n - 1]; 
        int table_i[] = new int[n - 2]; 
  
        // Initialize all the tables to minus Infinity 
        Arrays.fill(table_l, Integer.MIN_VALUE); 
        Arrays.fill(table_k, Integer.MIN_VALUE); 
        Arrays.fill(table_j, Integer.MIN_VALUE); 
        Arrays.fill(table_i, Integer.MIN_VALUE); 
  
        // table_l[] stores the maximum value of arr[l] 
        for (int i = n - 1; i >= 0; i--) 
            table_l[i] = Math.max(table_l[i + 1], arr[i]); 
        System.out.println("table_l is: "+ Arrays.toString(table_l));
        
        // table_k[] stores the maximum value of  arr[l] - arr[k] 
        for (int i = n - 2; i >= 0; i--)  
            table_k[i] = Math.max(table_k[i + 1], table_l[i + 1] - arr[i]); 
        System.out.println("table_k is: "+ Arrays.toString(table_k));
        
        // table_j[] stores the maximum value of  arr[l] - arr[k] + arr[j] 
        for (int i = n - 3; i >= 0; i--) 
            table_j[i] = Math.max(table_j[i + 1], table_k[i + 1] + arr[i]); 
        System.out.println("table_j is: "+ Arrays.toString(table_j));
        
        // table_i[] stores the maximum value of arr[l] - arr[k] + arr[j] - arr[i] 
        for (int i = n - 4; i >= 0; i--) 
            table_i[i] = Math.max(table_i[i + 1], table_j[i + 1] - arr[i]); 
        System.out.println("table_i is: "+ Arrays.toString(table_i));
        
        return table_i[0]; 
    } 
 
    public static void main(String[] args) 
    { 
//        int arr[] = { 4, 8, 9, 2, 20 };
        int arr[] = { 5, 11, 3, 90, 60, 50 };
//        int arr[] = { 5, 10, 20, 40, 70, 120 };
        System.out.println("Array is:   "+ Arrays.toString(arr));
        int n = arr.length; 
        System.out.println("Max Value is: "+ findMaxValue(arr, n)); 
    } 
} 
  

