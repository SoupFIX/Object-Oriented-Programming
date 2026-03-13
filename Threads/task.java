class Demo implements Runnable
{   Thread t;
	Demo()
	{
		t = new Thread(this,"Demo thread!");
	}
	public void run()
	{  
		   for(int i=1;i<=100;i++)
		  {
			System.out.println(i);
		  } 
	}
}
class c2 implements Runnable
{
	Thread t;
    c2()
	{
		t = new Thread(this,"Demo1 Thread!");
	}
	public void run()
	{
		for(int i=100;i>=1;i--)
		{
			System.out.println(i);
		}
	}
}
class task
{ public static void main(String args[])
	{
	 Demo d = new Demo();
	 d.t.start();
	 c2 c = new c2();
	 c.t.start();
	}
}