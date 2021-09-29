package generalpractice;

public class SumOfDigitInSingleDigit_02 {

	public static void main(String[] args) {
		int n = 7895;
		
		while (n>9)
		{
			int sum =0;
			while (n>0)
			{
				int dg = n%10;
				sum = sum+dg;
				n = n/10;
			}
			n=sum;
		}
		System.out.println(n);
	}
}
