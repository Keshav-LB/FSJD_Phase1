package Day5_LiveSession;
import java.util.*;
public class Arrays4 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the total no. of University: ");
		int uni = sc.nextInt();
		
		System.out.print("Enter the total no. of school: ");
		int sch = sc.nextInt();
		
		System.out.print("Enter the total no. of class in each school: ");
		int cls = sc.nextInt();
		
		System.out.print("Enter the total no. of students in each class: ");
		int stu = sc.nextInt();
		
		System.out.println();
		
		int arr[][][][] = new int[uni][sch][cls][stu];
		//Storing Data
		for(int i = 0; i<arr.length;i++)
		{			
				System.out.println("University : "+(i+1));
				for(int j=0; j<arr[i].length;j++) 
				{
					System.out.println("School : "+(j+1));
					for(int k=0; k<arr[i][j].length;k++) 
					{
						System.out.println("Class : "+(k+1));
						System.out.println();
						for(int z=0; z<arr[i][j][k].length;z++) 
						{
							System.out.print("Enter the Age of Students  " +(z+1)+": ");
							arr[i][j][k][z] = sc.nextInt();	
							
						}
						System.out.println();
					}
				}
			}
		
		
		System.out.println("****************************");
		
		//Display
		for(int i = 0; i<arr.length;i++)
		{			
				System.out.println("University : "+(i+1));
				for(int j=0; j<arr[i].length;j++) 
				{
					System.out.println("School : "+(j+1));
					for(int k=0; k<arr[i][j].length;k++) 
					{
						System.out.println("Class : "+(k+1));
						for(int z=0; z<arr[i][j][k].length;z++) 
						{
							System.out.println("Age of Students " +(z+1)+ "is : "+ arr[i][j][k][z]);
							
						}
					}
				}
				System.out.println();
				
		}
		
				
	}
}
