import java.util.Scanner;
class new_throw
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		try
		{
			if(a==0)
			{
				throw new ArithmeticException("ERROR ZERO IS NOT ACCEPTED TO BE ENTERED!");
			}
            else
			{
				System.out.println("The Number entered"+a);
			}				
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Occured!"+e);
		}
	}
}