package Day5_LiveSession;

import java.util.Scanner;

//WAP to count total number of vowels in the given string
//a,e,i,o,u----A,E,I,O,U
//operators
//conditions
//loops
public class question2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the string 1 : ");		
		String s1 = sc.nextLine();
		int count =0;
		for(int i=0;i<s1.length();i++) {
			char c = s1.charAt(i);
			if(c=='a'||c=='A'||
					c=='e'||c=='E'||
					c=='i'||c=='I'||
					c=='o'||c=='O'||
					c=='u'||c=='U') 
			{
				count++;				
			}
		}
		System.out.println(count);
	}

}
