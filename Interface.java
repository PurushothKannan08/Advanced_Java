package Advanced_java;

  // interface is same as abstract class - it should have only one abstract method
  // interface default method is public abstract 
  // interface Variable type is final and static as a default.
  // to achieve the abstraction and multilevel inheritance by using the interface

/*//1.Interface  (single inheritance) - normal way
interface A{ // creating interface for A || it's same as a class   || parent class
	int age = 30; // inside of interface Variable is final and static as a default.
	 void check(); //inside of interface method  is public abstract as a default.
	 
}

class C implements A{  // using the Implements keyword for inherit the interface A only || child class
	public void check() {
		System.out.println("Implementing the abstract method for interface A");		
	}
}

public class Interface {

	public static void main(String[] args) {
		C obj = new C(); // creating the object for child class 
		obj.check();  // Call the check method
		//obj.age = 25;  // we can not change the value because interface variable have final and static as a default.
		System.out.println(obj.age); // print the parent class variable
		
	}

}*/


/*//2.Interface  (single inheritance) - Anonymous class or functional interface
interface A { // creating interface for A || it's same as a class || parent class
	int age = 30; // inside of interface Variable is final and static as a default.

	void check(); // inside of interface method is public abstract as a default.
}

public class Interface {

	public static void main(String[] args) {
		A obj = new A() {  //unable to instantiate the class but using innercalss to achieve the instantiated the abstract class
							// to achieve
			public void check() {// inner class creating and implementing
				System.out.println("Implementing the abstract method for interface A");
			}
		};  // use the semi-colon  mandatory
		obj.check(); // Call the check method
		// obj.age = 25; // we can not change the value because interface variable have
		// final and static as a default.
		System.out.println(obj.age); // print the parent class variable
	}
}*/


/*//3.Interface  (multilevel inheritance) - normal way
interface A{ // creating interface for A || it's same as a class
	int age1 = 30; // inside of interface Variable is final and static as a default.
	 void check(); //inside of interface method  is public abstract as a default.|| declare the method
	 
}
interface B{ // creating interface for B || it's same as a class
	int age2 = 40; // inside of interface Variable is final and static as a default.
	 void Show(); //inside of interface method  is public abstract as a default.|| declare the method
	 
}
class D implements A,B{  // inherit the interface A and B || achieve the multiple inheritance
	public void Show() {  // implement the method for B interface
		System.out.println("Implementing the show abstract method for interface B");	
	}
	public void check() { // implement the method for A interface
		System.out.println("Implementing the check abstract method for interface A");		
	}
}
public class Interface {

	public static void main(String[] args) {
		D obj = new D();  // creating object for D class || because interface class can not be instantiated.
		obj.check();  // calling the method for interface A 
		obj.Show();  // calling the method for interface B
		System.out.println("the age for interface A " + obj.age1); //print the variable value for interface A
		System.out.println("the age for interface B " +obj.age2); //print the variable value for interface b
	}

}*/

//4.Interface  (multilevel inheritance)- Anonymous class or functional interface
interface A{ // creating interface for A || it's same as a class
	int age1 = 30; // inside of interface Variable is final and static as a default.
	 void check(); //inside of interface method  is public abstract as a default.|| declare the method
	 
}
interface B{ // creating interface for B || it's same as a class
	int age2 = 40; // inside of interface Variable is final and static as a default.
	 void Show(); //inside of interface method  is public abstract as a default.|| declare the method
	 
}
interface F extends A,B{  // creating interface for F and inherit the both interface by using the extends keyword
	
}

public class Interface {

	public static void main(String[] args) {
		F obj = new F() { // creating the object for F interface || unable to instantiate the class but using innercalss to achieve the instantiated the abstract class
			
			public void Show() {  // implement the method for B interface
				System.out.println("Implementing the show abstract method for interface B");	
			}
			public void check() { // implement the method for A interface
				System.out.println("Implementing the check abstract method for interface A");		
			}
			
		}; 
		
		obj.check();  // calling the method for interface A 
		obj.Show();  // calling the method for interface B
		System.out.println("the age for interface A " + obj.age1); //print the variable value for interface A
		System.out.println("the age for interface B " +obj.age2); //print the variable value for interface b
	}

}

