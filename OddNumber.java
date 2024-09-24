// Find how many odd number present in an array

public class OddNumber
{
	public static void main(String[] args)
	{
		int [] ar = new int[4];
		ar[0]=2;
		ar[1]=5;
		ar[2]=9;
		ar[3]=4;
		int count =0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==1)
			{
				count++;
			}
		}
		System.out.println("Odd Count:"+count);
	}
}