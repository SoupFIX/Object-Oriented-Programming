class Q
{
 int n;
 boolean setvalue = false;
 synchronized int get()
 { 
	//consumer
	while(!setvalue)
	try
	{
		wait();
	}
	catch(InterruptedException e)
	{
		System.out.println(e);
	}
    System.out.println("GOT : "+ n);
	setvalue = true;
	notify();
    return n;	
 }
 synchronized void put(int n)
 {
	//producer
	while(setvalue)
	this.n = n;
	System.out.println("PUT : "+ n);
	try{
		wait();
	}
	catch(InterruptedException e)
	{
		System.out.println(e);
	}
 }
}

class producer implements Runnable
{
	Q q;
	Thread t;
    producer(Q q)
	{
		t = new Thread(this,"PRODUCER");
		this.q = q;
	}
    public void run()
    {
		int i=0;
		while(true)
		{
			q.put(i++);
		}	
	}	
}

class consumer implements Runnable
{
	Q q;
	Thread t;
	consumer(Q q)
	{
		t = new Thread(this,"Consumer");
		this.q = q;
	}
	public void run()
	{
		while(true)
		{
			q.get();
		}
	}
}

class sync 
{
public static void main(String args [])
{
	Q q = new Q();
	producer p = new producer(q);
	consumer c = new consumer(q);
	p.t.start();
	c.t.start();
}	
}