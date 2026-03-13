//To print which thread is working at present
class thread_dem 
{
	public static void main(String args [])
	{
		Thread t = new Thread();
		System.out.println("Current Thread is  :"+t.currentThread());
	    t.setName("Holiday Countdown Started");
		System.out.println(t.getName() + t.isAlive());
		try
		{
			for(int i=0;i<5;i++)
			{
				System.out.println(i);
				t.sleep(200);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("AN interruption Occured!");
		}
	}
}