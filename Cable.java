public class Cable{
	public static void main(String[] args){
		System.out.println("Start");
		try{
			int a=10;
			int b=-10;
			int c=a/b;
			int ar[]=new int[c];
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("Arithmetic Handled");
		}
		System.out.println("End");
	}
}
