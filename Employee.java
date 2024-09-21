class Employee
{
	String firstName;
	String lastName;
	int age;
	long mobileNo;
	String location;
	
	public static void main(String[] args)
	{
		Employee E1=new Employee();
		E1.firstName = "Sudha";
		E1.lastName="Fadi";
		E1.age=25;
		E1.mobileNo=8618640680L;
		E1.location = "Belagavi";
		
		Employee E2=new Employee();
		E2.firstName = "Rekha";
		E2.lastName="Garadimani";
		E2.age=23;
		E2.mobileNo=8614567235L;
		E2.location = "Ramadurg";
		
		Employee E3=new Employee();
		E3.firstName = "Prajakta";
		E3.lastName="Pawar";
		E3.age=24;
		E3.mobileNo=9663709145L;
		E3.location = "Athani";
		
		System.out.println(E1.firstName);
		System.out.println(E1.lastName);
		System.out.println(E1.age);
		System.out.println(E1.mobileNo);
		System.out.println(E1.location);
		
		System.out.println(E2.firstName);
		System.out.println(E2.lastName);
		System.out.println(E2.age);
		System.out.println(E2.mobileNo);
		System.out.println(E2.location);
		
		System.out.println(E3.firstName);
		System.out.println(E3.lastName);
		System.out.println(E3.age);
		System.out.println(E3.mobileNo);
		System.out.println(E3.location);
	}
}
		
		
	