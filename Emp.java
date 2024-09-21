class Emp
{
	String name;
	String country;
	{
		this.country="India";
		System.out.println(this.country);
	}
	Emp(String n)
	{
		this.name=n;
		System.out.println(this.name);
	}
	public static void main(String[] args)
	{
		Emp E1=new Emp("Sudha");
		Emp E2=new Emp("Prajakta");
		
	}
}
