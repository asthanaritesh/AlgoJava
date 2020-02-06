package Recursion;

//Java program to print all the permutations 
//of the given string 
public class Permutation { 
static String tab;
 // Function to print all the permutations of str 
 static void printPermutn(String str, String ans) 
 {	 
	 System.out.println(tab + "ans is " + ans);
     // If string is empty 
     if (str.length() == 0) { 
    	 System.out.print(tab + "Returning Answer: ");
    	 System.out.println(ans);
         return; 
     } 
	 //System.out.println();
     for (int i = 0; i < str.length(); i++) { 

         // ith character of str 
         char ch = str.charAt(i); 
         System.out.println(tab + "ch is " + ch);
         // Rest of the string after excluding the ith character 
         String ros = str.substring(0, i) +  
                      str.substring(i + 1); 
         System.out.println(tab + "ros is " + ros); 
         // Recurvise call
         tab = tab + "  ";
         printPermutn(ros, ans + ch);
         tab = tab.substring(0, tab.length() - 2);
     } 
 } 

//Function to print all the distinct 
 // permutations of str 
 static void printDistinctPermutn(String str,  String ans) 
 {    // If string is empty 
     if (str.length() == 0) { 
         // print ans 
         System.out.print(ans + " "); 
         return; 
     } 
     // Make a boolean array of size '26' which stores false by default and make true at the position which alphabet is being used 
     boolean alpha[] = new boolean[26];
     for (int i = 0; i < str.length(); i++) { 
         // ith character of str 
         char ch = str.charAt(i); 
         // Rest of the string after excluding  
         // the ith character 
         String ros = str.substring(0, i) + str.substring(i + 1);
         // If the character has not been used  then recursive call will take place. Otherwise, there will be no recursive call.
         if (alpha[ch - 'a'] == false) 
             printDistinctPermutn(ros, ans + ch);
         alpha[ch - 'a'] = true; 
     }     
 }
 public static String swap(String a, int i, int j) 
 { 
     char temp; 
     char[] charArray = a.toCharArray(); 
     temp = charArray[i]; 
     charArray[i] = charArray[j]; 
     charArray[j] = temp; 
     return String.valueOf(charArray); 
 }
 private static void permute(String str, int l, int r) 
 { 
     if (l == r) 
         System.out.print(str + " "); 
     else { 
         for (int i = l; i <= r; i++) { 
             str = swap(str, l, i); 
             permute(str, l + 1, r); 
             str = swap(str, l, i); 
         } 
     } 
 } 
 // Driver code 
 public static void main(String[] args) 
 { 
	 tab = "";
     String s = "abb"; 
     printPermutn(s, "");
     System.out.println("Now Printing only distinct permutations: ");
     printDistinctPermutn(s, "");
     System.out.println();
     System.out.println("Now Using Swapping method: ");
     int n = s.length();
     permute(s, 0, n - 1); 
 } 
} 