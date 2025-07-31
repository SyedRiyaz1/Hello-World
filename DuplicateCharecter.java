package test;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharecter {

	public static void main(String[] args) 
	{
		String st= "RiyazinamdarNArona".toLowerCase();
		 char ch[]= st.toCharArray();
		 Map<Character,Integer> hp= new HashMap<>();
		for(Character c:ch)
		{
			if(hp.containsKey(c))
			{
				hp.put(c, hp.get(c)+1);	
			}
			else
			{
				hp.put(c, 1);
			}
		} 
		for(Character c:hp.keySet())
		{
			if(hp.get(c)>1)
			{
				System.out.println(c+" :Occurance of :"+ hp.get(c));
			}
		}

	}

}
