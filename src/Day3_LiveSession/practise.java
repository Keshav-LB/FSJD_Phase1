package Day3_LiveSession;

import java.util.Scanner;

public class practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("-----------------");
		System.out.println("    code1      ");
		System.out.println("-----------------");
		
		for(int i = 1; i<=5; i++) 
		{
			for	(int j=1; j<=5;j++) 
			{
				if(i==1 || i==5 || j==1 || j==5) {
					System.out.print("# ");
				}
				else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
		
		

		System.out.println("-----------------");
		System.out.println("    code2      ");
		System.out.println("-----------------");
		
		for(int i = 1; i<=5; i++) 
		{
			for	(int j=1; j<=i;j++) 
			{
				if(i==1 || i==5 || j==1 || i==j) {
					System.out.print("# ");
				}
				else {
					System.out.print("- ");
				}
			}
			System.out.println();
		}
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("-----------------------------------");
		System.out.println("        ALPHABET PRINTING : A        ");
		System.out.println("-----------------------------------");
		
		for(int i = 0; i<n; i++) 
		{
			for	(int j=0; j<n;j++) 
			{
				if(i==0&&j<=(n-1)/2||
						i==(n-1)/2&&j<=(n-1)/2||
						j==0||
						j==(n-1)/2) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		System.out.println("-----------------------------------");
		System.out.println("        ALPHABET PRINTING : B       ");
		System.out.println("-----------------------------------");
		
		for(int i = 0; i<n; i++) 
		{
			for	(int j=0; j<n;j++) 
			{
				if(i==0&&j<(n-1)/2||
						i==(n-1)/2&&j<(n-1)/2||
						i==n-1&&j<(n-1)/2||
						j==0||
						j==(n-1)/2&&i!=0&&i!=(n-1)/2&&i!=n-1) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("-----------------------------------");
		System.out.println("        ALPHABET PRINTING : G       ");
		System.out.println("-----------------------------------");
		
		for(int i = 0; i<n; i++) 
		{
			for	(int j=0; j<n;j++) 
			{
				if(i==0&&j<=(n-1)/2||
						j==0&&i<=(n-1)||
						i==(n-1)&&j<=(n-1)/2||
								j==(n-1)/2&&i>=(n-1)/2 &&i<=(n-1)||
								i==(n-1)/2 &&j>=n/4&&j<=(n-1)/2) {
					System.out.print("# ");
				}
				else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}

}
