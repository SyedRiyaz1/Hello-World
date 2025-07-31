package test;

public class StringReverse_Palindrome 
{

	public static void main(String[] args) 
	{
		String str="MOM MADAM";
		String st= " " ;
		for(int i=str.length()-1;i>=0;i--)
		{
		st=st+str.charAt(i)	;
		}
		System.out.println(st);

	}

}
