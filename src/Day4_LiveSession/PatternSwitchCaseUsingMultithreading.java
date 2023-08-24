package Day4_LiveSession;

import java.util.Scanner;

public class PatternSwitchCaseUsingMultithreading {
	static Scanner scanner = new Scanner(System.in);
	static {
		System.out.print("Enter the no. of matrices for pattern printing: ");        
    }
	static int n=scanner.nextInt();
    
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the name which you want to print :  ");
		String name = sc.next();

        for (int i = 0; i < name.length(); i++) {
            char letter = name.charAt(i);

            switch (letter) {
                case 'a':
                    new Thread(() -> {
                        printLetterAPattern();
                    }).start();
                    break;
                case 'b':
                    new Thread(() -> {
                        printLetterBPattern();
                    }).start();
                    break;
                case 'c':
                    new Thread(() -> {
                        printLetterCPattern();
                    }).start();
                    break;
                case 'd':
                    new Thread(() -> {
                        printLetterDPattern();
                    }).start();
                    break;
                case 'e':
                    new Thread(() -> {
                        printLetterEPattern();
                    }).start();
                    break;
                case 'f':
                    new Thread(() -> {
                        printLetterFPattern();
                    }).start();
                    break;
                case 'g':
                    new Thread(() -> {
                        printLetterGPattern();
                    }).start();
                    break;
                case 'h':
                    new Thread(() -> {
                        printLetterHPattern();
                    }).start();
                    break;
                case 'i':
                    new Thread(() -> {
                        printLetterIPattern();
                    }).start();
                    break;
                case 'j':
                    new Thread(() -> {
                        printLetterJPattern();
                    }).start();
                    break;
                case 'k':
                    new Thread(() -> {
                        printLetterKPattern();
                    }).start();
                    break;
                case 'l':
                    new Thread(() -> {
                        printLetterLPattern();
                    }).start();
                    break;
                case 'm':
                    new Thread(() -> {
                        printLetterMPattern();
                    }).start();
                    break;
                case 'n':
                    new Thread(() -> {
                        printLetterNPattern();
                    }).start();
                    break;
                case 'o':
                    new Thread(() -> {
                        printLetterOPattern();
                    }).start();
                    break;
                case 'p':
                    new Thread(() -> {
                        printLetterPPattern();
                    }).start();
                    break;
                case 'q':
                    new Thread(() -> {
                        printLetterQPattern();
                    }).start();
                    break;
                case 'r':
                    new Thread(() -> {
                        printLetterRPattern();
                    }).start();
                    break;
                case 's':
                    new Thread(() -> {
                        printLetterSPattern();
                    }).start();
                    break;
                case 't':
                    new Thread(() -> {
                        printLetterTPattern();
                    }).start();
                    break;
                case 'u':
                    new Thread(() -> {
                        printLetterUPattern();
                    }).start();
                    break;
                case 'v':
                    new Thread(() -> {
                        printLetterVPattern();
                    }).start();
                    break;
                case 'w':
                    new Thread(() -> {
                        printLetterWPattern();
                    }).start();
                    break;
                case 'x':
                    new Thread(() -> {
                        printLetterXPattern();
                    }).start();
                    break;
                case 'y':
                    new Thread(() -> {
                        printLetterYPattern();
                    }).start();
                    break;
                case 'z':
                    new Thread(() -> {
                        printLetterZPattern();
                    }).start();
                    break;
                default:
                    System.out.println("Pattern not available for the letter: " + letter);
            }

            try {
                Thread.sleep(1000); // Sleep for 1000 milliseconds before processing the next letter
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
	}
        sc.close();

}
	
	private static void printLetterAPattern() {
    	System.out.println("");
    	System.out.println("");
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
        
    }
	private static void printLetterBPattern() {
    	System.out.println("");
    	System.out.println("");
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
    	
    }
	private static void printLetterCPattern() {
    	System.out.println("");
    	System.out.println("");
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
    	
    }
	private static void printLetterDPattern() {
    	System.out.println("");
    	System.out.println("");
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
    	
    }
	

    private static void printLetterEPattern() {
    	System.out.println("");
    	System.out.println("");
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
        
    }
	private static void printLetterFPattern() {
    	System.out.println("");
    	System.out.println("");
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
    	
    }
	private static void printLetterGPattern() {
    	System.out.println("");
    	System.out.println("");
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
    	
    }

    private static void printLetterHPattern() {
    	System.out.println("");
    	System.out.println("");
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
        
    }
	private static void printLetterIPattern() {
    	System.out.println("");
    	System.out.println("");
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
    	
    }
	private static void printLetterJPattern() {
    	System.out.println("");
    	System.out.println("");
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
    	
    }

    private static void printLetterKPattern() {
    	System.out.println("");
    	System.out.println("");
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
        
    }
	private static void printLetterLPattern() {
    	System.out.println("");
    	System.out.println("");
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
    	
    }
	private static void printLetterMPattern() {
    	System.out.println("");
    	System.out.println("");
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
    	
    }
	
	private static void printLetterNPattern() {
    	System.out.println("");
    	System.out.println("");
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
    	
    }
	private static void printLetterOPattern() {
    	System.out.println("");
    	System.out.println("");
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
    	
    }
	private static void printLetterPPattern() {
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
    	
    }
	private static void printLetterQPattern() {
    	System.out.println("");
    	System.out.println("");
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
    	
    }
	private static void printLetterRPattern() {
    	System.out.println("");
    	System.out.println("");
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
    	
    }

    private static void printLetterSPattern() {
    	System.out.println("");
    	System.out.println("");
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
       
    }
	private static void printLetterTPattern() {
    	System.out.println("");
    	System.out.println("");
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
    
    }
	private static void printLetterUPattern() {
    	System.out.println("");
    	System.out.println("");
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
    	
    }

    private static void printLetterVPattern() {
    	System.out.println("");
    	System.out.println("");
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
        
    }
	private static void printLetterWPattern() {
    	System.out.println("");
    	System.out.println("");
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
    	
    }
	private static void printLetterXPattern() {
		System.out.println("");
    	System.out.println("");
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
    	
    }
	private static void printLetterYPattern() {
    	System.out.println("");
    	System.out.println("");
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
    	
    }
	private static void printLetterZPattern() {
    	System.out.println("");
    	System.out.println("");//Z
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
    	
    }
}




