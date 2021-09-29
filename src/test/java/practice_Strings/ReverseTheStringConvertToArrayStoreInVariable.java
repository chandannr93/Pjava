package practice_Strings;

public class ReverseTheStringConvertToArrayStoreInVariable {
public static void main(String[] args) {
	String s="india";
	String rev = "";
	char[]c=s.toCharArray();
	int count =0;
	for (char ch : c) {
		count++;
	}
	System.out.println(count);
	for ( int i=count-1;i>=0;i--)
	{
		rev = rev + s.charAt(i);
	}
	System.out.print(rev);
	
}
}
