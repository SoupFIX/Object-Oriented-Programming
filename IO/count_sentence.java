import java.io.*;
import java.util.Scanner;
class count_sentence
{
	public static void main(String args[]) throws IOException
	{
		Scanner sc = new Scanner(System.in);
		BufferedReader br = new BufferedReader(new FileReader("trial.txt"));
		int d,count=0;
		do
		{
			d = br.read();
			if(d!=-1)
			{
			 char c = (char)d;
			 if(c == '!'||c == '.'||c == '?')
			 {
			    	count+=1;			
			 }
			}			
		}while(d!=-1);
		System.out.println("The number of sentences in the file is : "+count);
	}
}