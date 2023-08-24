package Day_10_LiveSession;
//By implementing the Runnable Interface

import java.util.Scanner;

//Operations is a Thread
class Operations1 implements Runnable{
	
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
public class MultiThreading3 {
	public static void main(String[] args) {
		
	Operations1 op1 = new Operations1();//banking thread
	Thread t1 = new Thread(op1);
	t1.setName("banking");
	t1.start();
	System.out.println(t1.isAlive());
	
	Operations1 op2= new Operations1();//printing thread
	Thread t2 = new Thread(op2);
	t2.setName("printing");
	t2.start();
	System.out.println(t2.isAlive());
	
	Operations1 op3 = new Operations1();//addition thread
	Thread t3 = new Thread(op3);
	t3.setName("addition");
	t3.start();
	System.out.println(t3.isAlive());

}
}
