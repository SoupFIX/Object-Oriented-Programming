class newthread extends Thread
{
	newthread()
	{
		super("DEMO THREAD!");
		System.out.println("Child Thread!"+this);
	}
	public void run()
	{
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("Child Thread"+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		
	}
}
class thread_test
{
	public static void main(String args[])
	{
		newthread n = new newthread();
		n.start();
        try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("Main Thread"+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}

