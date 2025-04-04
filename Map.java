package Advanced_java;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

/*public class Map {

	  // insertion order not follow 
	public static void main(String[] args) {
		HashMap<Integer,String> hm = new HashMap<>();
		hm.put(0, "Hi");   // Add the element
		hm.put(2, "hello");
		hm.put(4, "Good afternoon");
		hm.put(1, "Hey");
		hm.put(5, "Good evening");
		hm.put(3, "Good morning");
		System.out.println("The size of " +hm.size());// to check the size
		System.out.println("the key is : " +hm.keySet());  // to fetch all the key 
		System.out.println("the value is " +hm.values()); // To fetch all the values
		System.out.println("fetch the element " +hm.get(3));  // to fetch the values with respect to the given key values
		System.out.println("Check the array is empty " + hm.isEmpty());  // to check the array is empty or not?
		System.out.println(hm.replace(2," ok"));  // to update the values
		System.out.println(hm.entrySet());  // To fetch all the entry key values
		System.out.println(hm);  // print the all values
	
		
		// To fetch the values only
//		for(String k :hm.values()) {
//			System.out.println(k);
//		}
		
		
	 // To fetch the Key only
//		for(Integer k : hm.keySet()) {
//			System.out.println(k);
//		}
		
		// To fetch the entries through enhance for loop
	  for(Entry<Integer,String> k :hm.entrySet()) {
		  System.out.println(k);
	  }
		
	  // For each loop with Lambda expression
	  hm.forEach((k,v) -> System.out.println("key is "+k +" value is "+v));
	  }
}*/

/*   // insertion order follow and it allows duplicate value not an key
public class Map {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> hm = new LinkedHashMap<>();
		hm.put(0, "Hi");   // Add the element
		hm.put(2, "hello");
		hm.put(4, "Good afternoon");
		hm.put(1, "Hey");
		hm.put(5, "Good evening");
		hm.put(3, "Good morning");
		//System.out.println(hm.pollFirstEntry());// fetch the first element and delete from the source
		//System.out.println(hm.pollLastEntry());// fetch the Last element and delete from the source
		System.out.println("The size of " +hm.size());// to check the size
		System.out.println("the key is : " +hm.keySet());  // to fetch all the key 
		System.out.println("the value is " +hm.values()); // To fetch all the values
		System.out.println("fetch the element is " +hm.get(3));  // to fetch the values with respect to the given key values
		System.out.println("Check the array Size is empty " + hm.isEmpty());  // to check the array is empty or not?
		System.out.println(hm.replace(2," ok"));  // to update the values
		System.out.println(hm.entrySet());  // To fetch all the entry key values
		System.out.println(hm);  // print the all values
	
		// To fetch the entry through enhance for loop
		  for(Entry<Integer,String> k :hm.entrySet()) {
			  System.out.println(k);
		  }
	  }	
		
	}*/

// insertion order follow and it allows duplicate value not an key
public class Map {

	public static void main(String[] args) {
		TreeMap<Integer, String> hm = new TreeMap<>();
		hm.put(0, "Hi"); // Add the element
		hm.put(2, "hello");
		hm.put(4, "Good afternoon");
		hm.put(1, "Hey");
		hm.put(5, "Good evening");
		hm.put(3, "Good morning");
		// System.out.println(hm.pollFirstEntry());// fetch the first element and delete
		// from the source
		// System.out.println(hm.pollLastEntry());// fetch the Last element and delete
		// from the source
		System.out.println("The size of " + hm.size());// to check the size
		System.out.println("the key is : " + hm.keySet()); // to fetch all the key
		System.out.println("the value is " + hm.values()); // To fetch all the values
		System.out.println("fetch the element is " + hm.get(3)); // to fetch the values with respect to the given key
																	// values
		System.out.println("check the array Size is empty " + hm.isEmpty()); // to check the array is empty or not?
		System.out.println(hm.replace(2, " ok")); // to update the values
		System.out.println(hm.entrySet()); // To fetch all the entry key values
		System.out.println(hm); // print the all values

			/*// To fetch the entry through  for each method with lambda expression
			hm.forEach( (k,v)-> 
			  System.out.println(k+" "+v));
			  */

			/*// To fetch the entry through enhance for loop
			  for(Entry<Integer,String> k :hm.entrySet()) {
				  System.out.println(k);  
			  }*/

		
	/*//To fetch the all entries
	  Iterator<Entry<Integer,String>> k = hm.entrySet()
			                             .iterator();
	     while(k.hasNext()) {
	    	 System.out.print(k.next() +" ");
		  
				
			}*/
	     
	     
			/*// To fetch the Key 
			Iterator<Integer> k = hm.keySet().iterator();
			while (k.hasNext()) {
				
				System.out.println("key value is " + k.next());

			}*/

		
		//To Fetch the key and value pair using the iterator 
		Iterator<Entry<Integer, String>> k = hm.entrySet().iterator();
		while (k.hasNext()) {
			Entry<Integer, String> love = k.next();
			System.out.println(love.getKey() + " " + love.getValue());

		}

	}

}
