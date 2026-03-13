import java.io.*;
class file_copy 
{
   public static void main(String args[]) throws IOException
   {
	   int d;
	   try
	   {
	   FileInputStream fis = new FileInputStream("trial.txt");
	   FileOutputStream fout = new FileOutputStream("t1.txt");
	   do
	   {
		   d = fis.read();
		   if(d!=-1)
		   {
			   fout.write((char)d);
		   }
	   }while(d!=-1);
	   }catch(FileNotFoundException e)
	   {
		   System.out.println("File Is NoT Available!");
	   }
	     }
}