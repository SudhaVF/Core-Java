class Test
{
	static{
		System.out.println("Static Blocks");
	}
	{
		System.out.println("Non-Static Blocks");
	}
	public static void main(String[] args)
	{
		Test t1=new Test();
		Test t2=new Test();
	}
}
