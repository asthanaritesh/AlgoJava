package collect;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {
	public static void main (String[] args) {
			Queue<String> que = new LinkedList<String> (); //can also use LinkedBlockingDeque or ConcurrentLinkedDeque or ...
			que.add("One");
			que.add("Two");
			que.add("Three");
			que.add("Four");
			que.add("Five");
			que.add("Six");
			que.add("Seven");
			que.add("Eight");
			que.offer("Nine"); //same as add, except it returns false if capacity full. add throws exception in such case. 
			System.out.println("Original Queue is: " + que);
			
			System.out.println("\nPeek of queue is: "+ que.peek());
						
			que.remove(); // throws exception if list is empty
			System.out.println("\nAfter Removing: "+ que);
			que.poll(); //same as remove. except it returns null if queue is empty
			System.out.println("After polling: "+ que);
			
			que.remove("Eight");
			System.out.println("\nAfter Removing Eight: "+ que);
			System.out.println("\nPeek is: "+ que.peek());
			
			int size = que.size(); 
	        System.out.println("\nSize of the Queue = " + size); 
	  
	        System.out.println("\nDoes the List contains 'Four': " + que.contains("Four"));
	        System.out.println("Does the List contains 'Ten': " + que.contains("Ten"));
	        
	        System.out.println("Using For: ");
	        for (String str : que) {
	        	System.out.print("\t" + str);
	        }
	        
	        System.out.println("\nUsing ForEach: ");
	        que.forEach(item->System.out.print("\t" + item));
	        
	        System.out.println("\nUsing Iterator: ");
	        Iterator it = (Iterator) que.iterator();
	        while (it.hasNext()){
	        	System.out.print("\t" + it.next());
	        }        
	}
}
