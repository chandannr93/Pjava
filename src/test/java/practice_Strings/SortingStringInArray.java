package practice_Strings;

public class SortingStringInArray {

	public static void main(String[] args) {
		String s[] = {"hi","bye","how","are","you"};
		for (int i=0;i<s.length;i++)//s.length means 4 here each word has one index value
		{//here it will select hi 
			for (int j=i+1;j<s.length;j++)
			{// here loop will compare hi with other values 
				if(s[i].compareTo(s[j])>0) //before if (s[i]>s[j])
				{
					String temp =s[i];
					s[i] = s[j];
					s[j] = temp;
				}
			}
		}
		for (int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
	}

}
