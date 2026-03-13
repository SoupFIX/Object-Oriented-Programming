class X implements Runnable
{
	Thread t;
	X()
	{
		t = new Thread(this,"Demo thread");
	}
	synchronized public void run()
	{
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("Thread : "+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}

class test_multi
{
	public static void main(String args[])
	{
		X m1 = new X();
		X m2 = new X();
		X m3 = new X();
		m1.t.start();
		m2.t.start();
		m3.t.start();
		try
		{
			m1.t.join();
			m2.t.join();
			m3.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	    try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("Main Thread : "+i);
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
	}
}