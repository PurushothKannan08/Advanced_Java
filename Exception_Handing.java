package Advanced_java;

import java.util.Scanner;

public class Exception_Handing {
     /*// try catch exception
	public static void main(String[] args) {
	int a =9;   // declaring the value
	int b = 2;  // declaring the value 
	int c=0;   //declaring the value
	try {
	c =a/b;  // if the b value is 0 it will throw error so we will put it in Try block
	}
	catch(ArithmeticException s) {   // to catch the exception by using object
		System.out.println("please check the divisor" +s);   // s-object will print the exact exception.
	}
	
	System.out.println(c+ " ");  // print the C value . 
	
	}

}*/
	
	 /*// try - multiple catch exception   || only one exception handle from the try block
		public static void main(String[] args) {
		int a =9;   // declaring the value
		int b = 0;  // declaring the value 
		int c=0;   //declaring the value
		int arr[] = new int [5];  // array length the 5 which mean only store 5 element
		String check =null; // check value is null
	
		 try {
		c =a/b;  // if the b value is 0 it will throw error so we will put it in Try block
		System.out.println(arr[0]);//it will fetch the 1 element
		System.out.println(arr[5]);//it will fetch the 6 element
		System.out.println(check.length());
		
		}
		 catch(ArithmeticException s) {   // to catch the arithmeticexception by using object
			System.out.println("please check the divisor"+s );   // s-object will print the exact exception.
		}
		catch(IndexOutOfBoundsException s) {   // to catch the IndexOutOfBoundsexception by using object
			System.out.println("please check given index number" +s);   // s-object will print the exact exception.
		}
		 
		catch(NullPointerException s) {   // to catch the NullPointerException by using object
			System.out.println("please check the divisor" +s);   // s-object will print the exact exception.
		}
		 
		catch(Exception s) {   //if the above exception catch is not found this catch will handle exception by using object
			System.out.println("something went" +s);   // s-object will print the exact exception.
		}
		 
		System.out.println(c+ " ");  // print the C value . 
		 
		}

	}*/
	

	 /*// Nested try - multiple catch exception   || only one exception handle from the try block
		public static void main(String[] args) {
		int a =9;   // declaring the value
		int b = 2;  // declaring the value 
		int c=0;   //declaring the value
		int arr[] = new int [5];  // array length the 5 which mean only store 5 element
		String check =null; // check value is null
	
		 try {//Grandparent try block
		c =a/b;  // if the b value is 0 it will throw error so we will put it in Try block
		try {//parent try block
		System.out.println(arr[0]);//it will fetch the 1 element
		System.out.println(arr[5]);//it will fetch the 6 element
		try {//child try block
		System.out.println(check.length());
		
		}
		 catch(ArithmeticException s) {   // to catch the arithmeticexception by using object
			System.out.println("please check the divisor"+s );   // s-object will print the exact exception.
		}
		catch(IndexOutOfBoundsException s) {   // to catch the IndexOutOfBoundsexception by using object
			System.out.println("please check given index number" +s);   // s-object will print the exact exception.
		}
		}//child try block end
		catch(NullPointerException s) {   // to catch the NullPointerException by using object
			System.out.println("please check the divisor" +s);   // s-object will print the exact exception.
		}
		}//parent try block end
		catch(Exception s) {   //if the above exception catch is not found this catch will handle exception by using object
			System.out.println("something went" +s);   // s-object will print the exact exception.
		}//grandparent try block end
		 
		System.out.println(c+ " ");  // print the C value . 
		 
		}

	}*/
	
	
	/*//throw keyword
	public static void check(int age) {  //creating the static method for avoid creating object.
		if(age<18) {
			throw new ArithmeticException("Access denied");  // throw the exception , catch will handle it || in constructor we can give the default message
		}
		else {
			System.out.println("Access granted");
		}
	}
	public static void main(String[] args) {
		//Exception_Handing ok =  new Exception_Handing();  // if the non-static method need to create object
		
		try {  //critical statement so we are giving try block
		//ok.check(14); // call the non- static method with help of object .
			check(14); // can directly call to static method without creating object
		}
		catch(Exception e) { // catch will handle if the exception occurs
			System.out.println("into a catch block");
			//e.printStackTrace(); // print the entire error trace
			System.out.println(e);  // print the exception 
		}
		
		System.out.println("Validation are done");
	}
	}*/
	
	
	/*//throw keyword- custom Exception
	class AgecheckException extends Exception { // creating the custom class and inherit the parent class
		public AgecheckException(String s) { // Parameterized constructor
			super(s); // to access the parent class
		}
	}

	public class Exception_Handing {  // need to comments top of the class name if same file have multiple class file
		public static void check(int age) { // creating the static method for avoid creating object.
			if (age < 18) { // chech age validation
				try {

					throw new AgecheckException("Access denied"); // throw the exception , catch will handle it || in
																	// constructor we can give the default message
				} catch (AgecheckException e) { // catch will handle if the exception occurs
					System.out.println("Your age is not valid " + e);
					// e.printStackTrace(); // print the entire error trace
					// System.out.println(e); // print the exception
				}
			} else {
				System.out.println("Access granted");
			}
		}

		public static void main(String[] args) {
			// Exception_Handing ok = new Exception_Handing(); // if the non-static method
			// need to create object

			// critical statement so we are giving try block
			// ok.check(14); // call the non- static method with help of object .
			check(12); // can directly call to static method without creating object

			System.out.println("Validation are done");
		}
	}*/
	
	/*//throws keyword
	public static void check(int age)throws ArithmeticException{ // throws keyword indicate the method may throw the exception
		if(age<18) {
			throw new ArithmeticException("Access denied");  // throw keyword throw the exception , catch will handle it || in constructor we can give the default message
		}
		else {
			System.out.println("Access granted");
		}
		
	}
	public static void main(String[] args) {
		//Exception_Handing ok =  new Exception_Handing();  // if the non-static method need to create object
		
		Scanner sc = new Scanner(System.in);//taking input from user
		System.out.println("enter the age");
		int checking  = sc.nextInt(); // read the input
		
		
		
		try {  //critical statement so we are giving try block
		//ok.check(14); // call the non- static method with help of object .
			check(checking); // can directly call to static method without creating object
		}
		catch(ArithmeticException e) { // catch will handle if the exception occurs
			System.out.println("Chcek the age and Age should be greater than 18");
			//e.printStackTrace(); // print the entire error trace
			System.out.println(e);  // print the exception 
		
		
		
		System.out.println("Validation are done");
	}
	}
}*/
	
	
	/*//throws keyword - multiple exception handing
		public static void check(int age,String name)throws ArithmeticException,NullPointerException{ // throws keyword indicate the method may throw the exception
			if(age<18) {
				throw new ArithmeticException("Access denied for age requirement not met");  // throw keyword throw the exception , catch will handle it || in constructor we can give the default message
			}
			if(name.length()<1) {
				throw new NullPointerException("Access denied for invalid length");  // throw keyword throw the exception , catch will handle it || in constructor we can give the default message
			}
			else {
				System.out.println("Access granted");
			}		
		}
		public static void main(String[] args) {
			//Exception_Handing ok =  new Exception_Handing();  // if the non-static method need to create object
			
			Scanner sc = new Scanner(System.in);//taking input from user
			System.out.println("enter the age");
			int checking  = sc.nextInt(); // read the input
			Scanner sc1 = new Scanner(System.in);//taking input from user
			System.out.println("enter the name");
			String name = sc1.nextLine();
			
			try {  //critical statement so we are giving try block
			//ok.check(14); // call the non- static method with help of object .
				check(checking,name); // can directly call to static method without creating object
				System.out.println("check length" +name.length());
			}
			catch(NullPointerException e) {   // to catch the NullPointerException by using object
				System.out.println("please check the string value " +e);   // s-object will print the exact exception.
			
				}
			
			catch(ArithmeticException e) { // catch will handle if the exception occurs
				System.out.println("Chcek the age and Age should be greater than 18");
				//e.printStackTrace(); // print the entire error trace
				System.out.println(e);  // print the exception 
			System.out.println("Validation are done");
		}
		}
}*/
	
	//try-catch- finally
	public static void main(String[] args) {
	int a =9;   // declaring the value
	int b = 0;  // declaring the value 
	int c=0;   //declaring the value
	try {
	c =a/b;  // if the b value is 0 it will throw error so we will put it in Try block
	}
	catch(ArithmeticException s) {   // to catch the exception by using object
		System.out.println("please check the divisor " +s);   // s-object will print the exact exception.
	}
	finally {
		System.out.println("The code execution is done");
	}
	
	}

}