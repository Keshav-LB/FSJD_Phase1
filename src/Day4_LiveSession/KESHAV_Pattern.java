package Day4_LiveSession;

import java.util.Scanner;

public class KESHAV_Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
			int n = sc.nextInt();
			
			for(int i=0;i<n;i++)
			{
				//K
				for(int j=0;j<n;j++)
				{
					if(j==0&&i<=(n-1)||
							i+j==(n-1)/2||
							i-j==(n-1)/2)
					
						System.out.print("# ");
					else
						System.out.print("  ");
				}
				
				System.out.print("");
				//E
				for(int j=0;j<n;j++)
				{
					if(j==0&&i<=(n-1)||
							i==(n-1)&&j<=(n-1)/2||
							i==(n-1)/2&&j<=(n-1)/2||
							i==0&&j<=(n-1)/2)
					
						System.out.print("# ");
					else
						System.out.print("  ");
				}
				
				System.out.print("");
				//S
				for(int j=0;j<n;j++)
				{
					if(i==0&&j<=(n-1)/2||
							i==(n-1)/2&&j<=(n-1)/2||
							i==(n-1)&&j<=(n-1)/2||
							j==0&&i<=(n-1)/2||
							j==(n-1)/2&&i>=(n-1)/2&&i<=(n-1))
					
						System.out.print("# ");
					else
						System.out.print("  ");
				}
				
				System.out.print("");
				//H
				for(int j=0;j<n;j++)
				{
					if(j==0&&i<=n-1||
							j==(n-1)/2&&i<=(n-1)||
							i==(n-1)/2&&j<=(n-1)/2)
					
						System.out.print("# ");
					else
						System.out.print("  ");
				}
				
				//A
				for(int j=0;j<n;j++)
				{
					if(i==0 &&j<=(n-1)/2 ||
							j==0&&i<=(n-1)||
							j==n/2&&i<=(n-1)||
							i==n/2&&j<=(n-1)/2)
					
						System.out.print("# ");
					else
						System.out.print("  ");
				}
				System.out.print("");
				//V
				for(int j=0;j<n;j++)
				{
					if(j==0&&i<=(n-1)/2||
							j==(n-1)&&i<=(n-1)/2||
							i-j==(n-1)/2||
							i+j==(n-1)+(n-1)/2)
					
						System.out.print("# ");
					else
						System.out.print("  ");
				}
				System.out.println();
			}
			
	}

}
