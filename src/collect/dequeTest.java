package collect;

import java.util.*;

public class dequeTest {
	public static void main (String[] args) {
		Deque<String> Dq = new LinkedList<String> (); //can also use LinkedBlockingDeque or ConcurrentLinkedDeque or ...
		Dq.add("One");
		Dq.add("Two");
		Dq.addFirst("Three");
		Dq.addFirst("Four");
		Dq.addLast("Five");
		Dq.addLast("Six");
		Dq.add("Seven");
		Dq.add("Eight");
		Dq.offer("Nine"); //same as add, except it returns false if capacity full. add throws exception in such case. 
		System.out.println("Original Deque is: " + Dq);
		
		System.out.println("\nPeek of Deque is: "+ Dq.peek());
					
		Dq.remove(); // throws exception if list is empty
		System.out.println("\nAfter remove(): "+ Dq);
		Dq.poll(); //same as remove. except it returns null if queue is empty
		System.out.println("After poll(): "+ Dq);
		Dq.removeFirst();
		System.out.println("\nAfter removingFirst(): "+ Dq);
		Dq.removeLast();
		System.out.println("\nAfter removingLast(): "+ Dq);
		Dq.pop();
		System.out.println("\nAfter pop(): "+ Dq);
		Dq.remove("Eight");
		System.out.println("\nAfter Removing Eight: "+ Dq);
		
		int size = Dq.size(); 
        System.out.println("\nSize of the Deque = " + size); 
  
        System.out.println("\nDoes the List contains 'Four': " + Dq.contains("Four"));
        System.out.println("Does the List contains 'Ten': " + Dq.contains("Nine"));
        
        System.out.println("Using For: ");
        for (String str : Dq) {
        	System.out.print("\t" + str);
        }
        
        System.out.println("\nUsing ForEach: ");
        Dq.forEach(item->System.out.print("\t" + item));
        
        System.out.println("\nUsing Iterator: ");
        Iterator it = (Iterator) Dq.iterator();
        while (it.hasNext()){
        	System.out.print("\t" + it.next());
        }
	}
}
