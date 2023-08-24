package Day_10_LiveSession;

class ops extends Thread{
	@Override
	public void run() {
		String thread_name= Thread.currentThread().getName();
		
		if(thread_name.equals("add")) {
			addition();
		}
		else if(thread_name.equals("sub")) {
			substraction();
		}
		else {
			multiplication();
		}
	}
	
	void addition() {
		System.out.println("Addition Started");
		int a=10;
		int b=20;
		System.out.println("Addition result is : "+(a+b));
		System.out.println("Addition Terminated");
	}
	void substraction() {
		System.out.println("Substraction Started");
		int a=10;
		int b=20;
		System.out.println("Substraction result is : "+(b-a));
		System.out.println("Substraction terminated");
	}
	void multiplication() {
		System.out.println("Multipliaction Started");
		int a=10;
		int b=20;
		System.out.println("Multiplication result is : "+(a*b));
		System.out.println("Multiplication Terminated");
	}
}
public class RaceCondition3 {

	public static void main(String[] args) throws Exception{
		System.out.println("Main started");
		
		ops op1 = new ops();
		op1.setName("add");
		op1.start();      //---------control of thread goes to TS
		op1.join();
		
		ops op2 = new ops();
		op2.setName("sub");
		op2.start();      //---------control of thread goes to TS
		op2.join();
		
		ops op3 = new ops();
		op3.setName("mul");
		op3.start();      //---------control of thread goes to TS
		op3.join();
		
		System.out.println("Main Terminated");
	}

}
