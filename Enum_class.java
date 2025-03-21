package Advanced_java;

/*enum Enum_class{ // creating the Enum class
	Pass,Fail,PasswithDistinction ; // declare the constant values || ; is optional
}*/
/*//Enum class implementation
public class Enum_example {
	public static void main(String args[]) {
	Enum_class k = Enum_class.Pass;  // refer the Enum_class class and invoke the values
	System.out.println(k);
	System.out.println(k.ordinal());//to fetch the index value from given the constant values
	for(Enum_class s :Enum_class.values()) { // to fetch the all values through enhance for loop || values store in Array
		System.out.println(s+" : " + s.ordinal()); // print the values with the index number
	}

}
}*/

/*//Enum with If &else statement
public class Enum_example {
	public static void main(String args[]) {
		Enum_class k = Enum_class.Pass; // refer the Enum_class class and invoke the values
		if (k == Enum_class.Pass) { // to check the conditions
			System.out.println("Good and try for distinction");
		}
		else if (k == Enum_class.Fail) {
			System.out.println("Keep learning to acheive pass");}
		else {
			System.out.println("Congrats");{
			}
			}
	}
}
*/

/*//Enum with Swtich statement
public class Enum_example {
	public static void main(String args[]) {
		Enum_class k = Enum_class.PasswithDistinction; // refer the Enum_class class and invoke the values
		switch (k) { // pass the variable into the Switch method
		case Pass:   // To check the conditions
			System.out.println("Good and try for distinction");
		break;  // To break the block after the code executions if the block is true
		case Fail: // To check the conditions
			System.out.println("Keep learning to achieve pass");
		break;// To break the block after the code executions if the block is true
		default:  // default means if the above conditions are not comes.
			System.out.println("Congrats");
			//break;// To break the block after the code executions if the block is true || it's optional
	}
}
}*/

enum Enum_class {
	Laptop(2000), phone(3500), watch(1500), headset(1200), charger(); // declare the constant
    private int price;  // declare the price for creating the getters and setters.

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	Enum_class() {  // default constructor
		this.price = 200;
	}

	private Enum_class(int price) { //Parameterized constructor
		this.price = price;
	}

	public static void main(String args[]) {
		// Enum_class k = Enum_class.phone;
		// System.out.println(k + " " + k.getPrice());
		for (Enum_class k : Enum_class.values()) {   // to fetch the value through for each loop and values method
			System.out.println(k + ":" + k.getPrice());
		}
	}

}


	

	
