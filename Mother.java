//Up Casting

public class Mother
{
	class Son extends Mother{
	}
		public static void main(String[] args)
		{
			Integer i1 = 50;
			Double d = 25.5;
			Character c = 'c';
			Object ar[]=new Object[3];
			ar[0]=i1;
			ar[1]=d;
			ar[2]=c;
			for(int i=0;i<ar.length;i++)
			{
				System.out.println(ar[i]);
				
			}
		}
}
		