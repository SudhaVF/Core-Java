public class Paper{
	public static void main(String[] args){
		System.out.println("Start");
		try{
			int ar[] = new int[-9];
		}
		catch(NegativeArraySizeException e)
		{
			System.out.println("Negative Array Handled");
		}
		System.out.println("End");
	}
}