package Advanced_java;

public class AbstractMethod extends AbstractClass { // Child class

	public void checkingMethod() { // implementation for the abstract method
		System.out.println("Abstract method implementation");
	}

	public void innermemthod() { // Inner method || child class method
		System.out.println("instance method from child class");
	
	}

	public static void main(String[] args) {
		AbstractClass l = new AbstractMethod(); // creating object for child class with reference of parent class
		l.checkingMethod(); // calling parent class abstract method
		l.check();// calling parent class normal method
		AbstractMethod k= new AbstractMethod(); //creating object for child class with reference of child class
		//AbstractMethod k = (AbstractMethod) l; // already created object for child class with reference of parent class so we typecasting(downcasting)the child class. 
		k.innermemthod(); //calling child class  method
	}

}
