public class Food
{
	String base;
	String topping1;
	String topping2;
	String topping3;
	
	Food(String b)
	{
		System.out.println("15");
	}
	Food(String b,String t1)
	{
		System.out.println("115");
	}
	Food(String b,String t1,String t2)
	{
		System.out.println("215");
	}
	public static void main(String[] args)
	{
		Food f1=new Food("Chapati","Kajukari");
	}
}
		
