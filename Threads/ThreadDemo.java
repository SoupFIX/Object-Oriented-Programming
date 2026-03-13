class ThreadDemo
{
	public static void main(String args [])
	{
		Thread t = Thread.currentThread();
		System.out.println("Current Thread : "+ t);
		t.setName("MY OWN THREAD!");
		System.out.println(t);
		t.setPriority(10);
		System.out.println(t);
		
		try
		{
			for(int i=0;i<10;i++)
			{
				System.out.println("Main Thread : "+i);
				Thread.sleep(300);
			}	
		}
		catch(InterruptedException e)
		{
			System.out.println("Thread Got interrupted!");
		}
	}
}