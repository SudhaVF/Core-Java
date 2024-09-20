public class Company
{
	String name;
	String location;
	
	Company(String n,String l)
	{
		this.name=n;
		this.location=l;
	}
	public String toString(){
		return this.name + " " + this.location;
	}
	public static void main(String[] args)
	{
		Company c1=new Company("Wipro","Electronic City");
		Company c2=new Company("Infosys","Hebbal");
		Company c3=new Company("Accenture","Sarjapur-Marathahalli");
		Company c4=new Company("Beasant Technology","BTM Layout");
		Company c5=new Company("Kodnest","Mico Layout");
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
		System.out.println(c5);
	}
}
		