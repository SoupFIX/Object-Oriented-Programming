import java.io.*;
import java.util.Scanner;
class compare
{
	public static void main(String args[]) throws IOException
	{
		BufferedReader b1 = new BufferedReader(new FileReader("trial.txt"));
		BufferedReader b2 = new BufferedReader(new FileReader("t1.txt"));
		int d,s;
		do
		{
			d = b1.read();
			s = b2.read();
			if(d!=-1&&s!=-1)
			{
			 char a = (char)d;
			 char x = (char)s;
			 String [] word1 = a.split("\\s+");
             String [] word2 = x.split("\\s+");
             int l1 = word1.length();
             int l2 = word2.length();
             for(int i=0;i<l1;i++)
			 {
				 if(word1[i].compareTo(word2[i])==0)
			     {
					 continue;
				 }
                 else
                 {
					 System.out.println("The Files are not same!");
				 }					 
			 }				 
			}			
		}while(d!=-1);
	}
}