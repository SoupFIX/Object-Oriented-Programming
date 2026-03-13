class trial_thread implements Runnable
{
	Thread t;
	trial_thread()
	{
		t = new Thread(this,"DEmo Thread!");
	}
	public void run()
	{
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("Child Thread!"+i);
			    Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}
class new_thread
{
	public static void main(String args [])
	{
		trial_thread n = new trial_thread();
		n.t.start();
        try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("Main Thread!"+i);
			    Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}