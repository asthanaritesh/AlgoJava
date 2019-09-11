package collect;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Stack;

public class StackTest {
	public static void main (String[] args) {
		Stack<String> sObj = new Stack<String>(); // Stack is actually inherited from vector which implements List.
		sObj.push("One");
		sObj.add("Two");
		sObj.add("Three");
		sObj.push("Four");
		sObj.add(1, "OC");
		System.out.println("Original stack is: "+ sObj);
		
		System.out.println("\nPeek of stack is: "+ sObj.peek());
		
		String popped = sObj.pop();
		System.out.println("\nPopped: "+ popped);
		System.out.println("After pop, stack is: "+ sObj);
		
        int pos = sObj.search("Eight");        
        if(pos == -1) 
            System.out.println("\nEight not found"); 
        else System.out.println("\nEight is found at position " + pos); 
        
		String removed = sObj.remove(1);
		System.out.println("\nRemoved: "+ removed);
		System.out.println("After removing at index 1, stack is: "+ sObj);
		
		Stack<String> sObjAux = new Stack<String>();
		sObjAux.push("Eleven");
		sObjAux.push("Twelve");
		System.out.println("\nAuxilliary stack is: "+ sObjAux);
		sObj.addAll(sObjAux);
		System.out.println("After Adding Aux, Stack becomes: "+ sObj);
		
        System.out.println("Using For: ");
        for (String str : sObj) {
        	System.out.print("\t" + str);
        }
        
        System.out.println("\nUsing ForEach: ");
        sObj.forEach(item->System.out.print("\t" + item));

        System.out.println("\nUsing Iterator: ");
        Iterator it = (Iterator) sObj.iterator();
        while (it.hasNext()){
        	System.out.print("\t" + it.next());
        }
        
        System.out.println("\nUsing Enumeration: ");
        Enumeration en = sObj.elements();
        while(en.hasMoreElements()) {
        	System.out.print("\t" + en.nextElement());
        }
	}
}
