//Abstraction

package abstraction;
abstract class Switch
{
	abstract void switchOn();
	abstract void switchOff();
}
public class Bulb extends Switch
{
	void switchOn()
	{
		System.out.println("Bulb On");
	}
	void switchOff()
	{
		System.out.println("Bulb Off");
	}
	public static void main(String[] args)
	{
		Bulb b1= new Bulb();
		b1.switchOn();
		b1.switchOff();
	}
}