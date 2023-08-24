package Day5_LiveSession;
import java.util.*;

//WAP to check if string is palindrome or not
public class question1 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string 1 : ");		
		String s1 = sc.next();
		
		String s2 = "";
		
//		s1.length()-----> total length of string
//		ex: s1 = RAMA : 0-R 1-A 2-M 3-A
//		s1.length() ---->4
		
		
		for(int i= s1.length()-1;i>=0;i--)
		{
			s2 = s2 + s1.charAt(i);
		}
		
		if(s1.equalsIgnoreCase(s2)==true) 
		{
			System.out.println("Palindrome");
		}
		else 
		{
			System.out.println("Not a Palindrome");
		}
		
	}

}
