//Inteface

interface Father
{
	void care();
}
interface Mother
{
	void care();
}
public class Son implements Father,Mother
{
	public void care()
	{
		System.out.println("Father Mother Care");
	}
	public static void main(String[] args)
	{
		Son s1=new Son();
		s1.care();
	}
}