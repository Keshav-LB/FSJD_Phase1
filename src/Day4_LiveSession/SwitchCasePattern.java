package Day4_LiveSession;

import java.util.Scanner;

public class SwitchCasePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number : ");
		int n = sc.nextInt();
		System.out.print("Enter the name which you want to print :  ");
		String name = sc.next();

        for (int z = 0; z < name.length(); z++) 
        {
            char letter = name.charAt(z);			
            switch (letter) 
            {           
                case 'a':
                	
                	//A
                	for(int i=0;i<n;i++)
         			{
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
                		System.out.println();			
         			}
                    break;
                    

                case 'b':
                	//B
                	for(int i=0;i<n;i++)
         			{
                		for(int j=0;j<n;j++)
                		{
                			if(i==0 &&j<(n-1)/2 ||
        							j==0&&i<=(n-1)||
        							j==(n-1)/2 && i!=0 && i!=(n-1)/2 && i!=(n-1)||
        							i==n/2&&j<(n-1)/2||
        							i==n-1&&j<(n-1)/2)
                				
                				System.out.print("# ");
                			
                			else
                				System.out.print("  ");
                		}
                		System.out.println();			
         			}
                	break;
                case 'c':
                	//C
                	for(int i=0;i<n;i++)
         			{
                		for(int j=0;j<n;j++)
                		{
                			if(i==0 &&j<=n/2 && j!=0 ||
        							j==0 && i<=n-1 && i!=n-1 && i!=0||
        							i==n-1 &&j<=n/2 && j!=0)
                				
                				System.out.print("# ");
                			
                			else
                				System.out.print("  ");
                		}
                		System.out.println();			
         			}
                	break;
                case 'd':
                	//D
                	for(int i=0;i<n;i++)
         			{
                		for(int j=0;j<n;j++)
                		{
                			if(i==0&&j<(n-1)/2 ||
        							j==0&&i<n-1 ||
        							j==(n-1)/2&&i<n-1 &&i!=0&&i!=n-1||
        							i==(n-1)&&j<(n-1)/2)
                				
                				System.out.print("# ");
                			
                			else
                				System.out.print("  ");
                		}
                		System.out.println();			
         			}
                	break;
                case 'e':
                	//E
                	for(int i=0;i<n;i++)
         			{
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
    				System.out.println();
         			}
                    break;
                case 'f':
                	//F
                	for(int i=0;i<n;i++)
         			{
                		for(int j=0;j<n;j++)
                		{
                			if(j==0&&i<=(n-1)||
        							i==(n-1)/2&&j<=(n-1)/2||
        							i==0&&j<=(n-1)/2)
                				
                				System.out.print("# ");
                			
                			else
                				System.out.print("  ");
                		}
                		System.out.println();			
         			}
                	break;
                case 'g':
                	//G
                	for(int i=0;i<n;i++)
         			{
                		for(int j=0;j<n;j++)
                		{
                			if(i==0&&j<=(n-1)/2||
        							j==0&&i<=(n-1)||
        							i==(n-1)&&j<=(n-1)/2||
        									j==(n-1)/2&&i>=(n-1)/2 &&i<=(n-1)||
        									i==(n-1)/2 &&j>=n/4&&j<=(n-1)/2)
                				
                				System.out.print("# ");
                			
                			else
                				System.out.print("  ");
                		}
                		System.out.println();			
         			}
                	break;
                case 'h':
                	//H
                	for(int i=0;i<n;i++)
         			{
    				for(int j=0;j<n;j++)
    				{
    					if(j==0&&i<=n-1||
    							j==(n-1)/2&&i<=(n-1)||
    							i==(n-1)/2&&j<=(n-1)/2)
    					
    						System.out.print("# ");
    					else
    						System.out.print("  ");
    				}
    				System.out.println();
         			}
                    break;
                    
                case 'i':
                	//I
                	for(int i=0;i<n;i++)
         			{
                		for(int j=0;j<n;j++)
                		{
                			if(i==0&&j<(n-1)/2||
        							i==(n-1)&&j<(n-1)/2||
        							j==n/4&&i<=(n-1))
                				
                				System.out.print("# ");
                			
                			else
                				System.out.print("  ");
                		}
                		System.out.println();			
         			}
                	break;
                case 'j':
                	//J
                	for(int i=0;i<n;i++)
         			{
                		for(int j=0;j<n;j++)
                		{
                			if(i==0&&j<(n-1)/2||
        							j==n/4&&i<=(n-1)||
        							i==(n-1)&&j<=n/4||
        							j==0 && i>=(n-1)/2 && i<=(n-1))
                				
                				System.out.print("# ");
                			
                			else
                				System.out.print("  ");
                		}
                		System.out.println();			
         			}
                	break;
                	
                case 'k':
                	//K
                	for(int i=0;i<n;i++)
         			{
    				for(int j=0;j<n;j++)
    				{
    					if(j==0&&i<=(n-1)||
    							i+j==(n-1)/2||
    							i-j==(n-1)/2)
    					
    						System.out.print("# ");
    					else
    						System.out.print("  ");
    				}
    				System.out.println();
         			}
                    break;
                case 'l':
                	//L
                	for(int i=0;i<n;i++)
         			{
                		for(int j=0;j<n;j++)
                		{
                			if(j==0&&i<=(n-1)||
        							i==(n-1)&&j<=(n-1)/2)
                				
                				System.out.print("# ");
                			
                			else
                				System.out.print("  ");
                		}
                		System.out.println();			
         			}
                	break;
                case 'm':
                	//M
                	for(int i=0;i<n;i++)
         			{
                		for(int j=0;j<n;j++)
                		{
                			if(j==0&&i<=(n-1)||
        							j==(n-1)&&i<=(n-1)||
        							i==j && j<=(n-1)/2||
        							i+j==(n-1) &&j>=(n-1)/2)
                				
                				System.out.print("# ");
                			
                			else
                				System.out.print("  ");
                		}
                		System.out.println();			
         			}
                	break;
                case 'n':
                	//N
                	for(int i=0;i<n;i++)
         			{
                		for(int j=0;j<n;j++)
                		{
                			if(j==0&&i<=(n-1)||
        							j==(n-1)&&i<=(n-1)||
        							i==j )
                				
                				System.out.print("# ");
                			
                			else
                				System.out.print("  ");
                		}
                		System.out.println();			
         			}
                	break;
                case 'o':
                	//O
                	for(int i=0;i<n;i++)
         			{
                		for(int j=0;j<n;j++)
                		{
                			if(i==0&&j<(n-1)/2 &&j!=0||
        							i==n-1&&j<(n-1)/2 &&j!=0||
        							j==0&&i<=(n-1)&& i!=0 && i!=(n-1)||
        							j==(n-1)/2&&i<n-1&&i!=n-1&&i!=0)
                				
                				System.out.print("# ");
                			
                			else
                				System.out.print("  ");
                		}
                		System.out.println();			
         			}
                	break;
                case 'p':
                	//P
                	for(int i=0;i<n;i++)
         			{
                		for(int j=0;j<n;j++)
                		{
                			if(j==0&&i<=(n-1)||
        							i==0&&j<=(n-1)/2||
        							i==(n-1)/2&&j<=(n-1)/2||
        							j==(n-1)/2&&i<=(n-1)/2)
                				
                				System.out.print("# ");
                			
                			else
                				System.out.print("  ");
                		}
                		System.out.println();			
         			}
                	break;
                case 'q':
                	//Q
                	for(int i=0;i<n;i++)
         			{
                		for(int j=0;j<n;j++)
                		{
                			if(i==0&&j<=(n-1)/2||
        							i==(n-1)&&j<=(n-1)/2||
        							j==0&&i<=(n-1)||
        							j==(n-1)/2&&i<(n-1)||
        							i==(n-1)/2 && j>=n/4 && j<=(3*n)/4)
                				
                				System.out.print("# ");
                			
                			else
                				System.out.print("  ");
                		}
                		System.out.println();			
         			}
                	break;
                case 'r':
                	//R
                	for(int i=0;i<n;i++)
         			{
                		for(int j=0;j<n;j++)
                		{
                			if(i==0&&j<=(n-1)/2||
        							j==0&&i<=(n-1)||
        							i==(n-1)/2 &&j<=(n-1)/2||
        							j==(n-1)/2&&i<=(n-1)/2||
        							i-j==(n-1)/2)
                				
                				System.out.print("# ");
                			
                			else
                				System.out.print("  ");
                		}
                		System.out.println();			
         			}
                	break;
                	
                	
                case 's':
                	//S
                	for(int i=0;i<n;i++)
         			{
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
    				System.out.println();
         			}
                    break;
                case 't':
                	//T
                	for(int i=0;i<n;i++)
         			{
                		for(int j=0;j<n;j++)
                		{
                			if(i==0&&j<(n-1)/2||
        							j==n/4&&i<=(n-1))
                				
                				System.out.print("# ");
                			
                			else
                				System.out.print("  ");
                		}
                		System.out.println();			
         			}
                	break;
                case 'u':
                	//U
                	for(int i=0;i<n;i++)
         			{
                		for(int j=0;j<n;j++)
                		{
                			if(j==0&&i<(n-1)||
        							j==(n-1)/2&&i<(n-1)||
        							i==(n-1)&&j<(n-1)/2&&j!=0&&j!=(n-1)/2)
                				
                				System.out.print("# ");
                			
                			else
                				System.out.print("  ");
                		}
                		System.out.println();			
         			}
                	break;
                	
                case 'v':
                	//V
                	for(int i=0;i<n;i++)
         			{
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
                    break;
                case 'w':
                	//W
                	for(int i=0;i<n;i++)
         			{
                		for(int j=0;j<n;j++)
                		{
                			if(j==0&&i<=(n-1)||
        							j==(n-1)&&i<=(n-1)||
        							i==j&&i>=(n-1)/2&&i<=(n-1)||
        							i+j==(n-1)&&i>=(n-1)/2&&i<=(n-1))
                				
                				System.out.print("# ");
                			
                			else
                				System.out.print("  ");
                		}
                		System.out.println();			
         			}
                	break;
                case 'x':
                	//X
                	for(int i=0;i<n;i++)
         			{
                		for(int j=0;j<n;j++)
                		{
                			if(i==j||
        							i+j==n-1)
                				
                				System.out.print("# ");
                			
                			else
                				System.out.print("  ");
                		}
                		System.out.println();			
         			}
                	break;
                case 'y':
                	//Y
                	for(int i=0;i<n;i++)
         			{
                		for(int j=0;j<n;j++)
                		{
                			if(i==j&&i>=0&&i<=(n-1)/2||
        							i+j==n-1&&i>=0&&i<=(n-1)/2||
        							j==(n-1)/2&&i>=(n-1)/2&&i<=(n-1))
                				
                				System.out.print("# ");
                			
                			else
                				System.out.print("  ");
                		}
                		System.out.println();			
         			}
                	break;
                case 'z':
                	//Z
                	for(int i=0;i<n;i++)
         			{
                		for(int j=0;j<n;j++)
                		{
                			if(i==0&&j<=(n-1)||
        							i==(n-1)&&j<=(n-1)||
        							i+j==n-1)
                				
                				System.out.print("# ");
                			
                			else
                				System.out.print("  ");
                		}
                		System.out.println();			
         			}
                	break;
                	
                default:
                    System.out.println("Pattern not available for the letter: " + letter);
            }
            System.out.println();
		}
	}
}
