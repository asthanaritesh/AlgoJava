package collect;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Vector;

import javafx.util.Pair;

public class VectorTest {
	public static void main (String[] args) {
		Vector<String> vObj = new Vector<String>(); // // Same as ArrayList but synchronized, hence slower
		vObj.add("One");
		vObj.add("Three");
		vObj.add("Four");
		vObj.addElement("Five"); // addElement is same as add() but synchronized.
		vObj.add(1, "Two");
		System.out.println("Original Vector is: "+ vObj);
		
        System.out.println("\nThree is in the vector: " +  vObj.contains("Three"));
        System.out.println("Hundred is in the vector: " +  vObj.contains("Hundred"));
        
		String removed = vObj.remove(0);
		System.out.println("\nRemoved: "+ removed);
		System.out.println("After removed, vector is: "+ vObj);
		
		System.out.println("Index of Five is: "+ vObj.indexOf("Five"));
        
		Vector<String> vObjAux = new Vector<String>();
		vObjAux.add("Eleven");
		vObjAux.add("Twelve");
		System.out.println("\nAuxilliary stack is: "+ vObjAux);
		vObj.addAll(vObjAux);
		System.out.println("After Adding Aux, Vector becomes: "+ vObj);
		
        System.out.println("\nUsing For: ");
        for (String str : vObj) {
        	System.out.print("\t" + str);
        }
        
        System.out.println("\nUsing ForEach: ");
        vObj.forEach(item->System.out.print("\t" + item));
        
        System.out.println("\nUsing Iterator: ");
        Iterator it = (Iterator) vObj.iterator();
        while (it.hasNext()){
        	System.out.print("\t" + it.next());
        }
        
        System.out.println("\nUsing Enumeration: ");
        Enumeration en = vObj.elements();
        while(en.hasMoreElements()) {
        	System.out.print("\t" + en.nextElement());
        }
        
		Vector<String> vObj1 = new Vector<String>();
		vObj1.add("Three");
		vObj1.add("Two");
		vObj1.add("Four");
		vObj1.add("Five");
		vObj1.add("Eleven");
		vObj1.add("Twelve");
		System.out.println("\n\nAnother Vector is: "+ vObj1);
		System.out.println("Are two Vectors equal: " + vObj.equals(vObj1));
		
		System.out.println("\nHashcode of vObj: " + vObj.hashCode());
		System.out.println("Hashcode of vObj1: " + vObj1.hashCode());
		
		System.out.println("\nSize: "+ vObj.size());
		System.out.println("Capacity: "+ vObj.capacity());
		
		Vector<Pair<String, Integer>> vObj2 = new Vector<Pair<String, Integer>>();
		Pair<String, Integer> tuple= new Pair<String, Integer> ("A", 1);
		vObj2.add(tuple);
		tuple= new Pair<String, Integer> ("B", 2);
		vObj2.add(tuple);
		System.out.println("\nPair's Vector is: "+ vObj2);
		Pair<String, Integer> tuple0 = vObj2.get(0);
		System.out.println("key of first pair is: "+ tuple0.getKey() + "\tValue of first pair is: " + tuple0.getValue());
	}
}
