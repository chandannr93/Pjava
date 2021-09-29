package practice_Strings;

import java.util.LinkedHashSet;

public class RemoveTheDuplicateCharFromTheGivenString {

	public static void main(String[] args) {
		String s="killer";
//Create a set collection and add all the characters in the given String
		 LinkedHashSet<Character>  set = new LinkedHashSet<Character>();
		 for (int i =0; i<s.length();i++)
		 {
			 set.add(s.charAt(i));
		 }
//To print by maintaining the insertion order
		 for (Character ch : set) {
			System.out.print(ch);
		}
//to print without maintaining the insertion order
		//System.out.println(set);
	}

}
