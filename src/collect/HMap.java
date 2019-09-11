package collect;

import java.io.*;
import java.util.*;
import java.util.Map.Entry;
import java.lang.*;

public class HMap {
	public static void main(String[] args)
	{
		//Map<String, Integer> hm_si1= new HashMap<String, Integer>(){{ put("afhg",1); put("kjsb",2); }};
		Map<String, Integer> hm_si= new HashMap<String, Integer>();
		hm_si.put("ritesh", 1);
		hm_si.put("aakash", 15);
		hm_si.put("tarun", 3);
		hm_si.put("bob", 8);
		hm_si.put("sanjay", 5);
		hm_si.put("ritesh", 25);
		
		int bob = hm_si.get("bob");
		System.out.println("\nbob value is: "+ bob);
		
		hm_si.remove("bob");
		System.out.println("\nAfter Removing Bob, Now HashMap is: "+ hm_si);
		
		Set key_set = hm_si.keySet();  //perfect thing to do here is parametrized set: Set<String> key_set = hm_si.keySet();	
		System.out.println("key_set is: "+ key_set);
		
		System.out.println("\nUsing iterator on keyset:");
		Iterator it_ks = key_set.iterator();  //perfect thing to do here is parametrized Iterator: Iterator<String> it_ks = hm_si.keySet();
		while (it_ks.hasNext()) {
			String str = (String)it_ks.next();
			System.out.println(str);
		}
		
		Set<Entry<String,Integer>> ent_set = hm_si.entrySet(); //Can also just use Set ent_set = ..., but then we will need to cast during forEach.
		System.out.println("\nentry_set is: "+ ent_set);
		
		System.out.println("\nUsing For Loop on entryset:");
		for (Entry item : ent_set) {
			System.out.print("Key is: "+ item.getKey());
			System.out.println(", Value is: "+ item.getValue());
		}
		
        System.out.println("\nUsing ForEach: ");
        ent_set.forEach(item->System.out.print("\t" + item.getKey()));
		
		System.out.println("\nUsing iterator on entryset:");
		Iterator it_es = ent_set.iterator();
		while (it_es.hasNext()) {
			Map.Entry entry = (Map.Entry)it_es.next();
			//System.out.println(entry);
			System.out.print("Key is: "+ entry.getKey());
			System.out.println(", Value is: "+ entry.getValue());
		} 

	}
}
