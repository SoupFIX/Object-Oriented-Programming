import java.util.Scanner;
import java.lang.String;
class palindrome
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String a;
		System.out.println("Enter the String : ");
		a = sc.nextLine();
		int len = a.length();
		for(int i=0;i<len/2;i++)
		{
			for(int j = (len-1);j>len/2;j--)
			{
				if(a.charAt(i)!=a.charAt(j))
				{
					System.out.print("IT IS NOT A PALINDROME!");
					break;					
				}
			}
			
		}
		System.out.println("The string is a palindrome!");
	}
}