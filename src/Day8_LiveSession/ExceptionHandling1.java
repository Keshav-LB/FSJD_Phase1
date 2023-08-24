package Day8_LiveSession;
//Error: It is the mistakes done by programmer while writing the program. 
//Error will not let the program to be executed
//Errors occurs during compilation time
//Usually errors occur due faulty coding.

/*
Exceptions: It is the mistakes done by the end user while giving input to the program. 
    exception will occur only if the program is executed
    exception occurs during run time
    Usually exception occur due faulty inputs.
    
Exception Handling: It is the process of handling the exceptions using an appropriate 
					mechanism.
		Usually exception handling in java is handled by the compiler

In java Exceptions can be handled using:
		1. User Defined Exceptions Handlers (UDEH)
				--> using try--catch block
				--> ducking the exception using throws
				--> re-throwing of exception using throw keyword

		2. Default Exception handlers(DEH)

Advantages of exception handling in java:
		1. System crash will never occur
		2. Any type exceptions can be handled
		3. Default exception handler provides the strength to handle and prevent the system crash

------ Program --------
       |
       |
         JVM
       |
       |
Gives the control to Run time System
       |
       |
Creation of the Exception object by RTS
       |
       |
RTS will look out for UDEH if present else DEH will be called
       |
       |
If UDEH is present Control is given to UDEH
       |
       |
  Layer of DEH
       |
       |
       OS
       |
       |
     System Crash
     
Critical Statement: Any statement which is bound to cause an exception is called critical statement.
			-->All the critical statements must be placed inside the try blocks.
			-->The exception that is generated will be caught and handled inside the catch block.
			-->For a single try block we can have multiple catch blocks
*/
 


import java.util.*;

public class ExceptionHandling1 {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num1: ");
		int num1= sc.nextInt();
		System.out.println("ENter the num2: ");
		int num2 = sc.nextInt();
		
		try {
			int res = num1/num2;
			System.out.println("Result after dividing two num: " + res);
			
			System.out.println("Enter the size of array: ");
			int size = sc.nextInt();
			
			int arr[]=new int[size];
			System.out.println("Enter the position to store the data: ");
			int pos = sc.nextInt();
			System.out.println("Enter the value to be stored : ");
			int val = sc.nextInt();
			
			arr[pos] = val;
			System.out.println("Array operation completed ");
			
			String s1 = null;
			s1.toUpperCase();
		}
		//Specific Catch
		catch(ArithmeticException e) {
			System.out.println("ArithmeticException Exception Handled.");
			e.printStackTrace();
		}
		
		catch(ArrayIndexOutOfBoundsException e1) {
			System.out.println("ArrayIndexOutOfBoundsException Handled.");
			//e.printStackTrace();
		}
		
		catch(NullPointerException e2) {
			System.out.println("NullPointerException Exception Occur Due to null String Data.");
			//e.printStackTrace();
		}
		
		catch(NegativeArraySizeException e3) {
			System.out.println("NegativeArraySizeException Exception Handeled.");
		}
		//Generic catch which handles all exception
		catch(Exception e4) {
			System.out.println("Generic Exception");
			
		}
		sc.close();
	}

}
