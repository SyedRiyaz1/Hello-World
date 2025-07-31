package test;

import java.util.regex.*;

public class StringANdNumber
{
  public static void main(String[] args) 
  {
	String str= "riyaz9481538032inamdar" ;
	Pattern p= Pattern.compile("[0-9]");
	Matcher m=p.matcher(str);
	while(m.find())
	{
		String st=m.group();
		System.out.print(st);
	}
} 
}
