package Day9_LiveSession;

import java.util.Scanner;

/*
 * If age is greater than 60 then categorize as Senior Citizen and do not allocate license
 * 				---->OverAgeException
 * If age is lesser than 18 then categorize as youth/teenager and do not allocate license
 * 				---->UnderAgeException
 * If age is between 18 and 60 then categorize as adult and allocate license
 */

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

class Candidate{
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
public class Custom_Exception {

	public static void main(String[] args) {
		
		try {
			Candidate c1 = new Candidate();
			c1.getData();
			c1.verifyUser();
		}
		catch(OverAgeException e) {
			System.out.println("OverAgeException Handled in main.");
		}
		catch(UnderAgeException e) {
			System.out.println("UnderAgeException Handled in main.");
		}
		catch(Exception e) {
			System.out.println("Unrecognized Exception occured please refer the below stack trace:");
			e.printStackTrace();
		}
		
	}

}
