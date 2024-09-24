//Down Casting

public class School{

	public class Department extends School{
	
		void m1()
		{
			System.out.println("Department");
		}
	}
	
	public static void main(String[] args)
	{
		School s1 = new School();
		Department d1 = s1.new Department();
		d1.m1();
	}
}

