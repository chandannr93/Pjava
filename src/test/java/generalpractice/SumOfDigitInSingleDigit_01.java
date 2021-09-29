package generalpractice;

public class SumOfDigitInSingleDigit_01 {

	public static void main(String[] args) {	
		int n=789;
		int sum=0;
		while (n>0)
		{
			int dig=n%10;
			sum = sum+dig;
			n=n/10;
		}
		if (sum>9)
		{
			n = sum;
			sum = 0;
			while (n>0) {
				int dig = n%10;
				sum = sum+dig;
				n = n/10;
			}
		}
System.out.println(sum);
	}

}
