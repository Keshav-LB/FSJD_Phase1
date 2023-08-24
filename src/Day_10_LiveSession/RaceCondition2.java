package Day_10_LiveSession;
/*
 * Race Condition: Race condition is a scenario where multiple threads are fighting against each other to 
 * 					perform their execution first.
 * 
 * Solution to the race condition can be provided by making use of Daemon thread.
 * 
 * Conditions to use Daemon thread:
 * 		1.Identify the primary and secondary operations(threads)
 * 		2.Use infinite for loop for secondary operations(threads)
 * 		3.activate the setDaemon method for secondary operations(threads)
 * 		4.assign priority more than 7 for secondary operations(threads)
 */

class MicrosoftWord1 extends Thread{
	public void run() {
		String thread_name = Thread.currentThread().getName();
		if(thread_name.equals("typing")) {
			typing();
		}
		else if(thread_name.equals("checking")){
			checking();
		}
		else {
			saving();
		}
	};
	//Primary thread
	void typing() {
		try {
			for(int i=0; i<=5; i++) {
				System.out.println("Typing.......");
				Thread.sleep(3000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	//Secondary thread
	void checking() {
		try {
			for(; ;) {
				System.out.println("Spell_Checking.......");
				Thread.sleep(3000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	//Secondary thread
	void saving() {
		try {
			for(; ;) {
				System.out.println("Saving.......");
				Thread.sleep(3000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
public class RaceCondition2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				MicrosoftWord1 ms1 = new MicrosoftWord1();
				ms1.setName("typing");
				MicrosoftWord1 ms2 = new MicrosoftWord1();
				ms2.setName("checking");
				ms2.setDaemon(true);
				ms2.setPriority(8);
				MicrosoftWord1 ms3 = new MicrosoftWord1();
				ms3.setName("saving");
				ms3.setDaemon(true);
				ms3.setPriority(9);
				
				ms1.start();
				ms2.start();
				ms3.start();
	}

}
