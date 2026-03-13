import java.util.Scanner;
class NegativeNumberException extends Exception
{
  NegativeNumberException(String s)
  {
	super(s);  
  }
}

class Method
{
 Method()
 {
   System.out.println("Welcome to the Method class : ");	 
 }
 static int n;
 static void ProcessInput() 
 {
	Scanner sc = new Scanner(System.in);
	try
	{
	  System.out.println("Enter the number : ");
	  n = sc.nextInt();
	  if(n<0)
	  {
		throw new NegativeNumberException("HI IT IS NOT POSSIBle");  
	  }
	  else
	  {
		  System.out.println("You Entered : " + n);
	  }
	}
	catch(NegativeNumberException e)
	{
		System.out.println("Exception occurred : NegativeNumberException: number should be positive");
	}
 }
}
class Negative
{
	public static void main(String args[])
	{
	Method.ProcessInput();
	}
}