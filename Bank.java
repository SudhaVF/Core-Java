class InsufficientBal extends RuntimeException
{
}
class serverNotFound extends RuntimeException{
}
public class Bank{
	int bal=10000;
	boolean serverStatus = true;
	
	void withdrawMoney(int x){
		if(serverStatus == true){
			if(x>bal){
				throw new InsufficientBal();
			}
			else{
				System.out.println("Withdraw Successful and your balance is,"+(bal-x));
			}
		}
		else{
			throw new serverNotFound();
		}
	}
	public static void main(String[] args)
	{
		Bank b1 = new Bank();
		b1.withdrawMoney(5000);
	}
}
