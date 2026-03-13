import java.util.Scanner;
class account
{
	int balance;
	account(int balance)
	{
		this.balance = balance;
	}
    void show() throws Exception
    {
		if(this.balance<0)
		{
			throw new ArithmeticException("Balance Can never be negative!");
		}
		else
		{
			System.out.println("Your Current Balance is : " + this.balance);
		}
	}
	
}

class throws_exception
{   public static void main(String args[])
	{
		
		Scanner sc = new Scanner(System.in);
	try
	{
        System.out.println("Enter Current Balance : ");
        int balance = sc.nextInt();		
    	account a = new account(balance);
		a.show();
	}
	catch(ArithmeticException e )
	{
		System.out.println("Negative Balance!"+ e);
	}
	catch(Exception e)
	{
		System.out.println("Negative Balance!"+e);
	}
  }
}