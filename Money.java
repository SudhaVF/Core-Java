public class Money{
	public static void main(String[] args)
	{
		System.out.println("Start");
		try{
			int a=10/0;
			System.out.println("Statement1");
			System.out.println("Statement2");
			System.out.println("Statement3");
		}
		catch(ArithmeticException e)
		{
		}
		System.out.println("Ends");
	}
}