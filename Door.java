import java.lang.reflect.Method;

public class Door{
	void m1(){
	}
	public static void main(String[] args)
	{
		Door d=new Door();
		Class c =d.getClass();
		Method [] ar=c.getDeclaredMethods();
		
		for(int i=0;i<ar.length;i++)
		{
			System.out.println(ar[i]);
		}
	}
	
}