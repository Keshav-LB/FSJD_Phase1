package Day8_LiveSession;

import java.util.Scanner;

//Input: Rohit is the Captain of India
//Output: tihoR si eht niatpaC fo aidnI
public class practise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = sc.nextLine();
		String s1 = "";		//for storing reverse string
		
		//counting total words
		int count=0;
		for(int i=0; i<s.length();i++)
		{
			if(s.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println("Total word count: "+(count+1));
		
		//Reversing the original string
		for(int i= s.length()-1;i>=0;i--)
		{
			s1 = s1 + s.charAt(i);
		}
		System.out.println("Reverese string: "+s1);
		
		//
		String[] s2 = s1.split("\\s+");
		String s3 = "";
		for(int i= s2.length-1;i>=0;i--)
		{
			s3 = s3 + s2[i];
			if(i!=0) {
				s3+=" ";
			}
		}
		System.out.println("Revering string at its own position: "+s3);
		
	}
}
