import java.io.*;
class basics 
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream fin = new FileInputStream("Chill.txt");
		int d;
		do
		{
			if((d=fin.read())!=-1)
			{
				System.out.print((char)d);
			}
		}while(d!=-1);
	}
}
