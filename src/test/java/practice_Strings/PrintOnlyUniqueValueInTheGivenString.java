package practice_Strings;

import java.util.LinkedHashSet;

public class PrintOnlyUniqueValueInTheGivenString {

	public static void main(String[] args) {
		String s="killer";
//Step01: Create a Set Collection and add all the characters of the given string.
//To maintain order of insertion we use LinkedHash Set
				 LinkedHashSet<Character>  set = new LinkedHashSet<Character>();
				 for (int i =0; i<s.length();i++)
				 {
					 set.add(s.charAt(i));
				 }
//Step02: Compare each character of the set with all the characters of the given string
				 for (Character ch : set) {
					 int count =0;
					 for (int i=0;i<s.length();i++)
					 {
						 if (ch==s.charAt(i))
						 {
//Step03: If the given character is matching increment the count variable
							 count++;					
						 }
					 }
//Step04: Print the char and it's respective count
//to remove duplicates using equality operator by comparision.
					 if (count==1)
					 {					 
					 System.out.print(ch);		
					 }
	}
}
}
