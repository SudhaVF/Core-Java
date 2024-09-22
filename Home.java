public class Home{
	public static void main(String[] args)
	{
		System.out.println("Start");
		try{
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