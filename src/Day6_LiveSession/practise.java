package Day6_LiveSession;

import java.util.Scanner;

public class practise {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String line: ");
		String s1 = sc.nextLine();
		
		int count=0;
		
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println(count+1);
	}
}
