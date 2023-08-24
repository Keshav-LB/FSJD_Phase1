package Day8_LiveSession;

import java.util.*;

public class question1 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		        String sentence = "Rohit is the Captain of India";
		        String[] words = sentence.split(" ");

		        int wordCount = words.length;
		        String[] reversedWords = new String[wordCount];

		        String temp = "";
		        for (int i = sentence.length() - 1; i >= 0; i--) {
		            if (sentence.charAt(i) != ' ') {
		                temp += sentence.charAt(i);
		            } else {
		                reversedWords[wordCount - 1] = reverseString(temp);
		                temp = "";
		                wordCount--;
		            }
		        }
		        reversedWords[0] = reverseString(temp);

		        for (int i = reversedWords.length - 1; i >= 0; i--) {
		            System.out.print(reversedWords[i] + " ");
		        }
		    }

	 public static String reverseString(String word) {
	        StringBuilder reversed = new StringBuilder();
	        for (int i = word.length() - 1; i >= 0; i--) {
	            reversed.append(word.charAt(i));
	        }
	        return reversed.toString();
	    }



	}


