package test;

public class Swap_Number {

	public static void main(String[] args) 
	{
		int ar[]= {1,3,4,5,9,0,8,2,6,7};
		int temp;
		for(int i=0;i<ar.length;i++)
		{
			for(int j=0;j<ar.length-1;j++)
			{
				if(ar[j]>ar[j+1])
				{
					temp =ar[j];
					ar[j]=ar[j+1];
					ar[j+1]=temp;
				}
			}
		}
		for(int i=0;i<ar.length;i++)
		{
			System.out.print(ar[i]);
		}

	}

}
