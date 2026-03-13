class X implements Runnable
{
 Thread t;
 X()
 {
	 t = new Thread(this,"DEmoThread");
 }
 public void run()
 {
	try
	{
		for(int i=0;i<=10;i++)
		{
			System.out.println(i);
			Thread.sleep(500);
		}
	}
	catch(InterruptedException e)
	{
		System.out.println(e);
	}
 }
}
class testing
{   public static void main(String args[])
	{
	X x1 = new X();
	X x2 = new X();
	X x3 = new X();
	x1.t.start();
	x2.t.start();
	x3.t.start();
     try{
		 for(int i=0;i<=5;i++)
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