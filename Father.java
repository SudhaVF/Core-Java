//INHERITANCE

class Father
{
	int money=10000;
	void bike()
	{
		System.out.println("Use my bike");
	}
	void car()
	{
		System.out.println("Use my car");
	}
	void house()
	{
		System.out.println("Use my house");
	}
}
public class Son extends Father
{
	public static void main(String[] args)
	{
		Son s1=new Son();
		s1.bike();
		s1.car();
		s1.house();
		System.out.println(s1.money);
		System.out.println(s1.bike);
		System.out.println(s1.car);
		System.out.println(s1.house);
	}
}
		