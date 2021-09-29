package practice_Strings;

public class VowelsInTheString {

	public static void main(String[] args) {
		String s="INDIA";
		for (int i=0; i<s.length();i++)
		{
			if (s.charAt(i)=='a'|| s.charAt(i)=='e'|| s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u' || s.charAt(i)=='A' || s.charAt(i)=='E' || s.charAt(i)=='I' || s.charAt(i)=='O' || s.charAt(i)=='U')
			{
				System.out.println(s.charAt(i));
			}
		}

	}

}
