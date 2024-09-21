//Find how many even numbers presnt in an array

public class EvenNumber{
	public static void main(String[] args)
	{
		int [] ar = new int[4];
		ar[0]=4;
		ar[1]=7;
		ar[2]=6;
		ar[3]=10;
		int count =0;
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i]%2==0){
				count++;
			}
		}
				System.out.println("Even Count:"+count);
	}
}