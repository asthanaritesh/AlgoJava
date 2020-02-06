package collect;

import java.util.Iterator;
import java.util.ArrayList;
import java.util.Enumeration;

import javafx.util.Pair;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<String> arrList = new ArrayList<String>(); // Same as vector but not synchronized, hence faster
		arrList.add("One");
		arrList.add("Three");
		arrList.add("Four");
		arrList.add("Five");
		arrList.add(1, "Two");
		System.out.println("Original ArrayList is: "+ arrList);
		
        System.out.println("\nThree is in the vector: " +  arrList.contains("Three"));
        System.out.println("Hundred is in the vector: " +  arrList.contains("Hundred"));
        
		String removed = arrList.remove(0);
		System.out.println("\nRemoved: "+ removed);
		System.out.println("After removed, vector is: "+ arrList);
		
		System.out.println("Index of Five is: "+ arrList.indexOf("Five"));
        
		ArrayList<String> arrListAux = new ArrayList<String>();
		arrListAux.add("Eleven");
		arrListAux.add("Twelve");
		System.out.println("\nAuxilliary stack is: "+ arrListAux);
		arrList.addAll(arrListAux);
		System.out.println("After Adding Aux, ArrayList becomes: "+ arrList);
		
        System.out.println("\nUsing For: ");
        for (String str : arrList) {
        	System.out.print("\t" + str);
        }
        
        System.out.println("\nUsing ForEach: ");
        arrList.forEach(item->System.out.print("\t" + item));
        
        System.out.println("\nUsing Iterator: ");
        Iterator it = (Iterator) arrList.iterator();
        while (it.hasNext()){
        	System.out.print("\t" + it.next());
        }
        
		ArrayList<String> arrList1 = new ArrayList<String>();
		arrList1.add("Three");
		arrList1.add("Two");
		arrList1.add("Four");
		arrList1.add("Five");
		arrList1.add("Eleven");
		arrList1.add("Twelve");
		System.out.println("\n\nAnother ArrayList is: "+ arrList1);
		System.out.println("Are two ArrayLists equal: " + arrList.equals(arrList1));
//		arrList1.sort
		System.out.println("\nHashcode of vObj: " + arrList.hashCode());
		System.out.println("Hashcode of vObj1: " + arrList1.hashCode());
		
		System.out.println("\nSize: "+ arrList.size());
		
		ArrayList<Pair<String, Integer>> vObj2 = new ArrayList<Pair<String, Integer>>();
		Pair<String, Integer> tuple= new Pair<String, Integer> ("A", 1);
		vObj2.add(tuple);
		tuple= new Pair<String, Integer> ("B", 2);
		vObj2.add(tuple);
		System.out.println("\nPair's ArrayList is: "+ vObj2);
		Pair<String, Integer> tuple0 = vObj2.get(0);
		System.out.println("key of first pair is: "+ tuple0.getKey() + "\tValue of first pair is: " + tuple0.getValue());
	}

}
