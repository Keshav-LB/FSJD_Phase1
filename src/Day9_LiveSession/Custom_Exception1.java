package Day9_LiveSession;
/*
 * Collect account no. and pin from the user
 * Validate that with the existing A/c no. and pin
 * If it is mismatched then throw InvalidUserException
 * It it matches print it as valid customer
 */

import java.util.Scanner;

class InvalidUserException extends Exception{
	@Override
	public String getMessage() {
		return "Invalid User. Thankyou for showing interest.";
	}
}

class Customer{
	int acc_no=111;
	int pin=222;
	int acc_no_input;
	int pin_input;
	void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Acc_no.: ");
		acc_no_input = sc.nextInt();
		System.out.println("Enter the Pin_no.: ");
		pin_input = sc.nextInt();
	}
	
	void verifyUser() throws InvalidUserException{
		if(acc_no==acc_no_input&&pin==pin_input) {
			System.out.println("Valid USer!!!!!");
		}
		else{
			InvalidUserException iue = new InvalidUserException();
			System.out.println(iue.getMessage());
			throw iue;
		}
	}
}

class BankApp{
	void permit(Customer c) {
		//nested Try-Catch block
		try {
			//Attempt-1
			c.getData();
			c.verifyUser();
			
		}
		catch(InvalidUserException e1){
			try {
				//Attempt-2
				c.getData();
				c.verifyUser();
				
			}
			catch(InvalidUserException e2){
				try {
					//Attempt-3
					c.getData();
					c.verifyUser();
					
				}
				catch(InvalidUserException e3) {
					System.out.println("User Blocked!!!");
					System.exit(0);// to terminate the code
				}
			}
		}
	}
}
public class Custom_Exception1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Customer c1 = new Customer();
			BankApp ba = new BankApp();
			ba.permit(c1);
		
		
		

	}

}
