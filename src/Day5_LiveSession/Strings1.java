package Day5_LiveSession;
/*
 * String in java:
 * -->String is a inbuilt class in java
 * -->Strings in java does not end with a null character.
 * -->String in java is categorized into 2 parts:
 * --------1.Mutable Strings :String that cannot be changed once created 
 * 				String Buffer and String Builder
 * --------2.Immutable: String Class
  	
  	--> Strings can be represented as :
    --> Literal
      				String s1 = "Ramayana";
    --> Object
      				String s1 = new String("Ramayana");
      
 */
//immutable Strings
//program to compare the contents of 2 strings using 
// 1. equals()
//2. equalsIgnoreCase()
//3. compareTo()


import java.util.*;
public class Strings1 {
	/*
	 * making method as static will make the method to be called without creating the object
	 */
			static void compareFunction1(String s1, String s2)
			{
				//Compare strings considering the cases
				if(s1.equals(s2)==true)
				{
					System.out.println("Strings are equal");
				}
				else
					System.out.println("String are not equal");
			}
			static void compareFunction2(String s1, String s2)
			{
				//Compare strings without considering the cases
				if(s1.equalsIgnoreCase(s2)==true)
				{
					System.out.println("Strings are equal");
				}
				else
					System.out.println("String are not equal");
			}
			static void compareFunction3(String s1, String s2)
			{
				//Compare strings based on ASCII
				if(s1.compareTo(s2)==0)
				{
					System.out.println("Strings are equal");
				}
				else
					System.out.println("String are not equal");
			}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter String 1");
		String s1 = sc.next();
		System.out.println("Enter String 2");
		String s2 = sc.next();
		
		compareFunction1(s1, s2);
		compareFunction2(s1, s2);
		compareFunction3(s1, s2);
		
	}

}
