//calculate all values in an array

public class Addition
{
	public static void main(String[] args)
	{
		int [] ar=new int[5];
		int sum=0;
		ar[0]=10;
		ar[1]=20;
		ar[2]=30;
		ar[3]=40;
		ar[4]=50;
		
		for (int i=0;i< ar.length;i++)
		{
			sum = sum+ar[i];
		}
			System.out.println(sum);
	}
}
