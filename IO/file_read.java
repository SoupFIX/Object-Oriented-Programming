import java.io.*;

class file_copy 
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream fin = new FileInputStream("trial.txt");
		int d;
		do{
			d = fin.read();
			if(d!=-1)
			{
				System.out.print((char)(d));
			}
		}while(d!=-1);
		int f;
		f = System.in.read();
		System.out.println(f);
	}
} 