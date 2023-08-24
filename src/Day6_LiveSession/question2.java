package Day6_LiveSession;
//WAP to count total no. of word in the given string
//ex: Hi good morning
//o/p: 3

import java.util.*;
public class question2 {
	public static int countWords(String s) {
        s = s.trim();
        if (s.isEmpty()) {return 0; }
        String[] words = s.split("\\s+");
        return words.length;
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);		
		String s = sc.next();
	    int wordCount = countWords(s);
	    System.out.println("Number of words: " + wordCount);
	}
}
