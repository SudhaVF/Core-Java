class youCantVote extends RuntimeException{
}
public class Voting
{
	void canIVote(int age)
	{
		if(age<18)
		{
			throw new youCantVote();
		}
		else{
			System.out.println("You Can Vote");
		}
	}
	public static void main(String[] args)
	{
		Voting v1 = new Voting();
		v1.canIVote(22);
	}
}
