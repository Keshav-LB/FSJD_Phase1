package Day_10_LiveSession;
import java.util.*;
/*
 * To achieve multi-threaded programming we have 2 approches:
 * 		1.By extending the thread class
 * 
 * 			->use extend Thread on to the class which must be present in multi-threaded environment
 * 			->Override the run() inside the class which extends the thread though it is not mandatory
 * 				but if we have to run in multi-threaded environment it is mandatory
 * 			->When ever the object of this class is created it indirectly creates  a thread
 * 			->use start() to allocate this thread(object) to the thread scheduler
 * 
 * 		2. by implementing the Runnable Interface
 * 			->use implements Runnable on to the class which must be present in multi-threaded environment
 * 			->Override the run() inside the class which implements Runnable. It is mandatory
 * 				to provide the run() to execute the thread in multi-threaded environment. 
 * 			->When ever the object of this class is created it will not create a Thread directly
 * 			->we have to create multiple other threads and align these objects to those threads
 * 			->use start() to allocate this thread(object) to the thread scheduler
 * 
 */

//Operations is a Thread
class Operations extends Thread{
	
	@Override
	public void run() {
		String thread_name = Thread.currentThread().getName();
		if(thread_name.equals("banking")) {
			banking();
		}
		else if(thread_name.equals("printing")) {
			printing();
		}
		else {
			addition();
		}
	}
	void banking() {
		// Banking ops
				System.out.println("Banking Started");
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter A/c no.: ");
				int acc_no = sc.nextInt();
				System.out.println("Enter pin:");
				int pin = sc.nextInt();
				System.out.println("Banking Completed!");
	}
	
	void printing() {
		//Printing ops
				try {
				System.out.println("Printing Started");
				for(int i=0;i<=5;i++) {
						System.out.println("India.........");
						Thread.sleep(2000); //2000 mili seconds -> 2 sec
					}
				System.out.println("Printing completed");
				}
				catch(Exception e){
					e.printStackTrace();
				}
	}
	
	void addition() {
				Scanner sc = new Scanner(System.in);
				System.out.println("Additon started: ");
				System.out.println("Enter num1.: ");
				int num1 = sc.nextInt();
				System.out.println("Enter num2:");
				int num2 = sc.nextInt();
				int res = num1 + num2;
				System.out.println("Additon result:"+res);
				System.out.println("Addition completed");
	}
}
public class MultiThreading2 {
public static void main(String[] args) {
	Operations op1 = new Operations();//banking thread
	op1.start();
	op1.setName("banking");
	System.out.println(op1.isAlive());
	
	Operations op2= new Operations();//printing thread
	op2.start();
	op2.setName("printing");
	System.out.println(op2.isAlive());
	
	Operations op3 = new Operations();//addition thread
	op3.start();
	op3.setName("addition");
	System.out.println(op3.isAlive());


//	op.banking();
//	op.printing();
//	op.addtion();
}
}
