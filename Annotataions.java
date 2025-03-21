package Advanced_java;

class Parent { // creating the parent class
	void showintheclass() { // creating method for parent class
		System.out.println("In A show");
	}
}

@Deprecated // it's indicate the class will be unusable in future
class Child extends Parent {// creating the child class

	void showintheclass() { // creating method for child class
		System.out.println("In B show");
	}

	/*@Override // it will detect the code and throw the warning message || It will throw the compile time and it will not affect the code.
				
	void showinthclass() {// it should over ride but purposely created the method with name mismatch || it will print the parent class method
							
		System.out.println("In B show");
	}*/
}

public class Annotataions {
	public static void main(String[] args) {
		Child obj = new Child();  // creating the object for child class
		obj.showintheclass();
	}

}
