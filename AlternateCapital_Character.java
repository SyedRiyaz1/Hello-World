package test;

public class AlternateCapital_Character {

	public static void main(String[] args) 
	{
		String st="riyaz inamdar" ;
		char ch[]= st.toCharArray();
		 System.out.println(ch);
      for(int i=0;i<ch.length;i=i+2)
      {
    	  ch[i]=Character.toUpperCase(ch[i]);
      }
      System.out.println(ch);
	}

}
