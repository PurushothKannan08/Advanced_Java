package Advanced_java;

import Advanced_java.Innerclass.Innerclass2;


/*//1.Member Inner class
public class Anonymous_innerclass { //outer class
	private int data = 30; // declare the private variable
	public void laptop1() { // outer method
		System.out.println("In Laptop from outer class");
	}
	public class innerclaass1{ //inner class
		public void show() { // inner class method
			System.out.println("In show "+ data); // Accessing the private variable
		}		
	}
	public static void main(String args[]) {
		Anonymous_innerclass obj= new Anonymous_innerclass(); // creating object for outer class
		Anonymous_innerclass.innerclaass1 obj1 = obj.new innerclaass1();// creating object for inner class belongs to the outer class
		obj1.show();// calling the innerclass method
		obj.laptop1(); // calling outside method
	}
	}*/

/*//2.Anonymous inner class
public abstract class Anonymous_innerclass { // creating abstract class
	public abstract void laptop(); // declare abstract method
	
	public static void main(String args[]) {
		Innerclass obj = new Innerclass() {// creating object 
			public void laptop() { // inner class creating and implementing
				System.out.println("In laptop from Anonymous inner class");
			}
		};
		obj.laptop();// calling the method 
	}
}*/

/*//3.local Inner class
public class Anonymous_innerclass { // outer class
	private int data = 30; // declare the private variable

	public void laptop1() { // local method
		class innerclaass1 { // inner class inside the method
			public void show() { // inner class method
				System.out.println("In show " + data); // Accessing the private variable
			}
		}
		innerclaass1 obj1 = new innerclaass1(); // creating the object for inner class within method
		obj1.show();//calling the method
	}

	public static void main(String args[]) {
		Anonymous_innerclass obj = new Anonymous_innerclass(); // creating object for outer class
		obj.laptop1(); // calling method
	}
}*/


//4.Static Inner class
public class Anonymous_innerclass { //outer class
	private static int data = 30; // declare the private static variable
	public void laptop1() { // outer method
		System.out.println("In Laptop from outer class");
	}
	   static class innerclaass1{ //static inner class
		public void show() { // inner class method
			System.out.println("In show "+ data); // Accessing the private static variable
		}		
	}
	public static void main(String args[]) {
		Anonymous_innerclass.innerclaass1 obj1 = new Anonymous_innerclass.innerclaass1();// creating object for inner class belongs to outer class
		obj1.show();// calling the innerclass method
		Anonymous_innerclass obj = new Anonymous_innerclass(); // creating the object for outer class
		obj.laptop1(); // calling outer class method.
	}
	}

