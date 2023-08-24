package Day2_LiveSession;

public class practise {

	public static void main(String[] args) {
		System.out.println("----------------------");
		System.out.println("code2");
		System.out.println("----------------------");
		for(int i = 1; i<=5; i++) 
		{
			for	(int j=1; j<=5;j++) 
			{
				System.out.print(i);
			}
			System.out.println();
		}
		
		
		
		System.out.println("----------------------");
		System.out.println("code3");
		System.out.println("----------------------");
		for(int i = 1; i<=5; i++) 
		{
			for	(int j=1; j<=5;j++) 
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
		
		System.out.println("----------------------");
		System.out.println("code4");
		System.out.println("----------------------");
		int count=1;
		for(int i = 1; i<=5; i++) 
		{
			for	(int j=1; j<=5;j++) 
			{
				System.out.print(count + "	");
				count++;
			}
			System.out.println();
		}
		
		System.out.println("----------------------");
		System.out.println("code5");
		System.out.println("----------------------");
		
		for(int i = 1; i<=5; i++) 
		{
			for	(int j=1; j<=i;j++) 
			{
				System.out.print(i);
				
			}
			System.out.println();
		}
		
		System.out.println("----------------------");
		System.out.println("code6");
		System.out.println("----------------------");
		
		for(int i = 1; i<=5; i++) 
		{
			for	(int j=1; j<=5;j++) 
			{
				System.out.print("#");
				
			}
			for	(int j=1; j<=5;j++) 
			{
				System.out.print("@");
				
			}
			System.out.println();
		}
	}

}
