class Home
{
	Home(int x)
	{
		super();
		System.out.println("Home");
	}
}
class Room extends Home{
	Room()
	{
		super(100);
		System.out.println("Room");
	}
	public static void main (String[] args)
	{
		Room r1 = new Room();
	}
}