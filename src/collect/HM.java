package collect;

import java.io.*;
import java.util.*;
import java.lang.*;

public class HM {
//	public HM(){};
	public static void main(String[] args)
	{
		Map<String, Integer> hm_si1= new HashMap<String, Integer>(){{ put("afhg",1); put("kjsb",2); }};
		Map<String, Integer> hm_si= new HashMap<String, Integer>();
		hm_si.put("ritesh", 1);
		hm_si.put("aakash", 15);
		hm_si.put("tarun", 3);
		hm_si.put("bob", 8);
		hm_si.put("sanjay", 5);
		hm_si.put("ritesh", 25);
		
		Set key_set = hm_si.keySet();		
		System.out.print("key_set is: ");
		System.out.println(key_set);
		
		Set ent_set = hm_si.entrySet();
		System.out.print("entry_set is: ");
		System.out.println(ent_set);
		
		
	}
}
