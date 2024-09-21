public class Daughter
{
	String name;
	Daughter(String n)
	{
		this.name=n;
	}
	public boolean equals(Object obj)
	{
		Daughter d1=(Daughter) obj;
		String n1=this.name;
		String n2=d1.name;
		return n1==n2;
	}
	public static void main(String[] args)
	{
		Daughter d1=new Daughter("Sudha");
		Daughter d2=new Daughter("Sudha");
		System.out.println(d1.equals(d2));
	}
}
		