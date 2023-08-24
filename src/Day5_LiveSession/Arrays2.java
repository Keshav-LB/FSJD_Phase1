package Day5_LiveSession;
import java.util.*;


//2D Arrays:
/*
 * 
 * 		class				students
 * 			0					4
 * 			1					4
 * 			2					4
 * 			3					4
 * */
public class Arrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the total no. of class: ");
		int cls = sc.nextInt();
		System.out.println("Enter the total no. of students in each class: ");
		int stu = sc.nextInt();
		
		int arr[][] = new int[cls][stu];
		
		//Storing the info.
		//arr.length-------> count of class
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("Inside class number: " +(i+1));
			//arr[i].length -------> count of student in the i'th class
			for(int j=0; j<arr[i].length;j++)
			{
				System.out.println("Enter the age of student number: " +(j+1));
				arr[i][j]=sc.nextInt();
			}
		}
		
		//Displaying the info:
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("Inside class number: " +(i+1));
			//arr[i].length -------> count of student in the i'th class
			for(int j=0; j<arr[i].length;j++)
			{
				System.out.println("The age of student number: " +(j+1)+ " is :"+arr[i][j]);
			}
		}
		
		
		
	}

}
