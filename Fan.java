package abstraction;
abstract class Switch
{
	abstract void switchOn();
	abstract void switchOff();
}
public class Fan extends Switch
{
	void switchOn()
	{
		System.out.println("Fan On");
	}
	void switchOff()
	{
		System.out.println("Fan Off");
	}
	public static void main(String[] args)
	{
		Fan f1= new Fan();
		f1.switchOn();
		f1.switchOff();
	}
}