import java.util.Scanner;
import java.lang.String;
class check_palindrome
{
	public static void main(String args[])
	{   
	    Scanner sc = new Scanner(System.in);
	    String a;
		System.out.println("Enter the String 1 : ");
	    a = sc.nextLine();
		int len = a.length();
		int k = 0;
	    for(int i=0;i<(len/2);i++)
		{
			for(int j=(len-1);j>(len/2);j--)
			{
				if(a[i]!=a[j])
				{
					System.out.println("The String" + a + " is not a Palindrome!");
				    k=1;
					break;
				}
			}
		}
		if(k!=1)
		{
			System.out.println("The String :" + a + "is a Palindrome.");
		}
	}
}
