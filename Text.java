public class Text{
	public static void main(String[] args){
		System.out.println("Start");
		try{
			int a=10;
			int b=0;
			int c=a/b;
			int ar[]=new int[c];
		}
		catch(ArithmeticException e)
		{
			System.out.println("Arithmetic Handled");
		}
		System.out.println("End");
	}
}
