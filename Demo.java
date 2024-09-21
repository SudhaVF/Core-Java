public class Demo
{
	int add(int a,int b,int c)
	{
		return a+b+c;
	}
	int add(int a,int b)
	{
		return a+b;
	}
	public static void main(String[] args)
	{
		Demo d1=new Demo();
		int result=d1.add(10,20,30);
		System.out.println(result);
	}
}