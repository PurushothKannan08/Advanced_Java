package Advanced_java;


/*//Functional interface
interface Teacher{//creating functional interface - it has only one abstract method
	void marks();
	int a = 55;
	}
class student implements Teacher{  // student class implements the  Teacher interface
	public void marks() {
		System.out.println("It's implemented");
	}
}
public class Functional_Interface {

	public static void main(String[] args) {
		student obj=new student();
		obj.marks();
		 System.out.println(obj.a);

	}

}*/


/*//Functional interface post Java 8 - with anonymous class
@FunctionalInterface   // to detect the code and provide the warning message if the requirement not met || it's optional
interface Teacher{//creating functional interface - it has only one abstract method
	void marks();
	int a = 55;
	}
/*class student implements Teacher{  // student class implements the  Teacher interface
	public void marks() {
		System.out.println("It's implemented");
	}
}*/
/*public class Functional_Interface {

	public static void main(String[] args) {
		Teacher obj=new Teacher (){ 
				public void marks() {
			System.out.println("It's implemented");
		}
		};
		obj.marks();
		 System.out.println(obj.a);

	}

}*/



/*//Functional interface post Java 8 - with lambda expression without arguments
@FunctionalInterface   // to detect the code and provide the warning message if the requirement not met || it's optional
interface Teacher{//creating functional interface - it has only one abstract method
	void marks();
		}
public class Functional_Interface {

	public static void main(String[] args) {
		Teacher obj=() -> System.out.println("It's implemented");
		obj.marks();
	}
}*/

//Functional interface post Java 8 - with lambda expression without arguments
@FunctionalInterface   // to detect the code and provide the warning message if the requirement not met || it's optional
interface Teacher{//creating functional interface - it has only one abstract method
	void marks(int i,int j);
		}
/*class student implements Teacher{  // student class implements the  Teacher interface
	public void marks() {
		System.out.println("It's implemented");
	}
}*/
public class Functional_Interface {

	public static void main(String[] args) {

		/*
		 * Teacher obj= new Teacher () { using the anonymous inner class public void
		 * marks (int i,int j) 
		 * { int result = i+j; System.out.println("Total is "+
		 * result); } };
		 */

		Teacher obj = (i, j) -> { // using the lambda expression
			int result = i + j;
			System.out.println("Total is " + result);
		};
		obj.marks(4, 5);

	}

}