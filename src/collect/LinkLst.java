package collect;

import java.util.*;
import java.io.*;


public class LinkLst {
	public static void main (String[] args) {
		LinkedList<String> LL = new LinkedList<String> ();
		LL.add("One");
		LL.add("Two");
		LL.add("Three");
		LL.add("Four");
		LL.addLast("Five");
		LL.addFirst("Zero");
		LL.add("Two");
		System.out.println("Original List is: " + LL);
		
		LL.remove("Two");
		System.out.println("\nAfter Removing Two: "+ LL);
		
		LL.removeLast();
		System.out.println("\nAfter Removing Last: "+ LL);
		
		LL.removeFirst();
		System.out.println("\nAfter Removing First: "+ LL);
		
		LL.add(2, "hundred"); 
		System.out.println("\nAfter adding/inserting at 2nd index: "+ LL);
		
		int size = LL.size(); 
        System.out.println("\nSize of linked list = " + size); 
  
        // Get and set elements from linked list 
        Object element = LL.get(1); 
        System.out.println("\nElement returned by get() : " + element);
        System.out.println("\nElement returned by getFirst() : " + LL.getFirst());
        LL.set(2, "Ten"); 
        System.out.println("\nLinked list after change : " + LL); 
		
        System.out.println("\nDoes the List contains 'Four': " + LL.contains("Four"));
        System.out.println("Does the List contains 'Ten': " + LL.contains("Nine"));
        
        int IndexOfTen = LL.indexOf("Ten");
        System.out.println("\nIndex of 'Ten': " + IndexOfTen);        
        LL.remove(IndexOfTen);
        System.out.println("After Removing Ten: "+ LL);
        
        System.out.println("\nThird Value is: "+ LL.get(3));
        System.out.println("First Value is: "+ LL.getFirst());
        System.out.println("Last Value is: "+ LL.getLast());
        
        System.out.println("Using For: ");
        for (String str : LL) {
        	System.out.print("\t" + str);
        }
        
        System.out.println("\nUsing ForEach: ");
        LL.forEach(item->System.out.print("\t" + item));
        
        System.out.println("\nUsing Iterator: ");
        Iterator it = (Iterator) LL.iterator();
        while (it.hasNext()){
        	System.out.print("\t" + it.next());
        }
	}
}
