import java.lang.reflect.Constructor;
public class Computer{
	void m1(){
	}
	public static void main(String[] args)
	{
		Computer s=new Computer();
		Class c =s.getClass();
		Constructor [] ar=c.getConstructors();
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
	
}