package test;

public class Reverse_PalindromeNumber {

	public static void main(String[] args) 
	{
		int num=12345;
		int rev=0;
		int dem;
		while(num>0)
		{
			dem= num%10;
			rev= rev*10+dem;
			num=num/10;
		}
		System.out.println(rev);


	}

}
