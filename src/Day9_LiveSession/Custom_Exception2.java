package Day9_LiveSession;

import java.util.Scanner;

//OverAgeException---> is-a Exception
class OverAgeException extends Exception{
	@Override
	public String getMessage() {
		return "The Age is beyond the allocated age. Thankyou for showing interest.";
	}
}
//UnderAgeException---> is-a Exception
class UnderAgeException extends Exception{
	@Override
	public String getMessage() {
		return "The Age is lesser than the allocated age. Thankyou for showing interest.";
	}
}

class Candidate1{
	int age;
	void getData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Age: ");
		age = sc.nextInt();
	}
	
	void verifyUser() throws OverAgeException, UnderAgeException{
		if(age>60) {
			OverAgeException oae = new OverAgeException();
			System.out.println(oae.getMessage());
			throw oae;
		}
		else if(age<18) {
			UnderAgeException uae = new UnderAgeException();
			System.out.println(uae.getMessage());
			throw uae;
		}
		else {
			System.out.println("Valid USer!");
		}
	}
}
class License{
	void permit(Candidate1 c) {
		//nested Try-Catch block
		try {
			//Attempt-1
			c.getData();
			c.verifyUser();
			
		}
		catch(OverAgeException | UnderAgeException e1){
			try {
				//Attempt-2
				c.getData();
				c.verifyUser();
				
			}
			catch(OverAgeException | UnderAgeException e2){
				try {
					//Attempt-3
					c.getData();
					c.verifyUser();
					
				}
				catch(OverAgeException | UnderAgeException e3) {
					System.out.println("User Blocked!!!");
					System.exit(0);// to terminate the code
				}
			}
		}
	}
}
public class Custom_Exception2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Candidate1 c = new Candidate1();
		License l = new License();
		l.permit(c);
	}

}
