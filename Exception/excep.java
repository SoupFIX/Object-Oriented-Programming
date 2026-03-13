import java.util.Scanner;
class sum
{
public int Div(int b,int c) throws ArithmeticException
	{
		return b/c;
	}
}
public class excep
{	public static void main(String args[])
	{  Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int a = sc.nextInt();
		try
		{   int b,c;
			System.out.println("Enter b : ");
			b =  sc.nextInt();
			System.out.println("Enter c : ");
			c =  sc.nextInt();
		    sum s = new sum();
			int res = s.Div(b,c);
			System.out.println("The result is : " + res);
			if(a==0)
			{
				throw new ArithmeticException("ZERO NOT ALLOWED AS INPUT!");
			}
			else
			{
				System.out.println("YOU ENTERED : "+a);
			}
		}
		catch(ArithmeticException e)
		{
			System.out.println("Exception Caught : "+e.getMessage());
		}
		finally
		{
			System.out.println("Your Code finished Execution."); 	
		}
	}
}