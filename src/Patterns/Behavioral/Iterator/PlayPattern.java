package Patterns.Behavioral.Iterator;

public class PlayPattern {
	public static void main(String[] args) {
		CollectionNames namesRepository = new CollectionNames();
	      for(Iterator iter = namesRepository.getIterator(); iter.hasNext();){
	         String name = (String)iter.next();
	         System.out.println("Name : " + name);
	      } 
	}

}
