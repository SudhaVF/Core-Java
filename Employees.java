public class Employees{
	String name;
	int sal;
	Employees(String n,int s){
		this.name=n;
		this.sal=s;
	}
	String getDetails(){
		return this.name + " " + this.sal ;
	}
	public static void main(String[] args)
	{
		Employees e1 = new Employees("Sudha", 1000);
		Employees e2 = new Employees("Rekha", 2000);
		Employees e3 = new Employees("Prajakta", 3000);
		Employees e4 = new Employees("Sukanya", 4000);
		Employees e5 = new Employees("Soubhagya", 5000);
		
		Employees [] ar=new Employees[5];
		ar[0]=e1;
		ar[1]=e2;
		ar[2]=e3;
		ar[3]=e4;
		ar[4]=e5;
		
		for(int i=0;i<ar.length;i++)
		{
			if(ar[i].sal>3000)
			{
				System.out.println(ar[i].getDetails());
			}
		}
	}
}
		
		
