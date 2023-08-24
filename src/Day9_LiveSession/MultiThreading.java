package Day9_LiveSession;
/*
 * What is a thread?
 * 		-It is defined as sequence of execution. It is a small task in a complex operations.
 * what is Multi-Threading?
 * 		-It is defined as simultaneous execution of multiple threads
 * 		-Multi-Threading is handled by Thread Scheduler
 * 		-Multi-Threading can be acheived using 2 approaches:
 * 				-1. Extending the thread class
 * 				-2. by implementing the runnable interface
 * By default the thread scheduler allocates main method with a default thread called as Main thread
 */
public class MultiThreading {

	public static void main(String[] args) {
		Thread t = new Thread();//Creation of thread object
		System.out.println(t);
		
		//name of the thread
		//priority of thread ---> ranking system
		//method to which the thread belong to
		
		t.setName("Virat");
		t.setPriority(8);//ranges valid b/w 0-10
		System.out.println(t);
		
		Thread mainThread = Thread.currentThread();
		System.out.println(mainThread);
		mainThread.setName("main-thread");
		System.out.println(mainThread);
		

	}

}

