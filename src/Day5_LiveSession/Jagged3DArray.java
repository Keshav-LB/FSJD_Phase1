package Day5_LiveSession;

import java.util.Scanner;

public class Jagged3DArray {
	/*
	1              2            3
	i              j            k
	School         class        students
	0               0           1
	                1           3
	1               0           2
	                1           3
	                2			4
	3D array:
	3 for loops 
	loop-1 : arr.length --> school count
	loop-2 : arr[i].length --> class count
	loop-3 : arr[i][j].length --> students count

	value is stored in : arr[i][j][k]
	*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the total no. of school: ");
		int sch = sc.nextInt();
		
		int arr[][][] = new int[sch][][];
		
		//Jagged Array for class count:
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("Enter the class in school no. : "+(i+1));
			int cls = sc.nextInt();
			arr[i]=	new int[cls][]; 
		}
		

		//Jagged Array for student count :
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("Inside the school Number: "+(i+1));
			for(int j=0; j<arr[i].length;j++)
			{
				System.out.println("Enter the student in class no. : "+(j+1));
				int stu = sc.nextInt();
				arr[i][j]=	new int[stu]; 
			}
		}
		
		for(int i = 0; i<arr.length;i++) 
		{
			System.out.println("Inside the school Number: "+(i+1));
			for(int j = 0; j<arr[i].length;j++) 
			{
				System.out.println("Inside class number: " +(j+1));
				for(int k = 0; k<arr[i][j].length;k++) 
				{
					System.out.println("Age of Student no. : "+ (k+1));				
					arr[i][j][k]=sc.nextInt();
				}
				
			}
			
		}
		
		System.out.println("****************************");
		
		//Display
		for(int i = 0; i<arr.length;i++)
		{
			System.out.println("Schoool : "+(i+1));
			for(int j=0; j<arr[i].length;j++) 
			{
				System.out.println("Class : "+(j+1));
				for(int k=0; k<arr[i][j].length;k++) 
				{
					System.out.println("Students : "+(k+1) + "is :" + arr[i][j][k]);					
									
				}
			}
			System.out.println();
		}
		
	}

}
