package Advanced_java;


// Single Thread 
/*public class Thread_Demo extends Thread {//Inherit the parent class

	public void run() { // creating run method
		System.out.println("The Thread is running");
	}

	public static void main(String args[]) {
		Thread_Demo T1 = new Thread_Demo(); // creating object for thread
		T1.start();// to start the thread
		String str = T1.getName(); // to fetch the thread name- 0
		System.out.println(str); // print the thread name
	}

}*/

/*//Multi-thread 
public class Thread_Demo extends Thread{
	
	public void run() { // creating run method 
		System.out.println("The Thread is running");
	}
	public static void main (String args[]) {
		Thread_Demo T1=  new Thread_Demo(); // creating object for thread 1
		Thread_Demo T2=  new Thread_Demo();// creating object for thread 2
		T1.start();// to start the thread-1
		T2.start();// to start the thread-2
		String str = T1.getName(); //to fetch the thread name- 0
		String str2 = T2.getName(); //to fetch the thread name-1
		System.out.println(str); // print the 1st thread name
		System.out.println(str2); // print the 2nd thread name
	}
}*/

/*//Multi-thread  - Priority
public class Thread_Demo extends Thread{
	
	public void run() { // creating run method 
		System.out.println("The Thread is running");
	}
	public static void main (String args[]) {
		Thread_Demo T1=  new Thread_Demo(); // creating object for thread 1
		Thread_Demo T2=  new Thread_Demo();// creating object for thread 2
		System.out.println("T1 thread prioity level is "+T1.getPriority());// To fetch the thread priority level
		System.out.println("T2 thread prioity level is "+T2.getPriority());// To fetch the thread priority level
		T1.setPriority(1); //T1.setPriority(MIN_PRIORITY); // to set the priority level as minimum
		T2.setPriority(10); //T1.setPriority(MAX_PRIORITY); // to set the priority level as maximum
		//T2.setPriority(5); //T1.setPriority(NORM_PRIORITY);  // to set the priority level as normal
		System.out.println("T1 thread prioity level is "+T1.getPriority());// To fetch the thread priority level
		System.out.println("T2 thread prioity level is "+T2.getPriority());// To fetch the thread priority level
		System.out.println(T1.currentThread().getName()); // to fetch the current thread name
		T1.start();// to start the thread-1
		T2.start();// to start the thread-2
	
	}
}*/


/*//Multi-thread  - Sleep method // time is milliseconds
public class Thread_Demo extends Thread{
	
	public void run() { // creating run method 
		for(int i =1;i<4;i++) {
			try {  // it should give the try block
				Thread.sleep(50); // thread sleep 50 milliseconds
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println(i);
	}
	}
	public static void main (String args[]) {
		Thread_Demo T1=  new Thread_Demo(); // creating object for thread 1
		Thread_Demo T2=  new Thread_Demo();// creating object for thread 2
		T1.start();// to start the thread-1
		T2.start();// to start the thread-2
		System.out.println("hii");
		
	
	}
}*/



/*//Multi-thread  - join() method - it will wait for current thread execution and start the execution 
public class Thread_Demo extends Thread{
	
	public void run() { // creating run method 
		for(int i =1;i<4;i++) {
			try {  // it should give the try block
				Thread.sleep(50); // thread sleep 50 milliseconds
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		System.out.println(i);
	}
	}
	public static void main (String args[]) throws Exception{
		Thread_Demo T1=  new Thread_Demo(); // creating object for thread 1
		Thread_Demo T2=  new Thread_Demo();// creating object for thread 2
		T1.start();// to start the thread-1
		T2.start();// to start the thread-2
		//System.out.println("hii");//it should print last line of code but it should print first line , main thread will not wait for T1,T2 thread.
		T1.join(); // it Indicates join with the current(main)thread 
		T2.join(); // it Indicates join with the current(main)thread  
		System.out.println("hii"); // it will print the last line of code
	}
}*/



/*//create thread through Interface;
public class Thread_Demo { // create the normal class
	int count; // create the instance variable and default value is 0

	public void increment() { // create the method for increment
		count++;
	}

	class demo1 implements Runnable {   // inherit the runnable
		// create the object for concrete class
		public void run() { // implementation of abstract method || interface have abstract methods
			for (int i = 0; i < 10; i++) {
				increment(); // it will access the outer class method with help of object creation.
				System.out.println("ok");
				

			}
		}
	}
		public static void main(String args[]) throws Exception{   // use the throws keyword for exception declaration
			
			Thread_Demo c = new Thread_Demo(); // create the object for class
			Thread_Demo.demo1 T1 = c.new demo1();// create the object for inner class with help of outer class
			Thread T3 = new Thread(T1); // creating object for thread
			T3.start();   // start the thread
			T3.join();    // main thread will be waiting for T1 thread completion 
			System.out.println("Thread execution is done");
			System.out.println("the count is  " +c.count);   // print the value of count
		}

	}
*/



/*//create Multi thread -Interface;
public class Thread_Demo { // create the normal class
	int count; // create the instance variable and default value is 0

	public void increment() { // create the method for increment
		count++;
	}

	class demo1 implements Runnable { // create the object for concrete class
		public void run() { // implementation of abstract method || interface have abstract method
			for (int i = 0; i < 1000; i++) {
				increment();
			}
		}
	}
		public static void main(String args[]) {
			
			Thread_Demo c = new Thread_Demo(); // create the object for class
			Runnable T1 = c.new demo1(); // creating the object inner class help of outer class object with reference of runnable interface
			Thread T3 = new Thread(T1);  // create the object for thread
			T3.start();  // to call the start method for code execution
			System.out.println("Thread execution is done");
			System.out.println(c.count);  // print the value
		}

	}*/


/*//create Multi thread through functional Interface - lambda expression;
public class Thread_Demo { // create the normal class
	int count; // create the instance variable and default value is 0

	public void increment() { // create the method for increment
		count++;
	}

	public static void main(String args[]) {  

		Thread_Demo c = new Thread_Demo(); // create the object for class
			Runnable T1 = () -> { // create the anonymous class with lambda expression.
				for (int i = 0; i < 1000; i++) {
					c.increment();
				}
		};
			Runnable T2 = () -> { // create the anonymous class with lambda expression.
				for (int i = 0; i < 1000; i++) {
					c.increment();
				}
			};
			Thread T3 = new Thread(T1);//create the object for thread class
			Thread T4 = new Thread(T2);//create the object for thread class
			T3.start();// to call the start method for code execution
			T4.start();// to call the start method for code execution
			System.out.println("Thread execution is not done");  // this line will print first even the thread execution has not done

			try {   // should be given the try/catch or declare the throws keyword
				T3.join();// main thread will be waiting for T3 thread completion 
				T4.join();// main thread will be waiting for T4 thread completion 
			} catch (InterruptedException e) {
			}

			System.out.println("count of calling the increment method : " + c.count);
			System.out.println("Thread execution is done.....");

		}
	}*/




//multi Thread - synchronized keyword - one thread access the object and other thread will wait for until thread back
public class Thread_Demo { // create the normal class
	int count; // create the instance variable and default value is 0
	public   synchronized void  increment() { // synchronized - one thread access the object and other thread will wait for until thread back
	count++;
	}

	public static void main(String args[]) {  

		Thread_Demo c = new Thread_Demo(); // create the object for class
			Runnable T1 = () -> { // create the anonymous class with lambda expression.
				for (int i = 0; i < 1000; i++) {
					c.increment();
				}
		};
			Runnable T2 = () -> { // create the anonymous class with lambda expression.
				for (int i = 0; i < 1000; i++) {
					c.increment();
				}
			};
			Thread T3 = new Thread(T1);//create the object for thread class
			Thread T4 = new Thread(T2);//create the object for thread class
			T3.start();// to call the start method for code execution   
			System.out.println("Checking the T3 thread life is " + T3.isAlive());// To check the Thread live status
			T4.start();// to call the start method for code execution
			System.out.println("Thread execution is not done");  // this line will print first even the thread execution has not done

			try {   // should be given the try/catch or declare the throws keyword
				T3.join();// main thread will be waiting for T3 thread completion 
				T4.join();// main thread will be waiting for T4 thread completion 
			} catch (InterruptedException e) {
			}
            System.out.println("Checking the thread T3 life is " + T3.isAlive()); // To check the Thread live status
			System.out.println("count of calling the increment method : " + c.count);
			System.out.println("Thread execution is done.....");

		}
	}



	
 
