import java.util.Scanner;
class basic
{
	public static void main(String args[])
	{   int w  = Integer.parseInt(args[1]);
		int a  = args.length;
		try
		{ 
		 int d = 15/a;
		 System.out.print("Inside by block");
		}
		catch(ArithmeticException e)
		{
			System.out.println("Divide by Zero Error!");
		}
	}
}