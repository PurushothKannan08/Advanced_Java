package Advanced_java;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.TreeSet;

/*//HashSet - duplicate value not allowed ,not following the insertion order
public class Collection_Set {

	public static void main(String[] args) {
		//HashSet Hs = new HashSet();  //creating the object for Hashset
		Set Hs = new HashSet();  //creating the object for Hashset with reference of set interface
		Hs.add(2);   // add the int value
		Hs.add(3);
		Hs.add(3);//duplicate int value
		Hs.add("Hello");  // add the string 
		Hs.add(33);
		Hs.add(5);
		Hs.add("Hello Coder");
		Hs.add(22);// to add the value
		System.out.println(Hs);	
		System.out.println(Hs.contains("Hello")); 
	// to traversing the array and fetching the value - Iterator interface
		Iterator ok =Hs.iterator();   // create the object and invoke the method
		while(ok.hasNext()) {
			System.out.print(ok.next()+" ");
		}
		System.out.println();
		HashSet Hs1 = new HashSet();
		Hs1.add(3);//duplicate 
		Hs1.add(4);
		Hs1.addAll(Hs);
		System.out.println(Hs1);
		System.out.println(Hs1.contains(5));
		Hs1.remove(3);
		System.out.println(Hs1);
		Hs1.removeAll(Hs);
		System.out.println(Hs1);
	
	}
}*/

/*//LinkedHashSet - duplicate value not allowed ,following the insertion order
public class Collection_Set {

	public static void main(String[] args) {
		//LinkedHashSet Hs = new LinkedHashSet();  //creating the object for LinkedHashSet
		Set Hs = new LinkedHashSet();  //creating the object for LinkedHashSet with reference of Set interface
		Hs.add(2);   // add the int value
		Hs.add(3);
		Hs.add(3);//duplicate int value
		Hs.add("Hello");  // add the string 
		Hs.add(33);
		Hs.add(5);
		Hs.add("Hello_Coder");
		Hs.add(22);// to add the value
		System.out.println(Hs);	
		System.out.println(Hs.contains("Hello")); 
	// to traversing the array and fetching the value - Iterator interface
		Iterator ok =Hs.iterator();   // create the object and invoke the method
		while(ok.hasNext()) {
			System.out.print(ok.next()+" ");
		}
		System.out.println();
		Set Hs1 = new LinkedHashSet();
		Hs1.add(3);//duplicate 
		Hs1.add(44);
		Hs1.addAll(Hs);
		System.out.println(Hs1);
		System.out.println(Hs1.contains(5));
		Hs1.remove(3);
		System.out.println(Hs1);
		Hs1.removeAll(Hs);
		System.out.println(Hs1);
	
	}

}*/


 //TreeSet - duplicate value not allowed ,Natural sorting order
public class Collection_Set {

	public static void main(String[] args) {
		//TreeSet ts = new TreeSet();  //creating the object for Treetset
		Set ts = new TreeSet();  //creating the object for Treeset with reference of set interface
		ts.add(3);
		ts.add(3);//duplicate int value
	//	ts.add("Hello");  // add the string 
		ts.add(33);
		ts.add(5);
		//ts.add("Hello_Coder");
		ts.add(22);// to add the value
		System.out.println(ts);	
		//System.out.println(ts.contains("Hello")); 
	// to traversing the array and fetching the value - Iterator interface
		Iterator ok =ts.iterator();   // create the object and invoke the method
		while(ok.hasNext()) {
			System.out.print(ok.next()+" ");
		}
		System.out.println();
		TreeSet ts1 = new TreeSet();  // create the object for Ts1 treeset.
		ts1.add(3);//duplicate value
		ts1.add(44); // add the value
		ts1.add(11); // add the value
		ts1.addAll(ts);  // add all the element from ts
		System.out.println(ts1);
		System.out.println("first element " +ts1.first());  // it will print first element
		System.out.println("Last element " + ts1.last());  // print the last element
		System.out.println("Headset values : "+ts1.headSet(20)); // fetch the lesser than value of given value
		System.out.println("Tailset values : "+ts1.tailSet(21)); // fetch the lesser than value of given value
		System.out.println(ts1.pollFirst());  // fetch the first element and delete from the Source
		System.out.println(ts1.pollLast());  // fetch the Last element and delete from the source
		System.out.println(ts1);
		System.out.println(ts1.contains(5));  // check the conditions|| return type is boolean
		ts1.remove(3);  // remove the value 
		System.out.println(ts1);
		
		//fetch the value through for each method with lambda expression
//		System.out.println("printing the value through for each method " );
//		ts1.forEach(k-> System.out.print(k+" "));
//		System.out.println();
		
		//fetch the value through through Enhance for Loop"
//		System.out.println("printing the value through Enhance for Loop" );
//		for(Object k :ts1) {
//			System.out.print(k +" ");
//		}
//		System.out.println();
		
		////fetch the value through through Iterator"
		System.out.println("printing the value through Iterator" );
		Iterator it = ts1.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		
		ts1.removeAll(ts); // remove all the element from ts1
		System.out.println(ts1);
		ts1.clear();  // it will remove all the element
		System.out.println(ts1);
		
		
	
	}

}
