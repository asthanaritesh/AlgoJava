package collect;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {
	public static void main(String[] args) {
		//HashSet is implemented by HashTable and unordered in nature. Fast. O(1) for insert, delete, contains. Allow null.
		HashSet<String> hs1 = new  HashSet<String>();
		hs1.add("E"); hs1.add("B"); hs1.add("C"); hs1.add("A"); hs1.add("B");
		System.out.println("Original hs1: "+ hs1);
		HashSet<String> hs2 = new  HashSet<String>();
        hs2.add("geeks"); hs2.add("for"); hs2.add("practice"); hs2.add("contribute"); 
		System.out.println("Original hs2: "+ hs2);
		hs2.remove("for");
		System.out.println("After Removal of 'for', Set: "+ hs2);
		System.out.println("Size of hs2 is: " + hs2.size());
		System.out.println("contains geeks?: " + hs2.contains("geeks"));
		
        System.out.println("Using For: ");
        for (String str : hs2) {
        	System.out.print("\t" + str);
        }
        
        System.out.println("\nUsing ForEach: ");
        hs2.forEach(item->System.out.print("\t" + item));
        
        System.out.println("\nUsing Iterator: ");
        Iterator it = (Iterator) hs2.iterator();
        while (it.hasNext()){
        	System.out.print("\t" + it.next());
        }
        
		//TreeSet is implemented by Tree and ordered in nature (defined by Comparable or Comparator). Slow. O(nLog(n)). Does not allow null.
		TreeSet<String> ts1 = new TreeSet<String>();
		ts1.add("geeks"); ts1.add("for"); ts1.add("practice"); ts1.add("contribute");
		System.out.println("\nOriginal TreeSet ts1: "+ ts1);
	}
}
