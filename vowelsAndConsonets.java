package test;

public class vowelsAndConsonets {

	public static void main(String[] args) 
	{
		String str="RiyazInamdAr".toLowerCase();
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			switch( ch[i])
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				System.out.println(ch[i]+": vowels is");
				break ;
			    default:
				System.out.println(ch[i]+" :consonant");
			}
		}

	}

}
