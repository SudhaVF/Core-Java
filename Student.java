class Information
{
	Information()
	{
		super();
		System.out.println("Information");
	}
	{
		System.out.println("Information Block");
	}
}
class Student extends Information
{
	Student()
	{
		super();
		System.out.println("Student");
	}
	{
		System.out.println("Student Block");
	}
	public static void main(String[] args)
	{
		Student s1 = new Student();
	}
}


