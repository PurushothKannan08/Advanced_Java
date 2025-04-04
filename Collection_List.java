package Advanced_java;

import java.util.*;

/*//ArrayList
public class Collection_List{

	public static void main(String[] args) {
		//ArrayList<Integer> al = new ArrayList<Integer>(); //creating the object for array list|| it's generic type
		ArrayList al = new ArrayList();  //creating the object for arrarylist
		//List al = new ArrayList();  //creating the object for arrarylist with reference of List interface
		al.add(2);   // to add the value
		al.add(3);
		al.add(3);
		al.add("Hello");
		al.add(33);
		al.add(5);
		al.add("Hello Coder");
		al.add(22);// to add the value
		al.addFirst("first");  // to add the first element of the arraylist
		al.addLast("Last");  // to add the Last element of the arraylist
		System.out.println(al); // print the arrayvalue
		System.out.println(al.get(2));  // To fetch the given index number
		al.set(1, 45);    // to set the value in index and old value will be overrided
		System.out.println(al);
		System.out.println("contains given value is :" + al.contains(4));  // Check the given value is present or not || it will return boolean value
		System.out.println("is the array is empty : " +al.isEmpty());   // Check the given array is empty or not || it will return boolean value
		System.out.println("the value of given index : " + al.indexOf(33));  // to fetch the index number for the given value
		al.remove(2);  // to remove the given index number
		System.out.println(al);
		
	// to traversing the array and fetching the value - Iterator interface
		Iterator <Integer> ok =al.iterator();   // create the object and invoke the method
		while(ok.hasNext()) {
			System.out.println(ok.next()+" ");
		}
		ArrayList al1 = new ArrayList();    // creating object for arraylist
		al1.add("copy");   // add the value
		al1.add(87);
		al1.add("copy");   // add the duplicate value
		al1.addAll(al);   // it's like copy from the list and paste here 
		System.out.println(al1.indexOf("copy"));
		System.out.println(al1.lastIndexOf("copy"));
		System.out.println("add all : "+al1);
		al1.removeAll(al);  // it will remove the values from the given object values
		al1.addAll(0, al);
		System.out.println("add all index based :  "+al1);
		
		al1.clear();   // it will clear all the values
		System.out.println(al1);
		
	}
}*/

//Linked List
public class Collection_List{

	public static void main(String[] args) {
		//ArrayList<Integer> al = new ArrayList<Integer>(); //creating the object for array list|| it's generic type
		LinkedList al = new LinkedList();  //creating the object for arrarylist
		//List al = new ArrayList();  //creating the object for arrarylist with reference of List interface
		al.add(2);   // to add the value
		al.add(3);
		al.add(3);
		al.add("Hello");
		al.add(33);
		al.add(5);
		al.add("Hello Coder");
		al.add(22);// to add the value
		al.addFirst("first");  // to add the first element of the arraylist
		al.addLast("Last");  // to add the Last element of the arraylist
		System.out.println(al); // print the arrayvalue
		System.out.println(al.get(2));  // To fetch the given index number
		al.set(1, 45);    // to set the value in index and old value will be overrided
		System.out.println(al);
		System.out.println("contains given value is :" + al.contains(4));  // Check the given value is present or not || it will return boolean value
		System.out.println("is the array is empty : " +al.isEmpty());   // Check the given array is empty or not || it will return boolean value
		System.out.println("the value of given index : " + al.indexOf(33));  // to fetch the index number for the given value
		al.remove(2);  // to remove the given index number
		System.out.println(al);
		
	// to traversing the array and fetching the value - Iterator interface
		Iterator <Integer> ok =al.iterator();   // create the object and invoke the method
		while(ok.hasNext()) {
			System.out.println(ok.next()+" ");
		}
		LinkedList al1 = new LinkedList();    // creating object for arraylist
		al1.add("copy");   // add the value
		al1.add(87);
		al1.add("copy");   // add the duplicate value
		al1.addAll(al);   // it's like copy from the list and paste here 
		System.out.println("add all : "+al1); 
		System.out.println(al1.indexOf("copy"));  //return the index number
		System.out.println(al1.lastIndexOf("copy"));//return the index number of last occurrence value
		al1.removeAll(al);  // it will remove the values from the given object values
		al1.addAll(0, al);  // add the list(object) with respect to index number
		System.out.println("add all index based :  "+al1);
		System.out.println("peek first :" +al1.peekFirst());// to retrieve or fetch First value
		System.out.println("peek Last : " +al1.peekLast()); // to retrieve or fetch Last value
		System.out.println(al1);  // print the value of list
		System.out.println("poll first :" +al1.pollFirst());// to retrieve or fetch First value ,post that will remove from the list 
		System.out.println("poll Last : " +al1.pollLast());// to retrieve or fetch Last value ,post that will remove from the list 
		System.out.println(al1);// print the value of list
		
//		// print the values through for each method with lambda expression
//		System.out.println("print the values through for each method with lambda expression");
//		al1.forEach(k->System.out.print(k+" "));
//		System.out.println();
		
//		 //print the values through enhance for loop
//		System.out.println("print the values through enhance for loop");
//		for(Object k :al1) {
//			System.out.print(k +" ");
//		}
//		System.out.println();
		
		Iterator k = al1.iterator();
		while(k.hasNext()) {
			System.out.print(k.next()+" ");
		}
		System.out.println();
		al1.clear();   // it will clear all the values
		System.out.println(al1);
		
	}

	

}

