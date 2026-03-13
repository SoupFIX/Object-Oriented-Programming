import java.util.Scanner;
class myexception extends Exception
{
 myexception(String s)
 {
	super(s);
 }	
}

class my_excep 
{   
	public static void main(String args[])
	{
        Scanner sc = new Scanner(System.in);
		System.out.println("Enter a : ");
		int a = sc.nextInt();
		try
		{
			if(a<0)
			{
				throw new myexception("-ve numbers Not Allowed!");
			}
			else
			{
				System.out.println("you entered : "+a);
			}
		}
		catch(myexception e)
		{
			System.out.println("Exception Occured!\n"+e.getMessage());
		}
	}
}