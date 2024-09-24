package encapsulation;
public class Student1
{
	private String name;
	private int grade;
	private int age;
	
	public void setName(String n)
	{
		this.name=n;
	}
	public void setGrade(int g)
	{
		if(grade>0)
		{
			
			this.grade=g;
		}
		else{
			System.out.println("Invalid grade");
		}
	}
	public void setAge(int a)
	{
		if(a>0&&a<100)
		{	
			this.age=a;
		}
		else{
			
			System.out.println("Invalid Age");
			}
	}
	public String getName()
	{
		return this.name;
	}
	public int getGrade()
	{
		return this.grade;
	}
	public int getAge()
	{
		return this.age;
	}
	
}
class Test2{
	public static void main(String[] args)
	{
		Student1 S1=new Student1();
		S1.setName("Sudha");
		System.out.println(S1.getName());
		
		S1.setAge(22);
		System.out.println(S1.getAge());
	}
}
	