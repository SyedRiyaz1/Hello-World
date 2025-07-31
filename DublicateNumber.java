package test;

import java.util.HashMap;
import java.util.Map;

public class DublicateNumber {

	public static void main(String[] args)
	{
		int ar[] = {0,1,1,2,3,2,4,3,4,5,4,0};
		
		Map<Integer,Integer> hp= new HashMap<Integer,Integer>();
		for(Integer c:ar )
		{
			if(hp.containsKey(c))
			{
				hp.put(c,hp.get(c)+1);
			}
			else
			{
				hp.put(c, 1);
			}
		}
       for(Integer c:hp.keySet())
       {
    	   if(hp.get(c)>1)
    	   {
    		   System.out.println(c+": occurance:"+hp.get(c));
    	   }
       }

	}

}
