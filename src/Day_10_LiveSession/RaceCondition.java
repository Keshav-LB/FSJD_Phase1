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

class MicrosoftWord extends Thread{
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
	void checking() {
		try {
			for(int i=0; i<=5; i++) {
				System.out.println("Spell_Checking.......");
				Thread.sleep(3000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	void saving() {
		try {
			for(int i=0; i<=5; i++) {
				System.out.println("Saving.......");
				Thread.sleep(3000);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
public class RaceCondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MicrosoftWord ms1 = new MicrosoftWord();
		ms1.setName("typing");
		MicrosoftWord ms2 = new MicrosoftWord();
		ms2.setName("checking");
		MicrosoftWord ms3 = new MicrosoftWord();
		ms3.setName("saving");
		
		ms1.start();
		ms2.start();
		ms3.start();
	}

}
