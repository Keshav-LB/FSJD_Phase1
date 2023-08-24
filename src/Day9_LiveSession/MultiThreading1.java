package Day9_LiveSession;
import java.util.*;
//Single Threaded Program

public class MultiThreading1 {

	public static void main(String[] args) throws Exception {
		// Banking ops
		System.out.println("Banking Started");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A/c no.: ");
		int acc_no = sc.nextInt();
		System.out.println("Enter pin:");
		int pin = sc.nextInt();
		System.out.println("Banking Completed!");
		
		//Printing ops
		System.out.println("Printing Started");
		for(int i=0;i<=5;i++) {
			System.out.println("India.........");
			Thread.sleep(2000); //2000 mili seconds -> 2 sec
		}
		System.out.println("Printing completed");
		
		//Addition ops
		System.out.println("Additon started: ");
		System.out.println("Enter A/c no.: ");
		int num1 = sc.nextInt();
		System.out.println("Enter pin:");
		int num2 = sc.nextInt();
		int res = num1 + num2;
		System.out.println("Additon result:"+res);
		System.out.println("Addition completed");
	}

}
//The problem with single threaded program is the inorder execution which can delay other tasks.