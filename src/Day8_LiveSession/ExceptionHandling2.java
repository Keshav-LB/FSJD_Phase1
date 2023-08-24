package Day8_LiveSession;

 //***********Multi Level Exceptional Handling*************
 
import java.util.Scanner;

class Operations{
	void fun1() throws Exception
	{
		try 
		{
			Scanner sc = new Scanner(System.in);
		
			System.out.println("Enter the num1: ");
			int num1= sc.nextInt();
			System.out.println("ENter the num2: ");
			int num2 = sc.nextInt();
		
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
		catch(Exception e)
		{
			System.out.println("Generic Exception Handled in fun-1 Block");
			e.printStackTrace();
			throw e;
		}
	}
	//void fun2() throws Exception {fun1();}
	
	//void fun3() throws Exception {fun2();}
}

public class ExceptionHandling2 {

	public static void main(String[] args) {
		try 
		{
			Operations op = new Operations();
			op.fun1();
		}
		catch(Exception e)
		{
			System.out.println("Generic Exception Handled in Main Block");
			e.printStackTrace();
		}
	}

}
