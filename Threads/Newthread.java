class thrd implements Runnable
{
	Thread t;
	thrd()
	{
		t = new Thread(this,"DEMO THREAD!");
	}
	public void run()
	{
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println(i+"Counting Days to go home");
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("INterruption Occured!");
		}
	}
}
class Newthread 
{
	public static void main(String args[])
	{
		thrd nt = new thrd();
		nt.t.start();
		try
		{
			nt.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("INterruption Occured!");
		}
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println(i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("INterruption Occured!");
		}
	}
}