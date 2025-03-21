package Advanced_java;

public class Innerclass { // outer class
	public void laptop() { // outer method
		System.out.println("In Laptop from outer class");
	}

	class Innerclass2 { // inner class
		public void laptop() { // inner method
			System.out.println("In laptop from inner class");
		}
	}
	public static void main(String args[]) {
		Innerclass obj = new Innerclass(); // creating object for outer class
		obj.laptop(); // calling outer class method
		Innerclass2 obj1 = obj.new Innerclass2(); // creating object for inner class || inner class belongs to outer class
		obj1.laptop();// calling inner class method
	}

}
