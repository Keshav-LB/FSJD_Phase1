package Day_10_LiveSession;

import javax.print.DocFlavor.STRING;

/*
 * New ------>start------>runnable------->running---------------------------------------->Dead
 *  										|
 * 											|-->wait state (when we call wait())
 *  											|-->Dead state (when interrupted)
 *   											|-->Runnable state (when notify() is called)
 *  										|-->sleep state (when we call sleep())
 *   											|-->Dead state (when interrupted)
 *    											|-->Runnable state (when sleep time is over)
 *   										|-->blocked state (when resource is not available))
 *    											|-->Dead state (when interrupted)
 *     											|-->Runnable state (when the resource is available)
 */

class Readers extends Thread{
	String book1 = "Rich Dad Poor Dad";
	String book2 = "The monk who sold his ferrari";
	String book3 = "harry potter";
	
	public void run() {
		String thread_Name=Thread.currentThread().getName();
		if(thread_Name.equals("varnit")) {
			
			varnitBorrowed();
		}
		else {
			maheshBorrowed();
		}
	};
	
	void varnitBorrowed() {
		try {
			synchronized (book1) {
				System.out.println("Varnit has borrowed the book: "+ book1);
				Thread.sleep(3000);	
				synchronized (book2) {
					System.out.println("Varnit has borrowed the book: "+ book2);
					Thread.sleep(3000);	
					synchronized (book3) {
						System.out.println("Varnit has borrowed the book: "+ book3);
						Thread.sleep(3000);				
					}
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	void maheshBorrowed() {
		try {
			synchronized (book1) {
				System.out.println("Mahesh has borrowed the book: "+ book1);
				Thread.sleep(3000);	
				synchronized (book2) {
					System.out.println("Mahesh has borrowed the book: "+ book2);
					Thread.sleep(3000);	
					synchronized (book3) {
						System.out.println("Mahesh has borrowed the book: "+ book3);
						Thread.sleep(3000);				
					}
				}
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
public class ThreadStates {

	public static void main(String[] args) {
		Readers r1 = new Readers();
		r1.setName("varnit");
		Readers r2 = new Readers();
		r2.setName("mahesh");
		
		r1.start();
		r2.start();
	}

}
