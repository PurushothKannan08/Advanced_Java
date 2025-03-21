package Advanced_java;

public abstract class AbstractClass {  //Abstract keyword should be declare in abstract class
	public abstract void checkingMethod(); // Abstract method only declaration || it shows functionality and don't show the implementation
	public void check() {
		System.out.println("checking from parent class");
	}
	public static void main(String[] args) {
		//AbstractClass l = new AbstractClass(); // not able to create the object or instantiated|| if we need to instantiate go with concrete class
		//l.ok();
}
}
