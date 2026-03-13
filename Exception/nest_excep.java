import java.util.Scanner;
class nest_excep
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int [] a = new int[5];
		try
		{
			a[6] = 34;
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Indexing out of range error!");
		}
		try
		{  
		   System.out.println("Enter the value of a : ");
		   int r = sc.nextInt();
			int d = 13/r;
			try
			{
			   if(r==1)
			   {
				int x = 34/(r-1);
			   }
			}
			catch(ArithmeticException e)
			{
				System.out.println("Arithmetic ERROR!");
			}
		}
		catch(Exception e)
		{
			System.out.println("ERROR!");
		}
	}
}