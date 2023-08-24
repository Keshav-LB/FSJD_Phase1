package Day5_LiveSession;

import java.util.Scanner;
//2D Arrays with Jagged array concept:
/*
* 
* 		class				students
* 			0					2
* 			1					3
* 			2					4
* 			3					5
* */
public class Jagged2DArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("Enter the total no. of class: ");
		int cls = sc.nextInt();
		int arr[][] = new int[cls][];
		
		//Jagged_Array:
		for(int i =0;i<arr.length;i++)
		{
			System.out.println("Enter the total no. of students in class: "+(i+1));
			int stu = sc.nextInt();
			arr[i]=new int[stu];
		}
		
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
