package Day5_LiveSession;

import java.util.Scanner;

public class Strings2 {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String 1: ");
		String s1 = sc.next();
		System.out.println("Enter String 2: ");
		String s2 = sc.next();
		
		//s1.concat(s2);		//Immutable
		s1 = s1.concat(s2);		//By forcing
		System.out.println(s1);
		
		
	}

}
