package test;

public class fibonaciSeries {

	public static void main(String[] args)
	{
		int x=0;int y=1;
		int z=0;
		int num=10;
		System.out.println(x +"   "+y);
		do
		{
		x=y;
		y=z;
		z=x+y;
		System.out.println(z);
		}
		while((x+y)<=num);
		

	}

}
