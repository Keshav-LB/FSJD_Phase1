package Day5_LiveSession;
/*Arrays:
 * An array is homogeneous collection of elements
 * An array in java is treated as an object
 * The array has some disadvantages as well as advantages
 * Advantages:
 * 		1. Creation of array is simple
 * 		2. Adding data into an array is simple
 * 		3. Retrieving the data from an array is simple.
 */

// 1D Array:

import java.util.Scanner;
public class Arrays1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int size = sc.nextInt();
		int arr[] = new int[size];
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("Enter the array element: ");
			arr[i] = sc.nextInt();
		}
		
		for(int i=0; i<arr.length;i++)
		{
			System.out.println("Elements present inside array : "+arr[i]);
			
		}	
		
	}

}
